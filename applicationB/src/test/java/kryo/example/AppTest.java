package kryo.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import kryo.application.model.Supplier;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void readApplicationA() throws FileNotFoundException {
        Kryo kryo = new Kryo();

        Input input = new Input(new FileInputStream("../file.bin"));
        Supplier supplierReaded = kryo.readObject(input, Supplier.class);
        input.close();

        Assert.assertNotNull(supplierReaded);
    }
}
