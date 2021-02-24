package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Develop\\myrepository\\Students.txt"));
        ArrayList<Student> array = new ArrayList<Student>();

        String line;
        while ((line=br.readLine())!=null){
            String[] strArray = line.split(",");

            Student s = new Student();

            s.setSid(strArray[2]);
            s.setName(strArray[0]);
            s.setAge(Integer.parseInt(strArray[1]));
            s.setAddress(strArray[3]);

            array.add(s);
        }
        br.close();
        for (Student s : array){
            System.out.println(s.getSid()+","+s.getName() + ","+s.getAge() + ","+s.getAddress());
        }
    }
}
