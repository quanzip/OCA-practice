package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BigTest34 {
    public static void main(String[] args) {
//        LocalTime time = LocalTime.of(23, 60); // invalid, run time ex
//        System.out.println(time);
        System.out.println("DateTime-----------");
        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse("1947-08-15",
                DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date3 = LocalDate.of(1947, 8, 15);
        System.out.println(date1.equals(date2));
        System.out.println(date2.isEqual(date3));
        System.out.println(date3);
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue()); // getMOnth => uppercase all: MARCH, ARPIL
        LocalTime obj = LocalTime.now();
        System.out.println(obj.getHour());// Tinh voi local time => 24h


        System.out.println("Operator------ Đối với float/double");
        System.out.println(23 / 2.0);   // chia chính xác, chia hết, có đủ thập phân,  = 11.5
        System.out.println(23 % 2.0);  // chia lấy dự như bình thuơng, ko có thập phân  = 1.0
        extractInt(2.7);
//        extractInt(Integer.valueOf(23)); // faile vì chỉ nhận wrapper type và primitive của chính nó.
//        extractInt(2); // Error vì param func là wrapper type thì chỉ nhận wrapper type hoặc primative của kiểu đó
        test1((byte) 2); // ok vì là param func là primitive type nên sẽ nhận kiểu wrapper + primitive từ nó về trươcsok   byte < double => ok
        test1('d'); // vì char < double nên  ok

        test((byte) 2); // ok vì là primitive type nên sẽ nhận Short, short và các kiểu primitive < short
//        test(3);  // eror, cần cast vì int > short
        int[] arr1 = {1, 2, 3};
        char[] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
//        arr1 = arr2; // Eror, ép kiểu vẫn errror
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        System.out.println("String--------");
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";  // 3 object này được evalueate compile time, được đưa vào trong pool
        java += world; // phép cộng này từ các biến ko phải , k phải string constant => runtime. tạo object mới là nó
        System.out.println(java == javaworld); // false do 1 ở trong pool, 1 ở heap, == là so sánh địa chỉ tham chiếu.

        System.out.println("List------------------");
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Anew String");
        dryFruits.add("new String");
        dryFruits.add("Anew String");
        for (String dryFruit : dryFruits) {
            if (dryFruit.startsWith("A")) {
//                dryFruits.remove(dryFruit);  //Lỗi ConcurrentModificationException, Để vừa lặp vừa xóa, có thể dùng for(i = list.size(),i --)  hoặc lặp như bình thường, nhưng đến lúc xóa phải giảm i--
            }
        }

//        List<Exception>numbers = new ArrayList<IOException>(); errror, Nếu khai rõ thì phải giống nhau hoặc để trống.
        //

        System.out.println("Exception-----");
        try {
            EE();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void EE() throws IOException {

    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }

    private static void test1(double obj) {
        ;
    }
    private static void test(short obj) {
        ;
    }
//    public static void main(String[] args) {
//        if (args.length > 4);
//        System.out.println();
//
//        LocalTime time = LocalTime.of(23, 60);
//        System.out.println(time);
//
//        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
//        LocalDate date2 = LocalDate.parse("1947-08-15",
//                DateTimeFormatter.ISO_LOCAL_DATE);
//        LocalDate date3 = LocalDate.of(1947, 8, 15);
//
//        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));
//
//        System.out.println( 23 / 2.0 );
//        System.out.println( 23 % 2.0 );
//
//        LocalDate date = LocalDate.of(2068, 4, 15);
//        System.out.println(date.getMonth() + ":" + date.getMonthValue());
//
//        public static void main(String[] args) {
//            extractInt(2.7);
//            extractInt(2);
//        }
//
//        private static void extractInt(Double obj) {
//            System.out.println(obj.intValue());
//
//        }
//
//
//        LocalDate obj = LocalDate.now();
//        System.out.println(obj.getHour());
//
//
//        LocalDate date1 = LocalDate.parse("1980-03-16");
//        LocalDate date2 = LocalDate.parse("1980-03-16");
//        System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
//
//        String s1 = new String("Java"); //Line 3
//        String s2 = "JaVa"; //Line 4
//        String s3 = "JaVa"; //Line 5
//        String s4 = "Java"; //Line 6
//        String s5 = "Java"; //Line 7
//
//        int i = 1; //Line 9
//
//        DateTimeFormatter is defined inside which package?
//
//        String javaworld = "JavaWorld";
//        String java = "Java";
//        String world = "World";
//        java += world;
//        System.out.println(java == javaworld);
//
//
//        Counter c1 = new Counter();
//        Counter c2 = c1;
//        Counter c3 = null;
//        c2.count = 1000;
//
//        int [] arr1 = {1, 2, 3};
//        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
//        arr1 = arr2;
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//
//        for(String dryFruit : dryFruits) {
//            if(dryFruit.startsWith("A")) {
//                dryFruits.remove(dryFruit);
//            }
//        }
//
//        abstract class Animal {}
//    class Dog extends Animal{}
//
//    public class Test {
//        public static void main(String [] args) {
//            List<Animal> list = new ArrayList<Dog>();
//            list.add(0, new Dog());
//            System.out.println(list.size() > 0);
//        }
//    }
//}
//
//abstract class Super {
//    public abstract void m1() throws IOException;
//}
//
//class Sub extends Super {
//    @Override
//    public void m1() throws IOException {
//        throw new FileNotFoundException();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("X");
//        } catch (IOException e) {
//            System.out.print("Y");
//        } finally {
//            System.out.print("Z");
//        }
//    }
}
