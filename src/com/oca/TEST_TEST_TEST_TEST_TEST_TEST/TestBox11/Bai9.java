package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox11;

import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        String s = "quan";
        System.out.println(s.getClass());
        List<String> list =new ArrayList<>();
        System.out.println(list.getClass());

        Integer ii = 10;
        System.out.println(ii.getClass());
        ArrayList arr = new ArrayList();
        System.out.println(arr.getClass());
        Set<Integer> set = new HashSet<>();
        System.out.println(set.getClass());

        Map<Object, Object> map = new TreeMap<>();
        System.out.println(map.getClass());
        Map<Integer, String> map1 = new HashMap<>();
        System.out.println(map1.getClass());

        AA a = new BB(234);
        System.out.println(a.getClass());
        System.out.println("quan + " +a.show());
    }
}

class AA {
    public Object show() { return new Object();}
}

class BB extends AA {
    public String show() {
        System.out.println("BB show");
        return "1";}

    BB (int s) {
        k =s;
    }
    int k;
}