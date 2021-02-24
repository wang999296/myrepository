package IO;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
// 记录开始时间
        long startTime = System.currentTimeMillis();

//        复制视频
//        method1();
//        method2();
//        method3();
        method4();
//        记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时" +(endTime-startTime)+ "毫秒");

    }
//    字节缓冲流，一次读写一个字节数组(共耗时20毫秒)
    public static void method4()throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Develop\\itcast\\123.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Develop\\myrepository\\123.avi"));

        byte[] bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();

}
//    字节缓冲流，一次读写一个字节（共耗时212毫秒）
    public static void method3()throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Develop\\itcast\\123.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Develop\\myrepository\\123.avi"));

        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();

    }
//    基本字节流一次读取一个字节数组(共耗时70毫秒)
    public static void method2()throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\itcast\\123.avi");
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myrepository\\123.avi");
        byte[] bys=new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
}
//    基本字节流一次读写一个字节(共耗时48487毫秒)
    public static void method1()throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Develop\\itcast\\123.avi");
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\myrepository\\123.avi");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
