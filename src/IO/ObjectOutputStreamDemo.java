package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Develop\\myrepository\\oos.txt"));

        Student3 s =new Student3("林青霞",30);

        oos.writeObject(s);

        oos.close();

    }
}
