package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

import com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.Logger;

public class Bai37 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        // logger.name = "sjdfhk";  // Error because thuộc tính protected chỉ dùng đc cho class con hoặc dùng cho chính instance gốc/classcon ở nơi trong cùng package với class gốc
    }
}


class SubLogger extends Logger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        // logger.name = "quan"; // Error vi đang sử dụng instance của class gốc nhưng ở ngoài package.

        SubLogger subLogger = new SubLogger();
        subLogger.name = "quan"; // Ok vì sd từ class con.
    }
}

class AExtendBextendsClassHasProtectedField extends SubLogger{
    public static void main(String[] args) {
        AExtendBextendsClassHasProtectedField aExtendBextendsClassHasProtectedField = new AExtendBextendsClassHasProtectedField();
        aExtendBextendsClassHasProtectedField.name = "quanzip";
    }
    void showName() {  // Gọi tới thuộc tính protected của ông  đang ở khác package
        name = "quanzip";
    }
}