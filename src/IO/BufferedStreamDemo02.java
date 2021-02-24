package IO;

import java.io.*;
import java.util.stream.Stream;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\bw.txt"));

        for (int i =0;i<10;i++){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
        bw.close();*/

//        创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Develop\\\\myrepository\\\\bw.txt"));
/*
//      读取第一行数据
        String line = br.readLine();
        System.out.println(line);

//        读取第二行数据
        line = br.readLine();
        System.out.println(line);

//        再多读两次
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/

//        循环改进
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }


        br.close();
    }
}
