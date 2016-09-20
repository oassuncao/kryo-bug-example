package kryo.application.model;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.factories.SerializerFactory;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Silvio Assunção
 * @since #
 */
public class CompatibleFieldAnnotationSerializer<T> extends CompatibleFieldSerializer<T> {
// ------------------------------ FIELDS ------------------------------

    private final Set<Class<? extends Annotation>> marked;
    private final boolean disregarding;

// --------------------------- CONSTRUCTORS ---------------------------

    public CompatibleFieldAnnotationSerializer(final Kryo kryo,
                                               final Class<?> type,
                                               final Collection<Class<? extends Annotation>> marked,
                                               final boolean disregarding) {
        super(kryo, type);
        this.disregarding = disregarding;
        this.marked = new HashSet<>(marked);
        rebuildCachedFields();
    }

    @Override
    protected void rebuildCachedFields() {
        // In order to avoid rebuilding the cached fields twice, the super constructor's call
        // to this method will be suppressed. This can be done by a simple check of the initialization
        // state of a property of this subclass.
        if (marked == null) {
            return;
        }
        super.rebuildCachedFields();
        removeFields();
    }

    private void removeFields() {
        final CachedField<?>[] cachedFields = getFields();

        for (final CachedField<?> cachedField : cachedFields) {
            final Field field = cachedField.getField();
            if (isRemove(field))
                super.removeField(field.getName());
        }
    }

    private boolean isRemove(final Field field) {
        return !isMarked(field) ^ disregarding;
    }

    private boolean isMarked(final Field field) {
        for (final Annotation annotation : field.getDeclaredAnnotations()) {
            final Class<? extends Annotation> annotationType = annotation.annotationType();
            if (marked.contains(annotationType)) {
                return true;
            }
        }
        return false;
    }

// -------------------------- INNER CLASSES --------------------------

    public static class Factory implements SerializerFactory {
        private final Collection<Class<? extends Annotation>> marked;
        private final boolean disregarding;

        public Factory(Collection<Class<? extends Annotation>> marked, boolean disregarding) {
            this.marked = marked;
            this.disregarding = disregarding;
        }

        @Override
        public Serializer makeSerializer(Kryo kryo, Class<?> type) {
            return new CompatibleFieldAnnotationSerializer<>(kryo, type, marked, disregarding);
        }
    }
}