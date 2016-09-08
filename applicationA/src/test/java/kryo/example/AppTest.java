package kryo.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import de.javakaffee.kryoserializers.ArraysAsListSerializer;
import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer;
import kryo.application.model.*;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.objenesis.strategy.SerializingInstantiatorStrategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void writeToApplicationB() throws FileNotFoundException {
        Kryo kryo = new Kryo();
        kryo.addDefaultSerializer(DateTime.class, new JodaDateTimeSerializer());
        kryo.register(Arrays.asList("").getClass(), new ArraysAsListSerializer());
        kryo.setInstantiatorStrategy(new Kryo.DefaultInstantiatorStrategy(new SerializingInstantiatorStrategy()));

        Supplier supplier = new Supplier();
        supplier.setId("120442");
        supplier.setVersion(1);
        supplier.setActive(true);
        supplier.setName("DEMUTH MÁQUINAS INDUSTRIAIS");
        supplier.setTradingName("DEMUTH MÁQUINAS INDUSTRIAIS");
        supplier.setNature(NatureType.LegalEntity);
        supplier.setCountry(new Country());
        supplier.getCountry().setName("Brazil");
        supplier.getCountry().setShortISO("BR");
        supplier.setCreated(new DateTime(1463746461558L));
        supplier.setUpdated(new DateTime(1463890676378L));
        supplier.setDocuments(new ArrayList<Document>());

        Document document = new Document();
        document.setValue("87550505000108");
        document.setType(new DocumentType(NatureType.LegalEntity, "CNPJ"));
        document.setMain(true);
        supplier.getDocuments().add(document);

        supplier.setAddresses(new ArrayList<Address>());
        supplier.setCodes(new ArrayList<Code>());
        supplier.setContacts(new ArrayList<Contact>());

        Output output = new Output(new FileOutputStream("../file.bin"));
        kryo.writeObject(output, supplier);
        output.close();

        Input input = new Input(new FileInputStream("../file.bin"));
        Supplier supplierReaded = kryo.readObject(input, Supplier.class);
        input.close();

        Assert.assertNotNull(supplierReaded);
        Assert.assertEquals(supplier, supplierReaded);
    }
}
