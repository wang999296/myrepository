package myNet.net02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据的步骤
        1:创建接收端的Socket对象(DatagramSocket)
        2:创建一个数据包，用于接收数据
        3:调用DatagramSocket对象的方法接收数据
        4:解析数据包，并把数据在控制台显示
        5:关闭接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(18888);

        byte[] by = new byte[1024];
        DatagramPacket dp = new DatagramPacket(by,by.length);

        ds.receive(dp);
        System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
