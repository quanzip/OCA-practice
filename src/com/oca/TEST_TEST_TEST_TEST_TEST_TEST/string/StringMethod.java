package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.string;

/*
* Khi khai báo String với new String("ok")  thì sẽ có 2 object được khởi tạo
* 1. new String("ok") là khởi tạo 1 object nên sẽ được lưu ở trong heap.
* 2. với mệnh đề: "All literal string are interned" => Tất cả các chuỗi string đều được lưu ỏ string pool, khi lưu, check xem cso chưa, chưa có mới lưu mới. Do vậy "ok" cũng sẽ được check và tạo mới ở trong pool
    với String s = new String("ok);  và String s1 = "ok"   thì sẽ có 2 Object được tạo, đối tượng s đầu tiên tạo 2 Object này, 1 ở heap, 1 ở pool, đối tượng s1 tạo thì kiểm tra pool đã có "ok" rồi nên lấy ra dùng luôn
    * Nhưng 2 object trên là khác nhau (trỏ vào 2 vùng nhớ khác nhau) nên khi so sánh thì == SẼ TRẢ FALSE, còn dùng EQUALS SẼ TRẢ TRUE;
* * */


import java.util.Arrays;

public class StringMethod {
    static char ch;
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

        StringBuilder sb = new StringBuilder("hehe");
        ObjectR r = new ObjectR();
        int []is = new int[]{3,4,5};
        changeString("ss", sb, r, is);
        System.out.println(sb);
        System.out.println(r);
        System.out.println(is[0]);
    }

    public static void changeString(String s, StringBuilder sb, ObjectR r, int[] is) {
        s = null;
        sb.append("quan");
        sb = null;
//        sb = sb.append("s");
        r.name = "Asd1";
        r = null;

        is[0] = 15;
        is[2] = 3;
        is = null;

        r = new ObjectR();
        r.name = "asdkjhasd";

        int i;
//        int g = i  + 5;   // thất bại vì chỉ có thể dùng nếu I là biến toàn cục, đây i là biến cục bộ, phải khai báo giá trị trước khi dùng.

        float sd = 1.38495_____34f;
        int _t = 1000____00;
        System.out.println("Giá trị đặc bieejt6 + " + _t + sd);
        System.out.println("Khoi tao gia tri mac dinh cua char : " + ch);
    }
}
// java dung co che callByValue de goi ham: truyen vao 1 ban copy X cua cac object goc G de thuc thi tren do, neu thay doi thuoc tinh thi ca 2 se bi thay doi
// , nhung neu ben trong ham ma object bi gan sang 1 doi tuong khac K, thi X se tro sang 1 vung nho khac, G van la G, luc nay rieng biet han vs X, khong bi gan sang K
// truoc khi gan sang K, neu X thay doi gia tri thuoc tinh thi ca X va G deu dc thay doi nhu nhau do van con tro chung vao 1 vung nho data

class ObjectR {
        String name = "ObjectR";

    @Override
    public String toString() {
        return "ObjectR{" +
                "name='" + name + '\'' +
                '}';
    }
}
