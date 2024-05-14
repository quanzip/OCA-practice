package com.oca;

public class CompoundOperator {
    public static void main(String[] args) {
        int c = 390;
        byte d = 3;
        // d = d + c; // need cast
        d += c;  // do not need cast becaúse java implicitly cast for us to byte: d = (byte) (d + c);

        // important
        c *= 2 + 1;    // = c = c* (RHS)   => c = 30 * (2+1) = 90
        System.out.println(c);


        // Trong biểu thức này, vẫn áp dụng theo quy tắc bên trên, đằng sau toán tử đôi (+=) luôn được đặt trong ngoặc
        // và thực hiện trước. Tuy nhiên, biểu thức (l=3) sẽ gán giá trị cho l, nhưng tại chỗ gán đó l mới có giá trị mới,
        // những chỗ truóc đó l xuất hiện thì vẫn mang giá trị cũ như ban đầu gán.
        long l = 4;
        l += 2 * l + (l = 3) * 3; // 4 + ((2 * 4) + 3 * 3) = 21;
        System.out.println(l);
    }
}
