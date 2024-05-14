package com.oca;

public class TypePromotionAndCastingAndBoxing {
    // nếu gán giá trị số X cho kiểu lớn hơn số X => widening => automatic
    // nếu gán giá trị X cho kiểu kiểu nhỏ hơn => narrowing => require casting

    // unboxing là khi trả ra 1 giá trị kiểu object nhưng var hứng nó lại ở kiểu primitive.
    // Boxing là khi trả ra 1 kiểu primative nhưng var hứng nó lại là kiểu Object.
    public static void main(String[] args) {
        long assignIntValueToLong = 3;  // automatic cast
        int assignLongToInt = (int) 3L;  // require cast

        System.out.println(assignIntValueToLong);
        System.out.println(assignLongToInt);

        int x = Integer.valueOf(55);  // auto unboxing
        Integer y = 33; // autoboxing tự động chuyển primitive thành object

        // nếu không có final, compiler báo lỗi, có final thì compiler xác định được trước giá trị của c đã hợp lệ
        // để gán cho s do c vẫn trong dải giá trị của s.
        final char c = 'c';
        char c1 = 'c';
        short s = c;
        // short sh = c1;  // error

        // khi 2 biến kiểu byte cộng cho nhau, giá trị có thể vượt ra ngoài dải của bytecas
        // => CẦN PHẢI khai báo b3 VỀ INT,
        // => HOẶC THÊM FINAL KHI KHAI BÁO B1 VÀ B2,
        // => HOẶC CẦN CAST b1 + b2 VỀ KIỂU BYTE ĐỂ ĂN KHỚP VỚI KIỂU BYTE CỦA B3;
        // để compiler tính toán (b1 + b2) luôn tại thời điểm khai báo xem có vượt quá giá trị dải byte của b3 hay không
        // Nếu vượt , compiler sẽ báo lỗi, nếu không vượt, ok chạy
        final int b1 = 44, b2 = 33; // bỏ final sẽ báo lỗi
        byte b3 = b1 + b2;  // nếu không có final, cần để b3 kiểu lớn hơn (long, int, double);

        // important
         int i = 3;
        byte b55 = 120;
//        byte f = i;  // error because it require cast to byte, if we use final for i, then no need to cast (no error)
        // b55 = i + b55; // errỏr because we need to cast  right hand to byte like : b55 = (byte )(i + b55)
        i = i + b55; // valid because
        b55 += i; // no error because java do implicit cast: cast ngầm định
        System.out.println("Implicit cast: " + b55);
    }
}
