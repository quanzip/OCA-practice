package com.oca.cónition;

public class IfElse {
    public static void main(String[] args) {
        int d = 44;
        boolean a = true;
        if (a = false)
        if (d == 1)
            d++;  // only get executed when a = true && d = 1
            d--;  // always get executed
        System.out.println(d);

        boolean b = true;
        boolean b1 = false;

//        if (b = b1 == true) {
//            System.out.println("Check boolean ok");
//        }    => false because b is assign b1 and got false, so the comparison return false
        
        if (b1 = b == true) {
            System.out.println("Check boolean ok");
        }
        // danglingElse: chúng ta cần vẽ ra cây chuẩn của if-else trước khi trả lời,
    }
}
