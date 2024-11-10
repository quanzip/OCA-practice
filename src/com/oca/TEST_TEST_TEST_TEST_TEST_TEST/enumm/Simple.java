package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.enumm;

public class Simple {
    public static void main(String[] args) {
        Direction c = Direction.NORTH;
        System.out.println(c);
        System.out.println(c.name());
        System.out.println(c.ordinal());
        System.out.println(c.getDeclaringClass().getName());
        System.out.println(c.getDeclaringClass().getCanonicalName());
        System.out.println(c.getDeclaringClass().getSimpleName());

        System.out.println("-------------------Method of instance");
        System.out.println(c.getName(""));

        System.out.println("---------Methods form enum type class");
        System.out.println(Direction.values());
        System.out.println(Direction.valueOf("WEST"));
    }

}
enum Direction {
    NORTH,WEST;
    Direction getName(String name) {
        return NORTH;
    }
}