package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFileDemo {
    public static void main(String[] args) {

    }
//抛出处理
    public static void method1()throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] ch = new char[1024];
        int len;
        while ((len=fr.read())!=-1){
            fw.write(ch,0,len);
        }

        fr.close();
        fw.close();
    }

//    JDK7的改进方案

    public static void method3() {
        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw.txt");){

            char[] ch = new char[1024];
            int len;
            while ((len=fr.read())!=-1){
                fw.write(ch,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

//    JDK9的改进方案
public static void method4()throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
    try (fr;fw){

        char[] ch = new char[1024];
        int len;
        while ((len=fr.read())!=-1){
            fw.write(ch,0,len);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
}


//    try...catch...finally
    public static void method2() {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");

            char[] ch = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(ch, 0, len);
            }
        }catch (IOException e ) {
          e.printStackTrace();
        }finally {
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
