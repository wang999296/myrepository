package IO;

public class Student2 {
    private String name;
    private int math;
    private int chinese;
    private int english;

    public Student2() {
    }

    public Student2(String name, int math, int chinese, int english) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public int getsum(){
        return this.chinese+this.english+this.math;
    }
}
