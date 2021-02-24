package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyjavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Develop\\myrepository\\ConversionStreamDemo.java");
        FileWriter fw = new FileWriter("C:\\Develop\\myrepository\\copy1.java");

//        读写数据，复制文件
        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

//        释放资源
        fr.close();
        fw.close();
    }
}
