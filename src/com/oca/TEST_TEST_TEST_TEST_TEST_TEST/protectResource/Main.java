package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.protectResource;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final String name;
    private final List<String> cubs;

    Main(final String name, final List<String> cubs) {
        this.name = name;
//        this.cubs = cubs;
         this.cubs= new ArrayList<>(cubs);   // protect this.cubs

    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", cubs=" + cubs +
                '}';
    }

    public ArrayList<String> getCubs() {

        // Chống lại việc thay đổi giá trị của thuộc tính gốc bên trong class.
        return new ArrayList<>(this.cubs);
    }

    public static void main(String[] args) {
        List<String> cubs = new ArrayList<>();
        Main main = new Main("Quan", cubs);

        cubs.add("he");


        System.out.println(main); //only output Quan because we protect properties
    }
}
