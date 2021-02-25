package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Develop\\myrepository\\ts.txt");
//写数据
//        ps.write(97);
//使用特有方法写数据
//        ps.print(97);
//        ps.println();
//        ps.print(98);
        ps.println(97);
        ps.println(98);

        ps.close();
    }
}
