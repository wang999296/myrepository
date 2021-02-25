package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Develop\\myrepository\\oos.txt"));

        Object o = ois.readObject();
        Student3 s = (Student3)o;
        System.out.println(s.getName()+","+s.getAge());

        ois.close();
    }
}
