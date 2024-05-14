package com.oca.packageAndImport;


import java.util.Date; // jvm priotype this import
import java.sql.*;   // XXX : Cần phải để dạng wild card thì JVM mới chập nhận. vì wild card thì sẽ không được ưu tiên

//import java.util.Date;
//import java.sql.Date;   // Jvm not allow this because duplicate Class Name

/*
* Jvm se su dung import nao cu the, khoong uu tien wildcard, ex: import java.util.Date;
* */
public class ConflictImport {
    public static void main(String[] args) {
        Date date = new Date();
        // => solve this by delete unused import or using specific name in import. => JVM use specific one

        // không thể sử dụng:
        //import java.util.Date;
        //import java.sql.Date;

        // trường hợp vẫn cần sử dụng Date từ java.sql.Date. thì trong Code phải chỉ rõ cả cây thư mục dẫn đến nó như sau:
        java.sql.Date date1 = new java.sql.Date(293487239); // ok
    }
}
