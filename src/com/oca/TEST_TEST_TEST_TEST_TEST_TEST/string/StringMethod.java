package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.string;

public class StringMethod {
    public static void main(String[] args) {
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
