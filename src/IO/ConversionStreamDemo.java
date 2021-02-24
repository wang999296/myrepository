package IO;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Develop\\myrepository\\fos.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Develop\\myrepository\\fos.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr=new InputStreamReader(new FileInputStream("C:\\Develop\\myrepository\\fos.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }


        isr.close();


    }
}
