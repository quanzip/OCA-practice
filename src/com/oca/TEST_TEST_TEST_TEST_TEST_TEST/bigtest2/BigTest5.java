package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import javafx.util.converter.IntegerStringConverter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


abstract class Traveller {
    void travel(String place){}
}

abstract class BeachTraveller extends Traveller {
//    void travel(String place) throws Exception{} // error: Con k throw nhieu hon cha
    abstract public void travel(String place);
}

class Parent {
     int var = 1000; // Line n1

    int getVar() {
        return var;
    }
}

class Child extends Parent {
//    private int var = 2000; // Line n2

    int getVar() {
        super.var  =2034;
        return super.var; //Line n3
    }
}


abstract class Pri {
//    private abstract void show(); error:  private not accmpany with abstract
}

 interface Moveable {
    void move();
}

//Animal.java

 abstract class Animal {
    void move() throws RuntimeException {
        System.out.println("ANIMAL MOVING");

        Child child = new Child();
        child.var = 93;
    }
}

//Dog.java

 class Dog extends Animal implements Moveable {
     @Override  // Bắt bược phải implement lại pt này
     public void move() {

     }
 }


interface D {
    public int m  =10;

    default public int show(){
        System.out.println("parent");
        return m;
    }
}
class Dc implements D {
    public int m = 22;
    public int show(){
        System.out.println("middle");
        return m;
    }

    private static void m1(String m) throws SQLException{
        try {
            if (m.isEmpty()) {
                throw new SQLException();
            }
        } catch (RuntimeException e) {
            throw e; // Jvm biết đây sẽ chỉ là Sql ex chứ ko phải Ex nên trên method signature chỉ cần khai sqlEX
            // nếu trong try throw thêm loại exception khác thì catch cũng sẽ phải khai thêm đó
            // nhưng hiện tại đang để là exception EXX nên đã cover được hết,
            // nhưng jvm vẫn biết rõ nếu re-throw EXX trong catch thì sẽ là throw các exception trong try là gồm các excpeion nhỏ, nên method signature chỉ cần khai các ex nhỏ
        }
    }

    private static void m2(String m) throws SQLException, FileNotFoundException {  // có thể thay thế bừng exception thì chỉ cần 1
        try {
            if (m.isEmpty()) {
                throw new SQLException();
            } else throw new FileNotFoundException();
        } catch (RuntimeException e) {
            throw e;    //  khi đã khai trên signature thì việc xử lý ở đây ko cần nữa
        }
    }

    private static void m3(String m) throws FileNotFoundException {  // có thể thay thế bừng exception thì chỉ cần 1
        try {
            if (m.isEmpty()) {
                throw new SQLException();
            } else throw new FileNotFoundException();
        } catch (SQLException e) {
            // ở đây chỉ bắt sqlEx vẫn thiếu FileNotFoundEx nhưng vẫn ok vì đã khai fileNotFoundEx trên signature để văng ra ngoài, bên ngoài sẽ xử lý.
            // nếu trên method signature không khai FileNotfoundẼx thì sẽ phải khai báo fileNotFoundEx ở đây để handle, có thể để SqlEx | FileNotFoundEx ex
            // đây là chia sẻ việc xử lý ex, 1 cho catch, 1 cho method signature
        }
    }

    Dc() throws Exception {
//        int  i = 10;
//        short s = i;
        System.out.println("probably throw sqlEx");
    }

    Dc(String name) {
        System.out.println("Constructor with name");
    }

    public final static void main(String... args) {

    }

}

class Dm extends Dc {
    public int m = 223;
    Dm() throws Exception{  // khoong tthe throw ex nho hon cha

    }

    public int show(){
        System.out.println("child");
//        byte b = 23849;  // errror
//        b = 2934032;// error
        return m;
    }
}

