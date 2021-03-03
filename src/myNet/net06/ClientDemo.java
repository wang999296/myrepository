package myNet.net06;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("127.0.0.1",18888);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
