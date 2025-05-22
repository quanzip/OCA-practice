package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestCloneApi {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Part> parts = new ArrayList<>();
        Part quan = new Part("Quan");
        parts.add(quan);
        parts.add(new Part("Toan"));
        parts.add(new Part("Thu"));
        parts.add(new Part("Tuan"));
        List<Part> cloneList = (ArrayList<Part>) parts.clone();
        cloneList.get(0).name = "Hello";

        System.out.println(parts);
        System.out.println(cloneList);

        cloneList.remove(0);

        System.out.println(parts);
        System.out.println(cloneList);

        quan.clone();
    }
}

// Phải implement interface này thì mới có thể gọi phương thức override clone() thành công, nếu không sẽ báo lỗi ex.
class Part implements Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Part("Cloned");
    }

    String name;
    Part(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                '}';
    }
}