package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.sql.SQLException;

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

    Dc() throws Exception {
        System.out.println("probably throw sqlEx");
    }

    Dc(String name) {
        System.out.println("Constructor with name");
    }


}

class Dm extends Dc {
    public int m = 223;
    Dm() throws Exception{  // khoong tthe throw ex nho hon cha

    }

    public int show(){
        System.out.println("child");
        return m;
    }
}

public class BigTest5 {
    public static void main(String[] args) throws Exception {
        D d = new Dc();
        System.out.println(d.m);
        System.out.println(((Dc)d).m);
        ((Dc)d).show()  ;

        D d1 = new Dc();
        System.out.println(d1.equals(d));

        Dc dc = new Dm();
        System.out.println(dc.m + ":" + dc.show());
    }
    /*
    *  private static void checkData() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            e = null; //Line 10
            throw e; //Line 11
        }
    }

    public static void main(String[] args) {
        try {
            checkData(); //Line 17
        } catch(SQLException e) {
            System.out.println("NOT AVAILABLE");
        }
    }
    *
    *
    * interface ILogger {
    void log();
}

public class Test {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        for(ILogger logger : loggers)
            logger.log(); //Line n2
    }
}
*
*
*
* public static void main(String[] args) {
        args[1] = "Day!";
        System.out.println(args[0] + " " + args[1]);
    }

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



    * */
}
