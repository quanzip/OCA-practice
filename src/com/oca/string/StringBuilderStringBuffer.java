package com.oca.string;

public class StringBuilderStringBuffer {
    /*
    * String builder is possible to change value without creating new object in string pool like String Objetc,
    * so if we dont need to change value of String, we prefer using String, if we need to change the value often, we should
    * use String Builder.
    *
    * String builder is not thread-safe, its method are not synconized. (recommended to use)
    *
    * String buffer is thread-safe, its method are synconized.
    * // size khởi tạo của 1 String buffer là 16, nếu length vượt quá, nó sẽ tăng lần dần dần với 16
    * */
    public static void main(String[] args) {
        // we should use Strinrg builder in normal cases.
    }
}
