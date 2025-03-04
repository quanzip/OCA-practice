package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.switch1;


/*
* Khi sử dụng switch, các giá trị của case phải là final, định giá trị ngay tại compile-time,được
*  nhưng khi khai báo kiểu object - wrapper thì chúng luôn valuate ở run-time => không dùng được Object cho case
* Không dùng được các kiểu: boolran, long, float cho switch, dùng được string
    Các giá trị case được tưj động ép kiểu. và phải nằm trong giải giá trị của switch
    * Nếu các case không có break; thì khi 1 case ở X  khớp, case đó được thực thi và các case phía dưới cũng được thực thi kể cả default {} nếu default nằm dưới case khớp
* * */
public class Main {
    public static void main(String[] args) {
        int t =1;
        switch (getT(t)) {
            case 2: {
                System.out.println("2");
                t = 10;
            }
            case 1: {
                t = t + 1;
                System.out.println("t: " + t);
            }
            case 3: {
                System.out.println("vao" + 3);
                t = 3;
            }
            case 100: {
                System.out.println("100");
                t = 100;
            }
            default: {
                System.out.println("Default");
            }
        }
    }
    static int getT(int i) {
        return i;
    }
}
