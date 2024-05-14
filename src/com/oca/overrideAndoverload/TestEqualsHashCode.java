package com.oca.overrideAndoverload;

import java.util.Objects;

public class TestEqualsHashCode {
    public static void main(String[] args) {
        Child child = new Child("quan");
        Child child1 = new Child("quan");
        System.out.println(child1 == child);
        System.out.println(child.equals(child1));

        // chúng chỏ đến dùng 1 value
        String s = "q";
        String s1 = "q";
        System.out.println(s == s1);

    }
}

class Child {
    String name;

    public Child(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child)) return false;
        Child child = (Child) o;

        // vì khi 2 đối tượng khai báo đến 1 string, thì chỉ có 1 string ở trong string pool
        // được tạo ra. nên  toán tử == sẽ cho value true;
        return Objects.equals(name, child.name) && name == child.name;
    }



    // đã override Equals, cần override háshcode thì hàm equals so sánh mới chạy đúng
    @Override
    public int hashCode() {
        return 1;
    }
}
