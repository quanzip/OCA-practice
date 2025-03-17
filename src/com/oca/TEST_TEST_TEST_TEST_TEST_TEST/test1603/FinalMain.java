package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.test1603;

// 1 class A extends abstract class D and interface D, both declare static method S,
// A a = new A(), a.S will invoke S of abstract class D because only abstract class's static method can be invoke by instance
public class FinalMain {
    public static void main(String[] args) {
        Go f = new Go();
        Go s = new Go();
        getInfo(f,s);


        FF d= new FF() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

        // d.gg(); // interface static method can not be accessed through instancce but reference FF.gg(); ok
        d.ff();  // interface default method can be accessed through instance, but not reference FF.ff() not ok
//        Go.gg();  // error
    }

    public static final String getInfo(final Go s, final Go d ) { // final ở
        return "";
    }
}



class Go implements FF {
    String name;
}

interface FF {
    static void gg() {
        System.out.println("Interface's Static methods can not be accessed by instance (implementing class)" +
                ", only Reference.methofName (interfaceName.methofName) is valid");
    }

    default void ff() {
        System.out.println("Interface's Default method can be access through instance (implementing class)," +
                "But referenceName can not be (opposite to static method)");
    }
}
