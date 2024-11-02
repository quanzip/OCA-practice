package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.loop;

/*
*  Nếu đưa vào while 1 nếu condition bởi tất cả là các constant (using final) ẽx while (f > 0 || g < 0) f & g đều được khai báo dùng final
*  thì while sẽ định giá trị luôn (resolve value at compile time due to using final) => nếu là false, thì sẽ báo lỗi biên dịch luôn, tương tự với for
*  Nhưng nếu có 1 trong các tham số trong while không phải final, thì compile không lỗi do JVm sẽ chỉ định gía trị được ở run time
*
* - nếu dùng label bởi các lệnh break, continue,... thì {} của lable phải là cha của nơi dùng lệnh, như ví dụ bên dưới,
* */

public class LabelTest {
    public static void main(String[] args) {
        ZIP: for(;getCond();) {
             final boolean f = false;
              boolean g = false;
            while (!f || g) {   // ok because g is not final, but if g is final then compile eror due to valuate at run time
                if (Math.random() > 0.34) break ZIP;
            }
            System.out.println("quan");
        }
        int c  = 0;
        while(c > 0) {
           //  if (c == 0) break ZIP;  // error because {} of lable ZIP are not parent of this block
            System.out.println("asd");
        }
    }

    private static boolean getCond() {
        return false;
    }
}
