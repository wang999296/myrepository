package myNet.net04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP发送数据的步骤
        1:创建客户端的Socket对象(Socket)
        2:获取输出流，写数据
        3:释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",18888);

        OutputStream os =s.getOutputStream();
        os.write("12345,上山打老虎".getBytes());

        s.close();

    }
}