public class BigTest5 {
    public static void main(String[] args) throws Exception {
        D d = new Dc();
        System.out.println(d.m);
        System.out.println(((Dc)d).m); // using m of dc
        ((Dc)d).show()  ;

        D d1 = new Dc();
        System.out.println(d1.equals(d));

        Dc dc = new Dm();
        System.out.println(dc.m + ":" + dc.show());

        String t = null;
        System.out.println(t);  // ok print null
//        System.out.println(args[1]);  // array indexOutOfBoundEx
//        t.replace(string/char search, string/char replacement); sẽ replace tất cả các đoạn trùng khớp, muốn replace 1 đoạn đầu tiên thì dùng replace first
        List f= new ArrayList();
        f.add("String");
        f.add(345);
        f.add(new Object());
        System.out.println(f);
        UnaryOperator unaryOperator = b -> String.valueOf(b);
        f.replaceAll(unaryOperator); // thay thế tấy cả các phần tử trong mảng thành 1 gias tri moi, cuxng kieu vs kieu cu
        System.out.println(f);

        String text = null;
        text = text + text; //Line n1
        System.out.println(text);   // ok, print nullnull

        List<Integer> integerList = new ArrayList<>();
//        integerList.add('d');   error, chi chap nhan wrapper type va primitive type
    }
    /*

    *
*
* package com.udayankhattry.oca;

public interface Shrinkable {
    public static void shrinkPercentage() {
        System.out.println("80%");
    }
}

//AntMan.java
package com.udayankhattry.oca;

public class AntMan implements Shrinkable { }

//Test.java
package com.udayankhattry.oca;

public class Test {
    public static void main(String[] args) {
        AntMan.shrinkPercentage();
    }
}
*
*
*   int x = 5____0;
2. int y = ____50;
3. int z = 50____;
4. float f = 123.76_86f;
5. double d = 1_2_3_4;
*
*
*  boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
        *
        *
        * List<Integer> list = new ArrayList<>();
        byte b = 10;
        list.add(b); //Line n1
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
        *
        *
        * class Square {
    int length;
    Square sq;

    Square(int length) {
        this.length = length;
    }

    void setInner(Square sq) {
        this.sq = sq;
    }

    int getLength() {
        return this.length;
    }
}

public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4
    }
}

*
*   private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }
    }

*
* String[] arr = { "L", "I", "V", "E" }; //Line n1
        int i = -2;

        if (i++ == -1) { //Line n2
            arr[-(--i)] = "F"; //Line n3
        } else if (--i == -2) { //Line n4
            arr[-++i] = "O"; //Line n5
        }

        for(String s : arr) {
            System.out.print(s);
        }
        *
        *
        *
        * interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
    public static void log() {
        System.out.println("Log");
    }
}

class MyLogger extends Log implements ILog {}
*
*
* boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2);
        *
        *
        *  List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(list);
        *
        *
        * int[][] arr = new int[x][y]; //Line n1
        arr[1][4] = 100;
        arr[6][6] = 200;
        arr[3][6] = 300;
        * try with final int[][] arr = new int[x][y]; //Line n1
        *
        *
        *   Sub sub = null;
        System.out.println(sub.name); //Line n3
        *
        *
        * import java.util.*;

class Father {}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Super {
    abstract List<Father> get();
}

class Sub extends Super {
    /*INSERT

    1. List<Father> get() {return null;}
2. ArrayList<Father> get() {return null;}
3. List<Son> get() {return null;}
4. ArrayList<Son> get() {return null;}
5. List<GrandSon> get() {return null;}
6. ArrayList<GrandSon> get() {return null;}
7. List<Object> get() {return null;}
8. ArrayList<Object> get() {return null;}

      StringBuilder sb = new StringBuilder("TOMATO");
        System.out.println(sb.reverse().replace("O", "A")); //Line n1


  boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;

        System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1
        System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2


javac Test.java
java Test "James Gosling" "Bill Joy"

      */
}

class RunMissed {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true)); //
        System.out.println(flag);
        List<Integer> list = new ArrayList<>();
        byte b = 10;
        long b1 = 10;
        int t =10;
//        list.add(b); //Error
//        list.add(b1); //Error
        list.add(t); // ok
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
    }
}

interface ILogger {
    void log();
}

class Test1 {
    public static void main(String[] args) {
        ILogger[] loggers = new ILogger[2]; //Line n1
        for (ILogger logger : loggers)
            logger.log(); //Line n2 // null pe
    }
}


 interface Shrinkable {
    int t = 10;
    public static void shrinkPercentage() {
        System.out.println("80%");
    }
}
//AntMan.java
 class AntMan implements Shrinkable { }
//Test.java
 class Test2 {
    public static void main(String[] args) {
//        AntMan.shrinkPercentage(); // failed, Không thể gọi trực tiếp static method của cha thông qua tên class con
        System.out.println(AntMan.t); // Gọi thuộc tính thì ok

//        int x = ____0;  // eror
        int y = 1____50;
//        int z = 50____;   // eror
        float f = 123.76_86f;
//        float f = 123.76_86_f;    // eror
        double d = 1__2_3_4;
        // -> Không được sử dụng _ ở đầu hoặc cuối, xung quanh dấu chấm, xung quanh ké hiệu kiểu (f, d, l)
    }
}

class Square {
    int length;
    Square sq;

    Square(int length) {
        this.length = length;
    }

    void setInner(Square sq) {
        this.sq = sq;
    }

    int getLength() {
        return this.length;
    }
}

 class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4 // ok
    }}

class testss {
    private static void availableSeats() throws SQLException {
//        throw null; //Line 7   Null PE
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }


        String[] arr = { "L", "I", "V", "E" }; //Line n1
        int i = -2;

        if (i++ == -1) { //Line n2
            arr[-(--i)] = "F"; //Line n3
        } else if (--i == -2) { //Line n4
            arr[-++i] = "O"; //Line n5
        }

        for(String s : arr) {
            System.out.print(s);
        }
    }
}

interface ILog {
    default void log() {
        System.out.println("ILog");
    }

    default void log1() {
        log(); // ok
        System.out.println("ILog");
    }
}

abstract class Log{
    public static void log() {
        System.out.println("ILog");
    }
}

class MyLogger  {
    public static void main(String[] args) {
//        Log l = new Log(); // khoong the khoi tao abstract class

//        MyLogger myLogger = new MyLogger(); // error when run: special
//        myLogger.log();


        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 + "dsf+ "+ flag2); // true / false


        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4 // ko xóa được gf
        System.out.println(list);
    }

}

