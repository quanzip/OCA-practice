package com.oca.packageAndImport;

import java.net.URI;
import java.nio.file.Files; //  import phải chấm tới tên Class, không thể là tên file hoặc tên package.
// trường hợp sử dụng wildcard, vẫn là chấm tới tên class nhưng là dấu * => sử dụng tất cả các class trong package
// import java.nio.file.*
import java.nio.file.*;    // file là package,
import java.nio.file.Paths; // uu tien specific import, not wild card

public class TestPackage {
    public static void main(String[] args) {
//        Files files = new Files()
        Paths.get(URI.create("http://google.com")); // Class Paths đã có sẵn bên trong java.nio.file.*,
        // nếu không dùng wild card, thì phải import riêng cho Paths: import java.nio.file.Paths;
    }
}
