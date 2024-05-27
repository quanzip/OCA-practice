package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.testInterfaceSubclass;
/*
    we can only declare static class when that class is subclass (nested)
    With nested static class, we can instantiate it through the name of outter class
    With nested normal class, we have to use instance of outter class to instancetiate it
* Becarefull when using nested normal class (not static class)
* */
public class TestInteface {
    public static void main(String[] args) {
        Another another = new Another();

        // IMPORTANT
        // class con la static trong 1 inner class
        // InnerClass cầ để tên của outer class do InnerClass class là 1 subsclass - inner class cua class: Another
        Another.InnerClass innerClass1 = new Another.InnerClass();

        // ------------------------------------------------

        // IMPORTANT
        /*muốn sử dụng các class con trong hàn main cần để chúng là static */
        // no need INSTANCE of outter class
        StaticSubclass staticSubclass = new StaticSubclass();

        // IMPORTANT
        // we have to use instance of outter class to instantiate it
        TestInteface testInteface = new TestInteface();
        NormalSubClass normalSubClass =  testInteface.new NormalSubClass();
    }

    static class StaticSubclass {
        public void showInfo() {
        }
    }

    class NormalSubClass {
        NormalSubClass() {
            System.out.println("Instantiate normal sub class \n it needs instance of OUTTER CLASS");
        }
    }

}

abstract class Test {
    int x = 934;
    public void helloFriends(){
        // VERY IMPORTANT: can not instantiate an inner class (normal class) through JUST NAME OF OUTTER CLASS
        // it requires instance of outter class instead
        // Error
        // TestInteface.NormalSubClass normalSubClass = new TestInteface.NormalSubClass();

        // Solution
        TestInteface testInteface = new TestInteface();
        TestInteface.NormalSubClass normalSubClass1 = testInteface.new NormalSubClass();

        // ok but still need the name of
        TestInteface.StaticSubclass staticSubclass = new TestInteface.StaticSubclass();

        // another is not sub class
        Another another = new Another();

        // static class
        Another.InnerClass innerClass = new Another.InnerClass();
    }
}

class Another extends Test {
    public static int vas = 1;

    static class InnerClass {
        String age;
    }
}

