package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log;

public class Bai37 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.name = "quan"; // dùng được do thuộc tính name là protected, và đang trong cùng package với class gốc: Logger
    }
}
