package myNet.net05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    客户端：发送数据，接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("127.0.0.1",18888);

        //获取输出流，写数据
        OutputStream os =s.getOutputStream();
        os.write("12345，上山打老虎".getBytes());

        //接收服务器反馈
        InputStream is =s.getInputStream();
        byte[] by = new byte[1024];
        int len =is.read(by);
        String s1 =new String(by,0,len);
        System.out.println("客户端:"+s1);
        //释放资源
        s.close();
    }
}
