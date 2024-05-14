package com.oca.string;

import java.util.Locale;

public class StringImmutable {

    /*
    * String là bất biến, immutable, không thay đổi, nếu bạn thay đổi giá trị string của biến x, thì 1 giá trị mới sẽ được
    * tạo ra trong string pool và gán lại cho biến đó
    * Khi 1 biến String được tạo mới với dấu bằng , JVM kiểm tra trong string ppol có giá trị đó chưa, nếu có rồi của 1 biến khác đang dùng,
    * thì giá trị đó trong pool sẽ gán cho biến mới đó để tiết kiện bộ nhớ, nếu chưa có trong string pool, nó sẽ tạo
    * giá trị mới. khi biến này thay đổi giá trị, 1 giá trị mới trong pool sẽ tạo và gán lại, biến cũ sẽ đc GC thu dọn rác
    * nếu không có biến nào trỏ đến nó
    *
    * String class is marked final, no one can override it.
    *
    * String object are immutable; => Giá trị String của 1 chuỗi là không sửa đưọc, nếu sửa, Jvm sẽ kiểm tra tồn tại nó hay chưa  tạo ra biến mới trong string pool h
    * String references are mutablehoặc => Giá trị tham chiếu của 1 đối tượng String là có thể thay đổi, tức là Đối tượng String X có thể trỏ tới đối tượng String Y
    * hoặc sau đó lại đổi sang đối tượng A.
    *
    * StringBuilder có thể sửa đổi giá trị của nó mà JVM Không tạo thêm giá trị mới => không để lại các object thừa ở trong string pool khi GC chưa làm việc
    * => ta có thể thay đổi giá trị của StringBuilder tùy ý mà không lo rác hệ thống, với Đối tượng String sẽ gây rác nếu thay đổi nhiều lần giá trị
    * do JVM sẽ tạo Giá trị mới Strong string pool.
    * => khi cần thay đổi giá trì của biến nhiều lần thì nên sử dụng Stringbuilder, ngược lại thì nên sử dụng String.
    * */

    public static void main(String[] args) {
        String myName = "Quan"; // create 2 Object: 1 myName, 2 in string pool:  Quan
        String myAnotherName = "Quan";// search in string pool, if there is any "Quan" value, => assign this var to that value
        String anotherVar = myName; // 3 var point to one value in string pool: Quan
        // this case. myName == myAnotherName => true , myName.equals(myAnotherName) => true

        // => if one of them changed value, JVM search in string pool to see if new value exists, if not, another value
        // create and assign to that var. two other vars still hold old value = Quan, it is immutable.
        System.out.println(myAnotherName + "-" + myName);
        myName = "Hehe";
        System.out.println(myAnotherName + "-" + myName);

        // but if one var is declared with new keyword, then it always get declared with a new Object and do not reference to
        // any exist same value in string pool,

        // khi được khai báo với từ new String(""), jvm luôn tạo 1 đối tượng mới gắn với giá trìj mới đó mà không kiểm tra
        // trong string pool đã có giá trị đó hay chưa.
        // this case, so sánh == giữa 2 biến sẽ trả giá trị false, mà cần phải so sánh với equals
        String name = new String("Quan");
        System.out.println("using new keyword to define a string" + name == myAnotherName); // false because jvm compare root and value;
        System.out.println(myAnotherName.equals(name)); // true because jvm only compare value of them,

        String hoa = "flower";
        String hoa1 = new String("flower").intern();
        System.out.println(hoa == hoa1); //  true, because using method intern() will ask jvm search in string pool
        // the value, if exists, hoa1 will point to that declared value of other variable, BECAREFUL, if flower is declared
        // before by a var like, String DD =  new String("flower") without intern() method, above result can be false
        // when jvm search and get DD and assign hoa1 to it, now, hoa1 will be different to hoa and hoa == hoa1 return false


        // Using String chain, this example ask JVM create 5 OBJECT of string in string pool:
        // including: Hello , Quan, Hello Quan, HELLO QUAN, HEXXO QUAN
        String hello = "Hello";
        hello = hello.concat(" Quan")
                .toUpperCase()
                .replace("L", "X");
        System.out.println("Using string chain: " + hello);
    }
}
