package jdk.myMethodReference.m3;

/*
    练习：
        1:定义一个接口(Converter)，里面定义一个抽象方法：
            int convert(String s);
        2:定义一个测试类(ConverterDemo)，在测试类中提供两个方法
            一个方法是：useConverter(Converter c)
            一个方法是主方法，在主方法中调用useConverter方法
 */
public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(s -> Integer.parseInt(s));

        useConverter(Integer::parseInt);
    }
    private static void useConverter(Converter c){
        int number = c.convert("666");
        System.out.println(number);
    }
}
