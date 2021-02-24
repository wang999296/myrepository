package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
//        创建ArrayList集合
        ArrayList<String> array =new ArrayList<String>();

//        在集合中存储字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");

//        创建字符缓冲流输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Develop\\myrepository\\array.txt"));

//        遍历字符串，得到每一个字符串数据
        for (String s : array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
//        释放资源
        bw.close();
    }
}
