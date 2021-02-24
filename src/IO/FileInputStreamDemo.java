package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 一个汉字储存
*       如果是GBK编码占用两个字节
*       如果是UTF-8编码占用三个字节
* */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\myrepository\\a.txt");
//
//        int by;
//        while ((by=fis.read())!=-1){
//            System.out.print((char)by);
//        }
//        fis.close();

//        String s = "abc";
        String s = "中国";//[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes();
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        fis.close();
    }
}
