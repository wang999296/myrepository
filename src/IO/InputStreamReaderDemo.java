package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Develop\\myrepository\\osw.txt"));

//        一次读一个字符数据
//        int ch;
//        while ((ch=isr.read())!=-1){
//            System.out.print((char)ch);
//        }

//      一次读一个字符数组数据
        char[] ch = new char[1024];
        int len;
        while ((len=isr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }

        //释放资源
        isr.close();
    }
}
