package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.QUESTION;

public class COnstructorr {
    public static void main(String[] args) {

    }
}

// Khi kế thừa kiểu khác. chỉ cần gọi 1 trong các phương thức khởi tạo của cha. nếu cha khai báo cụ thể. Nếu cha không khai cụ thể cons nào, thì không cần, JVm tự làm cho
class Dog extends Animal {

    public Dog(String name, String kind) {
        super(name, kind);
    }
}

class Animal {
    String name;
    String find;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String find) {
        this.name = name;
        this.find = find;
    }
}