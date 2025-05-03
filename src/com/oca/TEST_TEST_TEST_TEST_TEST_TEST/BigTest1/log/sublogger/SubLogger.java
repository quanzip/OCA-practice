package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.sublogger;

import com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.Logger;
// đây dù là package con  của pkg LOG: nơi khai báo class Logger nhưng vẫn là khác package(cha-con) nên không thể dùng
// thuộc tính name của Logger.

public class SubLogger {
    public static void main(String[] args) {
        Logger logger  = new Logger();
        // logger.name = "quan"; // Không dùng được do name là thuộc tính protected và khác package
    }
}
