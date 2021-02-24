package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Develop\\myrepository\\osw.txt"));

//        写一个字符
//        osw.write(97);
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);
//        osw.flush();

//        写入一个字符数组
        char[] chs ={'a','b','c','d'};
//        osw.write(chs);
//        osw.write(chs,0, chs.length);
//        osw.write(chs,1, 3);

//        写一个字符串的一部分
//        osw.write("abcde");
//        osw.write("abcde",0,"abcde".length());
        osw.write("abcde",1,4);
        osw.close();

    }
}
