package myNet.net02;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤
        1:创建发送端的Socket对象(DatagramSocket)
        2:创建数据，并把数据打包
        3:调用DatagramSocket对象的方法发送数据
        4:关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket();

        byte[] by ="12345，上山打老虎".getBytes();

        DatagramPacket dp = new DatagramPacket(by,by.length, InetAddress.getByName("127.0.0.1"),18888);

        ds.send(dp);

        ds.close();

    }
}
