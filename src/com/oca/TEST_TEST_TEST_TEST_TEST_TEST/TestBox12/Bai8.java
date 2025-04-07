package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.TestBox12;
/*
* Nếu A kế thùa B, B có biến static, A có thể sử dụng biến này trữ tiếp thông qua tên của A: A.staticVarName, hoặc sử
* dụng thông qua instance của A,   a.staticVarName
* */
public class Bai8 {
    public static void main(String[] args) {
//        Sub sub = new Sub();
        System.out.println(Sub.ID);  // via reference ok
//        System.out.println(sub.ID);  // via instance ok
    }
}
class Super {
    static { System.out.print("In Qbank");};
    {
        System.out.println("Instance block");
    }
    static String ID = " ID"; }   // nếu như khai báo final, Giá trị này sẽ được gán ở lúc Compile time và Jmv biết nó sẽ không bị thay đổi
   // Cho nên ở hàm main khi truy cập vào ID này, JVM biết giá trị nó rồi
// sẽ không dẫn đến sự Load của class Super trong bộ nhớ => block static sẽ không được chạy
   // Nhưng nếu var ID này không để final, thì ở hàm main lúc gọi đến field static này, thì nó mới được gán giá trị  = "ID"
// => Class Super sẽ được load vào bộ nhớ => block static sẽ được chạy vào lúc này
    /* result:
    * Class Super sẽ được JVM load vào bộ nhớ (đồng thời chạy các static block) khi xảy ra bất kỳ điều gì sau đây:
    *  1.Class được khởi tạo với từ khóa new
    *  2. Bất kỳ Phương thức static của class được gọi lần đầu
    *  3. Bất kỳ biến static nào được gán giá trị lần đầu => biến đó không phải final
    *  4. bất kỳ biến static nào được GỌI lần đầu và biến đó không phải final (non-final thì lúc này gọi JVM mới load giá trị => load class, còn nếu biến static này là final thì JVM biết rõ giá trị nó ròi, có được gọi thì class cũng không được loadd)
    *  5. bất kỳ biến static nào điuọc gọi lần đầu  thông qua class/interface con
    *  6. bất kỳ method thường/static nào được gọi thông qua method reflection của  class Class hoặc package java.lang.reflect
    * */

class Sub extends Super{
    static final int t = 10;
    static { System.out.print("In Sub");  // AAA   static block chỉ được thực thi khi mà 1 trong các sự kiện bên trên xuất hiện
         }
        {
            System.out.println("Super instance block");
            // khối instance block chỉ được thực thi khi class được khai báo với keywỏrd NEWnhớ
            // , còn khối static sẽ được thực thi khi mà class được load vào trong bộ
        };
}



// class NewClass{
//    private Object o;
//    void doSomething(Object s){  o = s;   }
//
//    public static void main(String args[]){
//        Object obj = new Object(); // 1
//        NewClass tc = new NewClass(); //2
//        tc.doSomething(obj); //3
//        obj = new Object();    //4  /data cu van con
//        obj = null;    //5
//        tc.doSomething(obj); //6    //  ok
//    }
//}
//
// class TestClass{
//    public static void main (String args[]){
//
//        Student s = new Student("Vaishali", "930012");
//
//        s.grade();
//
//        System.out.println(s.getName());
//
//        s = null;ok   // ok  data cu thi ko co reference nao,  khong co instance nao tro vao S   , data cu cos the dc don
//
//        s = new Student("Vaishali", "930012");   // s tro vao 1 vung nho data heap
//
//        s.grade();
//
//        System.out.println(s.getName());
//             s = null;
//    }
//}
