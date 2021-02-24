package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayDemo {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\array.txt"));

        ArrayList<String> array = new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        br.close();

        for (String s : array){
            System.out.println(s);
        }
    }
}
