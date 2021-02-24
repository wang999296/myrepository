package IO;

import java.io.*;

public class CopyjavaDemo04 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\ConversionStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\copy.java"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
