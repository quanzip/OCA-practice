package com.oca;

public class JavaBasicVariableName {
    // bien trong java co the bat dau bang chu cai, kể cả các chữ cái lating uTF-8, $,€,£ and _, it can not start with digit
    // no limit about number of character in variable name
    // can not use key words for variables name like (while, int, long, for,...)
    // variable are case sensitive, for != For
    public static void main(String[] args) {
        int $a = 1;
        System.out.println($a);

        String €3= "Uero";

        String đ£_22 = "bristish";

        System.out.println(€3);
        System.out.println(đ£_22);
    }
}
