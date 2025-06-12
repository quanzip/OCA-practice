package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.bigtest2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEx {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {  // do đang dùng ref của Multiplier nên Phải bắt theo ex ở method signature của cha.
            System.out.println(e);
        }

        new Calculator().multiply(1);
    }

}


interface Multiplier {
    void multiply(int... x) throws SQLException;
}

// Class Error khoong cần try-catch, không cần khai ở clause
class Calculator implements Multiplier {
    public void multiply(int... x) throws Error {  // ở pt con có thể throw bất kể gì là runTimeEx

    }
}

class SQLException extends Exception {

}

class SQLWarning extends SQLException {}