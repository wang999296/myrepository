package myNet.net09;
import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文本文件，接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("127.0.0.1",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\mynet.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();


        BufferedReader brc = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String a = brc.readLine();
        System.out.println("服务器的反馈：" + a);

        //释放资源
        br.close();
        s.close();
    }
}
