package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn;

/*
* checked exception phai co try-catch
* unchecked exception kh can try-catch
* */

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThrow {
    public static void main(String[] args) {
        try {
            testThrowException();   // Exception la checked exception nen yeu cau try-catch
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        testThrowRuntimeException(); // // runtime exception nen kh yeu cau try-catch
        testThrowIlligalArgumentException();  // runtime exception
    }

    private static void testThrowException() throws Exception {
        throw new Exception("");
    }

    private static void testThrowRuntimeException() {
        throw new RuntimeException("");
    }

    private static void testThrowIlligalArgumentException() {
        throw new IllegalArgumentException("");
    }

    private static void testFilenotFoundException() {
        try {
            throw new IOException();
        } catch (FileNotFoundException | EOFException e) {   // FileNotFoundException | EOFException deu la con cua IOException

//            catch (FileNotFoundException e | EOFException e) {  => error
//            catch (FileNotFoundException e1 | EOFException e2) {  => error
//            catch (FileNotFoundException e1 | IOException e2) {  => error

            e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void testCustomException() {
        try {
            throw new AppException();
        } catch (MyException | MyException1 w) {  // MyException | MyException1 dau la con cua AppException
            w.printStackTrace();
        } catch (Exception ignored) {

        }
    }
}

class AppException extends Exception{

}

class MyException extends AppException{

}

class MyException1 extends AppException{

}
