package jdk.myLambda.L5;
/*
    Lambda表达式的省略模式
 */
public class LambdaDemo {
    public static void main(String[] args) {
        useFlyable(s -> System.out.println(s));

        useAddable((x,y)->x+y);
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
