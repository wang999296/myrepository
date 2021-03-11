package jdk.myStream.s5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Stream流的收集方法
        R collect​(Collector collector)

    它是通过工具类Collectors提供了具体的收集方式
        public static <T> Collector toList​()：把元素收集到List集合中
        public static <T> Collector toSet​()：把元素收集到Set集合中
        public static Collector toMap​(Function keyMapper,Function valueMapper)：把元素收集到Map集合中
 */
public class CollectDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
