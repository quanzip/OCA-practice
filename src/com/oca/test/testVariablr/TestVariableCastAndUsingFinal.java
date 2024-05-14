package com.oca.test.testVariablr;

/*
* Gán BIến X  cho biến  Y  với X và Y đều nhỏ hơn INT (vế phải chỉ có X, không phải combination)
* thì Kết quả luôn có kiểu >= X (vế phải), Nếu có lỗi có thể:
*  fix: Thêm cast về giá trị Y (vế trái) hoặc thêm final vào X lúc khai báo
*  để compiler biết giá trị của X có hợp lệ hya không khi gán cho Y vì lúc đó Y được réolve luôn tại cômiler-time
*
* Nếu  vế phải: X > int; thì chỉ còn 1 cách fix đó là casting, không thể thêm final và vế phải X
* */

public class TestVariableCastAndUsingFinal {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5; // upcasting: not require cast
        double d = 6.6F;  // upcasting: not require cast
        // s = i; // invalid because i is int > short of s (fix: cast or using FINAL for i to let compiler know i is still in range of short, now compiler dont know if i might change its value or not so it can not be assigned for s)
        s = b;  // valid because b is byte < short of s

        // so if we want to assign var 1 for var 2 then var 2 must >= var 1;

        //s = s + b; // error because every combination of which <= int for both will return int type
        i = s + b;
        i = i + s + b; // valid because all elements are <= int type so result is int

//        l = l + i;
//        i = l; // invalid because long > int (fix: cast to int, CAN NOT SOLVE BY USING FINAL FOR L BECAUSE l is long > int so there is only done rule left: casting)
        l = i;

//        l = f;  // invalid because result will be float (more precision) (fix: cast, can not use final for float because float is bigger than int)
        f = l;  // ok becasue l is less precision than f;

        d = f;
        f = d; // invalid becasue result will be double, (fix: cast, can not use final for float f)

        d = l;
        l = d; // invalid because d > l so result is double: d


    }
}
