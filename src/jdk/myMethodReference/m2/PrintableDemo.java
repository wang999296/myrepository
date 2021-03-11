package jdk.myMethodReference.m2;

/*
    需求：
        1:定义一个接口(Printable)：里面定义一个抽象方法：void printInt(int i);
        2:定义一个测试类(PrintableDemo)，在测试类中提供两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法
 */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(i -> System.out.println(i));

        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p){
        p.printInt(999);
    }
}
