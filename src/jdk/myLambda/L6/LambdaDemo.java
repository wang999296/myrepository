package jdk.myLambda.L6;

/*
    Lambda表达式的注意事项
 */
public class LambdaDemo {
    public static void main(String[] args) {
        useInter(()-> System.out.println("abcdefg"));

        new Thread(()-> System.out.println("Lambda表达式")).start();

    }

    private static void useInter(Inter i) {
        i.show();
    }
}
