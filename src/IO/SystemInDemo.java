package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args)throws IOException {
//        InputStream is = System.in;
////
////        int by;
////        while ((by=is.read())!=-1){
////            System.out.println((char)by);
////        }
//
////        如何把字节流转换成字符流?转换流
//        InputStreamReader isr = new InputStreamReader(is);
//
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String line = br.readLine();
        System.out.println("你输入的字符串是"+line);

        System.out.println("请输入一个整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是"+i);

        Scanner sc = new Scanner(System.in);


    }
}
