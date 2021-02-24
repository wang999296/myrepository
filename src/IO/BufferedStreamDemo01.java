package IO;

import java.io.*;
import java.util.concurrent.BrokenBarrierException;

public class BufferedStreamDemo01 {
    public static void main(String[] args)throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world");
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\bw.txt"));

////        一次读取一个字符数据
//        int ch;
//        while ((ch=br.read())!=-1){
//            System.out.print((char)ch);
//        }

//        一次读取一个字符数组数据
        char[] chs =new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

    }
}
