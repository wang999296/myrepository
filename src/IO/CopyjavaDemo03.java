package IO;

import java.io.*;

public class CopyjavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\ConversionStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\copy2.java"));

        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        br.close();
        bw.close();
    }
}
