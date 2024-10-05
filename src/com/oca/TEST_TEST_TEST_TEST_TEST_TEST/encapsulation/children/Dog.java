package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.encapsulation.children;

import com.oca.TEST_TEST_TEST_TEST_TEST_TEST.encapsulation.parent.Animal;

public class Dog extends Animal {
    // Nếu cha khai báo constructor thì ở đây bắt buộc phải gọi 1 trong số đó,
    // ở dòng đầu tiên, nếu cha không có , không bắt buộc
    public Dog(String name) {
        super("Atlis");
//        super(name, "ok");
    }
}
