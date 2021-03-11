package jdk.myFunctionInterface.f6;

import java.util.function.Function;

/*
    Function<T,R>：常用的两个方法
        R apply​(T t)：将此函数应用于给定的参数
        default <V> Function andThen​(Function after)：返回一个组合函数，首先将该函数应用于输入，然后将after函数应用于结果
        Function<T,R>接口通常用于对参数进行处理，转换(处理逻辑由Lambda表达式实现)，然后返回一个新的值
 */
public class FunctionDemo {
    public static void main(String[] args) {

        convert("100",s -> Integer.parseInt(s));
        convert(100,i -> String.valueOf(i + 566));

        convert("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 566));
    }
    private static void convert(String s, Function<String,Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }


    private static void convert(int i, Function<Integer,String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    private static void convert(String s, Function<String,Integer> fun1, Function<Integer,String> fun2) {
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

}
