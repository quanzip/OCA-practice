package com;

public class Spexial {

}

/* Trường hợp này compile ok bởi vì interface và class đang ko có Qh gì,
*
* Nhưng run thì lõi do khi run java mới thấy MyLog đang có 1 static và 1 default giống signature =>
* jvm hiểu đang dùng static method để kế thừa default method => lỗi.
*  */
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
//     Nếu abstract này implement interface thì sẽ lỗi do dùng static method để kế thùa non-static method,  nguọc lại nếu dùng default methof để kế thừa static method thì ok
    public static void log() {
        System.out.println("ILog");
    }
}

class MyLogger{ //  extends Log implements ILog   // Lúc này JVM hiểu MyLogger có cả 2 method trong abstract cláss và interface
    public static void main(String[] args) {
//        Log l = new Log(); // khoong the khoi tao abstract class

//        MyLogger myLogger = new MyLogger();
//        myLogger.log();
    }

}