package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox10;

public class Bai4 {
    public Integer get(Integer  s) {return 1;}
    public Object get(Object  s) {return 1;} //  called
    public Long get(Long  s) {return 1L;}
    public static void main(String[] args) {
        System.out.println(new Bai4().get("quan"));
        System.out.println(new Bai4().get(new Bai4()));

        int g = 4;
        if (g-->4){   // if (10-->4)  => invalid because 10 must be var like G
            Thử khai báo biến final là đối tượng để xem Object đó được load khi bào vÀ biến final đó được load khi nào
        }
    }
}
