package com.oca;

public class LogicOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b= true;
        boolean c = a && (b = false); // c require a = true & true  but (b=false) is a command return false;
        // so c get false as result
        System.out.println(c); // false;
        System.out.println("AND:" + a + "-" + b);  // true false;


        boolean a1 = false;
        boolean b1= true;
        boolean c1 = a1 && (b1 = false); //  because a1 = false; so right hand value (b1 = false) is not cared anynore
        // so c get false as result
        System.out.println(c1);  // false;
        System.out.println("AND:" + a1 + "-" + b1); // false true

        boolean x = true;
        boolean y = true;
        boolean z = !x || (y = false);
        System.out.println(z); // false; because y get assigned to false;
        System.out.println("OR:" + x + "-" + y);  // true - false;

        // new knowledge: XOR ~ ^: require only one side to be true => true; if both is false or both is true => false;
        // XOR là toán tử yêu cầu 1 trong 2 vế phải là true thì KQ trả ra sẽ là true, còn các Th khác sẽ là false;
        // vd 1 true 1 false -> true, 2 true -> false, 2 false -> fasle;
        boolean r = 1 > 2 ^ 2 > 1; //  false ^ true => true;
        boolean r1 = 1 < 2 ^ 2 < 3; // true ^ true  => false;
        boolean r2 = 1 > 2 ^ 2 > 3; // false ^ false => false;
        System.out.println("XOR: " + r + "-" + r1  + "-" + r2);


        // important
        System.out.println(" condition ? value if true : value if false  => ternary operation ");
    }
}
