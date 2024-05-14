package com.oca.cónition;

public class Sưitch {
    /*
    * - Các giá trị trong case phải là compile-time constant: phải được xác định luôn khi viết mã (final )
    * - The case's value must be in range of switch, ex: sw(byte) then case's values must less than 127
    * - Auto cast are use in switch-case (implicit casting)
    * - Default case are positioned any where in switch brackets
    * - không xử lý được với các kiểu: long, float, boolean and their Wrapper
    * */
    public static void main(String[] args) {

        // Các giá trị trong case phải trong khoảng giá trị cho phép của kiểu truyền vào trong switch - phải được xác định ngay lúc compile(khi viết mã)
        // default case có thể đặt tại bát cứ đâu.
        // Nếu không sử dụng break ở mỗi case, thì khi switch chạy, case X có giá trị thỏa mãn, thì tất cả các logic
        // từ X trở xuống, bao gồm logic của các case khác cũng được xử lý mặc dù giá trị của case là không khớp
        // và bao gồm cả logic của DEFAULT nếu default để phía dưới case đó. Sẽ chạy đến khi nào gặp
        //
        // ex
        // Trong ví dụ dưới. các case không có break, case: 1 không thỏa mãn, logic của nó không được chạy
        // và case 2: sẽ thỏa mãn, thì logic của nó và logic của case 0 sẽ được thực thi do case 2 không có break
        // DEFAULT không được thực thi do default được đặt trên đầu, nếu nó dược đặt dưới case 2, nó cũng sẽ được thực thibreak cho đến khi gặp b
        byte t =2;
        switch(t) {
            default:
                System.out.println("Unknown passed value");
            case 1:
                System.out.printf("quanzip 1");
            case 2: // match from here
                System.out.println("quanzip 2"); // get printed.
            case 0:
                System.out.println("quanzip 0");  // get printed too.
        }

        System.out.println("Implicit casting...");


        /*
        * Object luôn được khai báo và định giá trị tại run-time, kể cả khi chúng được khai báo final.
        * */
        int a = 100;
        int b = 2;
        final int c = 3;
        Integer f = 300; // invalid even with final  because it is evaluate it run-time only.
        final Integer v = 100; // it is evaluate at run time with Object declaration, not a constant at compile time
        switch(a) {
            case 1: // constant, compile-time => valid
                System.out.println("1"); break;

//            case b: // not final => not compile time var
//                System.out.println(b); break;

            case 33 + 23: // constant at compile time.
                System.out.println("33 + 23"); break;

            case c: // constant => valid
                System.out.println(c); break;

//            case f:   // not constant
//                System.out.println(f); break;

//            case v: // not a constant at compile-time.
//                System.out.println(v); break;

            default: {}
        }
    }
}
