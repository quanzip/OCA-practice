package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.util.ArrayList;
import java.util.List;

public class SUbLIst {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder("abc").replace(1,2,"234"); // Pt replace luon yc 3 tham so
        List<String> strings = new ArrayList<>();
        strings.add("Quan");
        strings.add("Toan");
        strings.add("Tuan"); // 2
        strings.add("Thu");
        strings.add("Hieu");  // 4
        strings.add("Thao");

        List<String> sub = strings.subList(2,4);
        sub.add("An");   // khi thêm vào sub-list thì list chính cũng được thêm, vào đúng vị trí đó trong portion

        System.out.println("After subList");
        System.out.println(strings);
        System.out.println(sub);

        System.out.println("After clear");
        sub.subList(0,1).clear();  // Cả list chính và subList đều bị bỏ đi 1 giá tri
        System.out.println(strings);
        System.out.println(sub);

        System.out.println("After sỏting ");
        sub.sort(String::compareToIgnoreCase);  // k the dufng list goc sort, sau do print list sub => concurrentEx
        System.out.println(strings);
        System.out.println(sub);  // error: ConcurrentModificationEx


        sub.add("df");
        System.out.println("After remove");
        System.out.println(strings);
        System.out.println(sub);  // Error

        // => Sau khi đã subList thì chỉ nên thay đổi ở subList, không nên dùng list chính
//          => Bất kể thay đổi gì ở subList đều được ánh xạ vào list chính: Thêm, sửa xóa, sắp xếp, primative lẫn Objetc

        System.out.println("STRUCTURE");
        List<Base> bases = new ArrayList<>();
        Base base = new Base();
        bases.add(base);
        Base base1 = new Base();
        base1.name = " Nam";
        bases.add(base1);
        Base base2 = new Base();
        base2.name = "Hoa";
        bases.add(base2);


        List<Base> subList = bases.subList(0, 2);
        subList.subList(0,1).clear();
        System.out.println(bases);
        System.out.println(subList);

        System.out.println("After changing name");
        base1.name = "Long";
        System.out.println(bases);
        System.out.println(subList);
    }
}

class Base {
    String name = "Hello";

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                '}';
    }
}
