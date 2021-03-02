package myThread.i10;

import java.util.*;

/*
    线程安全的类：
        StringBuffer
        Vector
        Hashtable
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> array = new ArrayList<String>();

        Hashtable<String,String> ht = new Hashtable<String, String>();
        HashMap<String,String> hm = new HashMap<String, String>();

        List<String> list = Collections.synchronizedList(new ArrayList<String>());


    }
}
