package com.oca;

public class Primatives {

    /*
    * Tất cả các con số trong chương trình java khi được biên dịch về mã máy bằng compiler đều được đánh dấu
    * Java sẽ dùng 1 bit để thể hiện dấu thể hiện bằng 0 và 1.
    *
    * Bit đầu tiên bên trái của giá trị số sẽ thể hiện dấu, 0 là dương và 1 là âm,
    *  vd: 00010011 = +19 vì 0010011 = 19 và có bit đầu tiên là 0 => số dương
    *
    * important
    * Có 2^7 negative values và 2^7 positive values với kiểu byte,trị
    *  1 byte = 8bit => kiểu byte có thể hiển thị 2^8 giá trị (256 giá trị với kiểu byte)
    *  nhưng do phải dành 1bit để thể hiện số dấu (âm hay dương), nên chỉ còn 7bit (128 giá trị) cho âm và dương
    * vậy 1 byte = có thể hển thị 2^7 giá trị hoặc 2^7 giá trị dương. => 128 giá trị
    *
    *
    * Số 0 được coi là số dương. nên dải giá trị của 1 số dương sẽ đếm từ số 0 đến số đó - 1
    * với kiểu byte, giá trị của 1 biến sẽ có dải từ -128..+127  do tính cả số 0 là số dương
    *
    * do vậy, số lượng số âm và số lượng số dương là bằng nhau, đều bằng 128 chữ số, nhưng số dương đếm cả 0
    * Nên số lượng ít hơn số âm 1 chữ số.
    * */
    public static void main(String[] args) {
        int f = 1000_000;
        System.out.println(f);

        double d = 1000_000.01;
        System.out.println(d);


//        Co the su dung _, nhung khong duoc dat o dau hoac cuoi, hoac dau tien sau dau phay thap phan
    }
    // =>>>> Đối với kiểu PRIMITIVE, không thể được sử dụng trong mọi ngữ cảnh: tính toán, In ra NẾU chưa được gán giá trị
}
