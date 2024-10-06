package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.constructor;

// Nếu không khai  constructor nào, JSVM tự tạo ra 1 no-arg constructor và insert 1 dòng đầu tiên vào trong là super()
// Nếu có khai báo constructor (có arg hoặc không) với bất kỳ logic, Jvm tự chen thêm vào body của constructor 1 dòng đầu tiên super() khi biên dịch
// để khi class được khởi tạo, nó sẽ khởi tạo class cha trước (Object), Nếu đã có super() rồi thì thôi.

// JVM chỉ tự động insert constructor nếu không có cái nào được khai báo, nếu đã có bất kỳ (có arg hoặc no-arg) thì JVM sẽ không khai báo thêm
// lúc này JVm chỉ check xe, trong constructor trên đã có super() ở dòng đầu tiên chưa, nếu chưa có thì insert, có rồi thì thôi.
public class Main {

    public static void main(String[] args) {
        Heli heli = new Heli() {
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
    }
}
abstract class Heli {
//    public Heli() {
//
//    }
}