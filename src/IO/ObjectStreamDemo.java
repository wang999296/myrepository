package IO;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        read();
//        write();
    }
//序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Develop\\myrepository\\oos.txt"));

        Student3 s = new Student3("林青霞",30);

        oos.writeObject(s);
        oos.close();

    }
//反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Develop\\myrepository\\oos.txt"));

        Object o = ois.readObject();
        Student3 s = (Student3) o;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
