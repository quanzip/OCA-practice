package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.LastTestBox;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        go((String s)-> !!true);
    }

    public static void go(Predicate<String> s) {

    }

   /* import java.util.*;

    class A{}
    class B extends A{}

    abstract class Super {
        abstract List<A> get() throws IndexOutOfBoundsException;
    }

    abstract class Sub extends Super {
        *//*INSERT*//*


public interface Flyable {
    static int horizontalDegree() { //Line n1
        return 20;
    }

    default void fly() {
        System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2


        interface I1 {
    public static void print(String str) {
        System.out.println("I1:" + str.toUpperCase());
    }
}

class C1 implements I1 {
    void print(String str) {
        System.out.println("C1:" + str.toLowerCase());
    }
}


            Given code of Test.java file:
class A {
    public static void main(String [] args) {
        System.out.println("A");
    }
}

class B {
    public static void main(String [] args) {
        System.out.println("B");
    }
}

class C {
    public static void main(String [] args) {
        System.out.println("C");
    }
}

class D {
    public static void main(String [] args) {
        System.out.println("D");
    }
}


 String [] arr = {"1st", "2nd", "3rd", "4th", "5th"};
        String place = "faraway";
        System.out.println(arr[place.indexOf("a", 3)]); //Line n1


        String place = "MISSS";
System.out.println(place.replace("SS", "T"));


 static String str = "KEEP IT "; //Line n1
    public static void main(String[] args) {
        String str = str + "SIMPLE"; //Line n2
        System.out.println(str);
    }


    package com.udayankhattry.oca;

abstract class Log {
    abstract long count(); //Line n1
    abstract Object get(); //Line n2
}

class CommunicationLog extends Log {
    int count() { //Line n3
        return 100;
    }

    String get() { //Line n4
        return "COM-LOG";
    }
}


boolean b1 = 0;
        boolean b2 = 1;
        System.out.println(b1 + b2);


int x = 10; //Line n1
        if (false)
            System.out.println(x); //Line n2
        System.out.println("HELLO"); //Line n3


         StringBuilder sb = new StringBuilder("B"); //Line n1
        sb.append(sb.append("A")); //Line n2
        System.out.println(sb); //Line n3


         String text = "RISE ";
        text = text + (text = "ABOVE ");
        System.out.println(text);


        String str = "Game on"; //Line n1
        StringBuilder sb = new StringBuilder(str); //Line n2

        System.out.println(str.contentEquals(sb)); //Line n3
        System.out.println(sb.contentEquals(str)); //Line n4
        System.out.println(sb.equals(str)); //Line n5
        System.out.println(str.equals(sb)); //Line n6


        //Buyable.java
package com.udayankhattry.oca;

public interface Buyable {
    int salePercentage = 85;

    public static String salePercentage() {
        return salePercentage + "%";
    }
}

//Book.java
package com.udayankhattry.oca;

public class Book implements Buyable {}

//Test.java
package com.udayankhattry.oca;

public class Test {
    public static void main(String[] args) {
        Buyable [] arr = new Buyable[2];
        for(Buyable b : arr) {
            System.out.println(b.salePercentage); //Line n1
            System.out.println(b.salePercentage()); //Line n2
        }

        Book [] books = new Book[2];
        for(Book b : books) {
            System.out.println(b.salePercentage); //Line n3
            System.out.println(b.salePercentage()); //Line n4
        }
    }
}


6. Given code compiles successfully if it is used inside the class named '_emp_'


String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());


         private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (RuntimeException)e;
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(RuntimeException e) {
            System.out.println("RE");
        }
    }


    //I1.java
package com.udayankhattry.oca;

public interface I1 {
    int i = 10;
}

//I2.java
package com.udayankhattry.oca;

public interface I2 {
    int i = 20;
}

//I3.java
package com.udayankhattry.oca;

public interface I3 extends I1, I2 { //Line n1

}


LocalDate date = LocalDate.parse("2020-08-31");
        System.out.println(date.plusMonths(-6));


        int i = 10;
System.out.println(i > 3 != false);


interface Blogger {
    default void blog() throws Exception {
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog() {
        System.out.println("TRAVEL");
    }
}

public class Test {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); //Line n1
        ((TravelBlogger)blogger).blog(); //Line n2
    }
}


public class Test {
    public static void main(String[] args) {
        char c1 = 'a'; //ASCII code of 'a' is 97
        int i1 = c1; //Line n1
        System.out.println(i1); //Line n2
    }


public static void main(String[] args) {
        int score = 30; // Line n1
        char grade = 'F'; // Line n2
        if (50 <= score < 60) // Line n3
            grade = 'D';
        else if (60 <= score < 70) // Line n4
            grade = 'C';
        else if (70 <= score < 80) // Line n5
            grade = 'B';
        else if (score >= 80)
            grade = 'A';
        System.out.println(grade);
    }

    }*/


//    interface Rideable {
//        void ride(String name);
//    }
//
//    class Animal {}
//
//    class Horse extends Animal implements Rideable {
//        public void ride(String name) {
//            System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
//        }
//    }
//
//    public class Test {
//        public static void main(String[] args) {
//            Animal horse = new Horse();
//            /*INSERT*/
//        }
//    }
//
//    Which of the following options, if used to replace /*INSERT*/, will compile successfully and on execution will print EMMA IS RIDING THE HORSE on to the console?
//    Select 4 options.











}
