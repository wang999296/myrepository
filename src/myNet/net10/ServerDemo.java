package myNet.net10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        while (true){
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }

    }
}
