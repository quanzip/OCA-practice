package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox12;

public class Bai6 {
    public static void main(String[] args) {
        CCC c = new CCC();
//        if (c instanceof BBB) {
//            Cả 2 class cùng implement 1 interface nhưng không thể check ínstance of, lỗi compile, chỉ
//         có thể compile khi chúng trong cây kế thừa trên dưới.
//        }
    }
}

interface MyIface1{};
class AAA {};
class BBB extends AAA implements MyIface1{};
class CCC implements MyIface1{};
