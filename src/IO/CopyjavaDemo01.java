package IO;

import java.io.*;

public class CopyjavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Develop\\myrepository\\ConversionStreamDemo.java"));
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("C:\\Develop\\myrepository\\copy.java"));

        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }
        isr.close();
        osw.close();
    }
}
