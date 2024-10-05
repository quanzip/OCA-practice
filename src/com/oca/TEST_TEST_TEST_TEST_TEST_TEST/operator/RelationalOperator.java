package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.operator;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println(5.0 == 5);  // true
        System.out.println(5.1 == 5);  // false;
        System.out.println(5.0 == 5L);  // true


        // cac toan tu logic: && ||:
        // important: cac toan tu nay co the break circuit neu 1 ve dau khong thoa man nua
        // se dung evaluate logic neu 1 ve khong thoa man.
         boolean a = false, b  = false;
         boolean c = a && (b = true);
        System.out.println("Logic: " + c); // false    false && ...
        // ====> c = false, b = false, a = false, because  when a is false, it break the circuit, ignore b assignment, same to ||

        // cac toan tu bitwise: & | ^
        // impoertant: cac toan tu nay khong break the circuit ngay ca khi 1 ve dau khong thoa man
        // tiep tuc thuc thi cho het logic, khong cancel khi khong thoa man nua
        int m = 6;
        boolean n = true;
        boolean r = m < 0 & (n = false);
        System.out.println("bitwise &: " + r + ", n:" + n);

        boolean g = true, h = false;
        boolean f = g | (h = true);
        System.out.println("Bitwise |: " + f + ", h:" + h);

        boolean v = g ^ h;    // ^ require 1 only side must be true
        System.out.println("Bitwise ^: " + v);
        System.out.println("Bitwise ^: " + (f ^ r)); // (true ^ false) ==> true;
    }
}
