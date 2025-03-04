package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn.tryWithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* Try-with-resource luôn có 1 finally block ngầm định java sẽ chạy để đóng các tài nguyên trong try
* Nếu ta khai báo tường minh 1 finally block, java vẫn sẽ chạy finally block ngầm định trước tiên, sau mới đến finally block của ta khai báo.
* Try-with-resource vẫn có quy tắc như try bình thường, vẫn yêu cầu phải có catch hoặc finally hoặc cả 2. Nhưng vì luôn có 1 finally ngầm định nên ta không cần catch/finally nữa với try-with-resource. Chỉ cần duy nhất try(){} mà thôi
* Các tài nguyên khai báo sau của try-with-resource sẽ được đóng trước, theo thứ tự từ phải sang trái. chỉ những tài nguyên khai báo trong try-with-resource () mới có thể tự động được close
* Tài nguyên trong try-with-resource () và body của nó {} là local, không thể sử dụng tại catch hoặc finally tự định nghĩa,
* */
public class Main {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fi = new FileInputStream("Main.java"); FileOutputStream fo = new FileOutputStream("Main.java")) {
            /*
            * Trong trường hợp này, sau khi kết thúc try-with-resource, fo sẽ được close trước, sau đó mới đến fi.
            * */
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fi = new FileInputStream("Main.java"); FileOutputStream fo = new FileOutputStream("Main.java")) {
            /*
            * Trong trường hợp này, sau khi kết thúc try-with-resource, fo sẽ được close trước, sau đó mới đến fi.
            * */
        }
    }

    public void go() throws FileNotFoundException {

    }
}
