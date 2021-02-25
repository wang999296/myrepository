package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("C:\\Develop\\myrepository\\ts.txt");

////        pw.write("hello");
////        pw.write("\r\n");
////        pw.flush();
////        pw.write("world");
////        pw.flush();
//
//        pw.println("hello");
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        PrintWriter pw = new PrintWriter(new FileWriter("\\Develop\\myrepository\\ts.txt"),true);
        pw.println("hello");
        pw.println("world");

        pw.close();


    }
}
