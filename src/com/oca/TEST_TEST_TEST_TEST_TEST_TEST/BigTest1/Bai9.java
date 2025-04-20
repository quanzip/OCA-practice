package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

import com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.*;

/*
* Nếu có 2 class trong cùng 1 pkg thì 1 trong 2 class gọi nhau sẽ ko cần import, ok,
* Nếu chúng ở khác pkg thì khi gọi nhau phải có import cự thể.
* Nếu dùng import white card pkg K trong class C để gọi class B, nhưng trong cùng package với C cũng có 1 class tên B khác, thì nó sẽ là ref của B trong cùng pkg với C (k ưu tiên white card)
* */
public class Bai9 {
    public static void main(String[] args) {
        Bai5 bai5  = new Bai5();
        Logger logger = new Logger(); // cùng package thì ko cần import - đây là  class Logger trong cùng package BigTest1
       // com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.Logger logger1
        // = new com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1.log.Logger(); // nếu ko import thì phải chỉ rõ
        Logger logger1 = new Logger();   // Nếu như đã có import thì
    }
}
