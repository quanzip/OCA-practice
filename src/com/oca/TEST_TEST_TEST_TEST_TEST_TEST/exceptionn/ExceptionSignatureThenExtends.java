package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn;

import java.io.FileNotFoundException;
import java.io.IOException;




public class ExceptionSignatureThenExtends extends Base {
    @Override
    public void funx() { // ok
        // throws FileNotFoundException   -> ok, nhỏ hơn cha.
        // throw RuntimeException ->  ok vì là RuntimeException
        //
        // throw Exception() -> not ok -> checked exception lớn hơn cha.
        // throw SqlException -> not ok -> checked Exception không cùng cây với cha.
        /*
        * COn chỉ có thể throw Exception giống hoặc là con nhỏ hơn cha,
        * - hoặc không throw gì
        * - hoặc throw bất kỳ runtime exception
        *
        * Con không được throw Checked exception khác loại mà không cùng cây kế thừa với cha
        * Con Không được throw ex cùng cây kế thừa với cha nhưng lớn hơn của cha.
        * */

    }

    public static void main(String[] args) {

    }


}
class Base {
    public void funx() throws IOException {

    }
}