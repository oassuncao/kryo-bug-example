package kryo.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import kryo.application.model.Country;
import kryo.application.model.Supplier;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void writeToApplicationB() throws FileNotFoundException {
        Kryo kryo = new Kryo();

        Supplier supplier = new Supplier();
        supplier.setName("Name");
        supplier.setCode("Code");
        supplier.setCountry(new Country());
        supplier.getCountry().setCode("Country Code");
        supplier.getCountry().setName("Country Name");

        Output output = new Output(new FileOutputStream("../file.bin"));
        kryo.writeObject(output, supplier);
        output.close();

        Input input = new Input(new FileInputStream("../file.bin"));
        Supplier supplierReaded = kryo.readObject(input, Supplier.class);
        input.close();

        Assert.assertNotNull(supplierReaded);
        Assert.assertEquals(supplier, supplierReaded);
        Assert.assertNotNull(supplierReaded.getCountry());
        Assert.assertEquals(supplier.getCountry(), supplierReaded.getCountry());
    }
}
