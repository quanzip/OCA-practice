package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai5 {
    public static void main(String[] args) {
        int []i = {1,2,2};
        System.out.println(i.getClass());
        System.out.println("isPrimitive " + i.getClass().isPrimitive());
        System.out.println("isAssignableFrom " + i.getClass().isAssignableFrom(Integer.class));
        System.out.println("isArray " + i.getClass().isArray());
        System.out.println("isSynthetic " + i.getClass().isSynthetic());
        System.out.println("isInstance " + i.getClass().isInstance(i));

        Object[] o = {new Bai5(), new Bai1()};
        System.out.println("isInstance " + o.getClass().isInstance(o));
        System.out.println("isArray " + o.getClass().isArray());

        Object[][]o1 = {{new Bai1()}};

        System.out.println("isArray " + o1.getClass().isArray());
    }
}
