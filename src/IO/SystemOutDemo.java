package IO;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;
//        ps.print("hello");
//        ps.print(000);

        ps.println("hello");
        ps.println(000);

//        System.out.println();的本质是一个字节输出流
    }
}
