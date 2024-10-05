package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.String_StringBuilder;

public class Main implements i1, i2{
    static String name = "Quan";
    static StringBuilder add  = new StringBuilder("Ha Nam");

    static void changeString(String name, StringBuilder add) {
        name += "Pham";
        add.append(" Duy Tien");
    }

    public static void main(String[] args) {
        Main.changeString(name, add);
        System.out.println(name);
        System.out.println(add);

        i1 i1 = new Main();
    }
}

interface i1 {

}
interface i2 {

}
