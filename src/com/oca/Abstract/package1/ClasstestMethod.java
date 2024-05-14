package com.oca.Abstract.package1;

public abstract class ClasstestMethod {
    String showInfo() {
        return "quan";
    }

    protected abstract void packageMethod();
//    abstract void packageMethod();    => Error do [package-private] thì class implements ở package khác không thể implements

    protected abstract String showNOthing();  // can not declare final method in abstract class

    final String hashElement() {
        System.out.println("Has");
        return "";
    }

    static void gessNumber(int x) {
        System.out.println(x % 2 == 0);
    }

    public abstract void showInfo1();
}
