package jdk.myFunctionInterface.f5;

import java.util.function.Predicate;

/*
    Predicate<T>：
        default Predicate<T> and​(Predicate other)：返回一个组合判断，对应短路与
        default Predicate<T> or​(Predicate other)：返回一个组合判断，对应短路或
 */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b2);

        boolean b3 = checkString("hello",s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);

        boolean b4 = checkString("helloworld",s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {

        return pre1.or(pre2).test(s);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
