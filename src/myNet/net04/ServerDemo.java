package myNet.net04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤
        1:创建服务器端的Socket对象(ServerSocket)
        2:获取输入流，读数据，并把数据显示在控制台
        3:释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(18888);

        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        String s1 = new String(by, 0, len);


        System.out.println("数据是："+s1);

        ss.close();


    }
}
