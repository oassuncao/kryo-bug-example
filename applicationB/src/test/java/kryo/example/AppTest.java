package kryo.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import de.javakaffee.kryoserializers.ArraysAsListSerializer;
import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer;
import kryo.application.model.CompatibleFieldAnnotationSerializer;
import kryo.application.model.SupplierExtension;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.objenesis.strategy.SerializingInstantiatorStrategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class AppTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void readApplicationA() throws FileNotFoundException {
        Kryo kryo = new Kryo();
        kryo.setDefaultSerializer(new CompatibleFieldAnnotationSerializer.Factory(
                Arrays.asList(JsonIgnore.class, JsonBackReference.class), true));

        kryo.addDefaultSerializer(DateTime.class, new JodaDateTimeSerializer());
        kryo.register(Arrays.asList("").getClass(), new ArraysAsListSerializer());
        kryo.setInstantiatorStrategy(new Kryo.DefaultInstantiatorStrategy(new SerializingInstantiatorStrategy()));

        Input input = new Input(new FileInputStream("../file.bin"));
        SupplierExtension supplierReaded = kryo.readObject(input, SupplierExtension.class);
        input.close();

        Assert.assertNotNull(supplierReaded);
    }
}
