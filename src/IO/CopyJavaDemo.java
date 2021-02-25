package IO;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args)throws IOException {
        /*BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\Student.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\Student1.java"));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\Student.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Develop\\myrepository\\Student1.java"),true);

        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }

        br.close();
        pw.close();
    }
}