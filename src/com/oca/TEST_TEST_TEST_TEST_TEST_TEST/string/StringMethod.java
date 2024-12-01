package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.string;

/*
* Khi khai báo String với new String("ok")  thì sẽ có 2 object được khởi tạo
* 1. new String("ok") là khởi tạo 1 object nên sẽ được lưu ở trong heap.
* 2. với mệnh đề: "All literal string are interned" => Tất cả các chuỗi string đều được lưu ỏ string pool, khi lưu, check xem cso chưa, chưa có mới lưu mới. Do vậy "ok" cũng sẽ được check và tạo mới ở trong pool
    với String s = new String("ok);  và String s1 = "ok"   thì sẽ có 2 Object được tạo, đối tượng s đầu tiên tạo 2 Object này, 1 ở heap, 1 ở pool, đối tượng s1 tạo thì kiểm tra pool đã có "ok" rồi nên lấy ra dùng luôn
    * Nhưng 2 object trên là khác nhau (trỏ vào 2 vùng nhớ khác nhau) nên khi so sánh thì == SẼ TRẢ FALSE, còn dùng EQUALS SẼ TRẢ TRUE;
* * */


public class StringMethod {
    public static void main(String[] args) {
        Number s = new Integer(1);
        String a = "ozoboz";
        System.out.println(a.replace("z", "Z")); // thay thế tât cả z bằng Z, có thể đổi sang dùng replaceAll thì sẽ tìm theo regex -> linh động hơn
        System.out.println(a.replaceFirst("z", "Z"));
        System.out.println("substring at 6" + a.substring(6) + ", substring at length equals empty string " + (a.substring(6).equals("")));
        System.out.println("subString at 1 -> length: " + a.substring(1, 6));
//      exception  System.out.println("substring at 7" + a.substring(7));

        Object t = new Integer(11);
        int r1 = ((Integer) t).intValue()/ 3;
        System.out.println(r1);
    }

}
