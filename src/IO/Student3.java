package IO;

import java.io.Serializable;

public class Student3 implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private transient int age;

    public Student3() {
    }

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    @Override
//    public String toString() {
//        return "Student3{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
