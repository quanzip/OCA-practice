package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.ExtendTest03;

/*
* Khi 1 class khai báo, trong constructor của nó các thành phần sẽ chạy theo thứ tự SIC: super(), instance initializer, phần còn lại của constructor.
* ở ví dụ dưới, sẽ được thực thi như sau:
* 1. JVM thấy A có constructor no-arg nhưng chưa gọi supẻr() ở trong nên Jvm tự thêm super() vào constructor no-arg này.
* 2. Jvm thấy BB không có cons => tự thêm cho BB no-ảrg cons và chèn super() vào bên trong
* 3. trong hàm main, sau khi khởi tạo BB, cons của BB sẽ được chạy theo trình tự SIC (call super(), chạy instance {} của BB, các logic còn lại trong constructor của BB)
* .
*
* ---- thực thi khởi tạo A bên trong Cons của A:
* lệnh gọi super() sẽ được hạy đầu tiên => no-arg cons của A sẽ được chạy trước. Tại đây, gặp lệnh super() => gọi tới no-arg cons của class Object, khởi tạo xong instance Object, sau đó sẽ khởi tạo các biến/var bên trong class Object => complete class Object
* +++++++tiếp theo sẽ đi khởi tạo giá trị các var trong A, lúc này là I, non-final => định giá trị tại runtime là 10,
* +++++++Tiếp theo các thứ còn lại trong no-arg cons của A, lúc này là func print(). Phương thức này được kế thừa bởi BB vì BB cũng có print() và có cùng signature nên phải kế thừa của A, nếu khai báo print trong BB có signature khác print() trong A, thì vẫn ok, sẽ là overloading không phải overriding
* Bởi vì khi gọi method thì sẽ là gọi method của instance nên print() sẽ được gọi của BB đã override. Khi chạy print có sd var I của BB, nhưng lúc này I chưa được khởi tạo giá trị(evaluate at runtime, non-final) nên có giá trì là 0. vì đây mới đang trong bước khởi tạo A, chưa chạy đến bước var initialization của BB
*  => print() của B sẽ in ra 0. Sau đó chạy tới func aFunc(), là phương thức k đc kế thừa nên sẽ gọi phương thức aFunc của chính nó, in ra afunc, Lúc này đã chạy xong  hàm super() trong cons của BB
*
*
*  ---- Khởi tại gía trị các biến trong BB (var initialization BB) sau khi chạy super()
 *   ++ Đầu tiên là gán giá trị cho I = 4, vì nó là runtime var nên bây giờ mới đướj gán giá trị, nếu khai báo là final thì JVM lúc compile đã định dẵn giá trị rồi
 *   ++ Tiếp theo là chạy lệnh a.print(), phương thức này đã được kế thừa bởi BB, nên sẽ là instance method => chạy bằng print() của BB., có sử dụng I đã được khởi tạo giá trị bước trên: 4
 *   ++ tiếp theo là chạy lệnh in ra a.I,   cả A và BB kế thùa A đều có biến này và đã có giá trị, Nhưng biến thì luôn là reference variable nên sẽ truy cập và sử dụng biến của A => in ra 10
 *
 * Như vậy sau toàn bộ qúa trình hàm main sẽ in ra: 0 aFunc 4 10
* */


class A {
    int i = 10;
    public A() {
        print();
        aFunc();
    }

    public void print(){
        System.out.print("A ");

    }

    public void aFunc() {
        System.out.println("Afunc");
    }
}
public class BB extends A{
    int i =4;
    public static void main(String[] args) {
        A a = new BB();
        a.print(); // instance method
        System.out.println(a.i);  // reference variable
    }

    public void print() {
        System.out.print(i + " ");
    }
}
