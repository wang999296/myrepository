package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\names.txt"));

        ArrayList<String> array =new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }

        br.close();

        Random r =new Random();
        int i = r.nextInt(array.size());

        String name = array.get(i);

        System.out.println("幸运者是"+name);

    }
}

