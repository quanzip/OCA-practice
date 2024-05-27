package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.testVariablr;

/*
* Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
*
* Tên biến có thể bắt đầu bằng 5 loại: 3 loại tiền, $, euro,bảng, dấu _ và chữ cái, tính cả các chữ cái lating utf-8
* ĐỘ dài tên biến không giới hạn và không được trùng với từ khóa trong java, Phân biệt hoa thường (case sensitive)
*
* Kiểu nhỏ nhất khi cộng 2 kiểu khác nhau từ INT trở xuống sẽ là INT, vd: short + byte, char + int, short + int, char + byte
* Khi cộng 2 kiểu lớn hơn int va không có dấu => Kết quả là kiểu lớn nhất, (long + <short | char | byte | int>) = long
* */


public class TestVariableByMathOperation {
    public static void main(String[] args) {
        short s = 1;
        byte b = 2;
        char c = 'a';

        // resolve at compile time, all the others are not resolve at conpile-time.;
        final double d = 1.4;
        final long l =4; // auto upcast
        final int i = 3;
        float f = (float) 3.5; // need casting (double is default)

        final int l1 = (int) 3L;  // downcast require casting

        final int m;
        final Shoe shoe;

        m = 3;
        shoe = new Shoe();

        // int intDouble = i + d; // error  => result is bigger type.  fix: change result to double or cast them to INT.
        System.out.println(i + d);
        int fix = (int) (i + d);
        double intDouble = i + d;

        //int intFloat = i + f;  // error => result will belong to bigger type(long), fix: cast for change result type to long.
        System.out.println(i + f);
        float intFloat = i + f;

        int intShort = i + s; // valid because int > short so result will be int;
        int maxIntShort = Integer.MAX_VALUE + Short.MAX_VALUE; // Invalid because max int + short  = long, result will turn to minus
        System.out.println(maxIntShort);

//        byte byteShort = b + s;  // invalid because byte + short = int // change result type to int or cast to byte
        int byteShort = b + s;
        System.out.println(byteShort);

        float floatLong = f + l; // valid because result will be type that are higher precision (Độ chính xác cao hơn)
        double doubleLong = d + l; // valid because result type will be double (Độ chính xác cao hơn)
        // long longFloat = f + l; // invalid because long is less precision than float so result type is float, so to double

        // short shortChar = s + c; // invalid because minimal type for combination is INT;
        // => Kiểu nhỏ nhất khi cộng 2 kiểu khác nhau (<= INT) là INT

        // int longChar = l + c;   // invalid because result will be bigger type (long)
        int intChar = i + c;  // valid because minimal type of combination type (both <=int) = INT;
//        long longFloat = l *f; // invalid because float is more precision so result will have type of float.

    }
}

class Shoe {
    String name;
}
