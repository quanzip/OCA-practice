package com.oca.cónition;

/*
* Giá trị truyền vào trong while/dowhile phải là boolean
* */
public class whileDoWhile {
    public static void main(String[] args) {
        int x =1 ;

//        while (x) {} // error because x is not boolean

        while (x == 5) {}// ok

        while (true) {} // ok

//        while(x = 100) // not ok becase this is a statement, not return bool

    }
}
