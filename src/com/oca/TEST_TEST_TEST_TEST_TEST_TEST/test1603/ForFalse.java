package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.test1603;

// Nếu Cha có cons có tham số => con cần khai báo cons và gọi cons của cha (chỉ cần 1 trong các con của cha)
// Nếu cha không có constructor hoặc chỉ khai constr mặc định thì A kế thừa cha có thể khai cons hoặc không.
public class ForFalse extends Quan {
    ForFalse(String s) {
        super(s);
    }

    public static void main(String[] args) {
        int i, j;
        for (i = 0, j= 0; j < i; ++j, i++) {
            System.out.println(i + " " + i);
        }

        final int h = 0, g = 9;

    }
}


class Quan {
    Quan(String s) {

    }
}