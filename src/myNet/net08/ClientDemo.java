package myNet.net08;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文本文件
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("127.0.0.1",10000);

        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\mynet.txt"));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }
}
