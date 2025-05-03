package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Polimorphism_invocation_method_static_or_instance;

import java.io.IOException;
import java.util.Calendar;

/*
 * - khi @Override phương thức của cha ở class con, phương thức @Override ở class con phải có signature giống y hệt với cha
 *  gồm: tên phương thức, thứ tự param
 *  Nếu giống signature rồi nhưng kiểu trả vể (return type không thuộc method signature) không giống với cha, jvm sẽ báo lỗi do đang kế thừa nhưng lại để khác kiểu với cha, riêng kiểu trả về thì phải giống hoặc là kiểu con (is a) đối với kiểu của phương thức gốc
 * , nếu khác signature thì (methodName and param type), ta chỉ đang overload (ghi đè phương thức, không phải override) thì để kiểu trả về khác nhau ok
 * - Tiếp đó là giới hạn truy cập của @override ở class con không được hẹp hơn, ít nhất là bằng hoặc mở hơn so với phương thức gốc ở class cha.
 * => abstract class đã có abstract thì không kèm final/private
 * nếu phương thức cha là package private, thì class con cũng phải ở cùng package với cha mới có thể override
 * - Checked exception phương thức @Override ở class con không thể throw nhiều và exception mở hơn so với phương thức gốc ở class cha.
 * - Đối với unchecked exception, phương thức con có thể throw bao nhiêu tùy ý
 *
 * Đặc biệt Nếu class con đã trùng signature với cha, thì phải trùng nốt return type (return type không thuộc method signature)
 * Nếu không trùng return type, JVM sẽ báo lỗi.
 * */


interface I1 {
    String name = "interface";

    static void showInfo() {
        System.out.println("INTERFACE: Static method from interface");
    }

    void showToday();

    default void showName() {
        System.out.println("INTERFACE: Default method from interface");
    }
}

public class Main extends AbClass implements I1 {
    String name = "Main";

    public static void main(String[] args) {
        I1 i1 = new Main();
        i1.showName();
        i1.showToday();
        System.out.println(i1.name);

        Main main1= new Main();
        main1.showName();
        main1.showToday();
        System.out.println(main1.name);
    }

    // if this method is commented, then program will use parent's method
    public void showName() {
        System.out.println("SUB class:instance method from class Main");
    }

    @Override
    public void showToday() {
        System.out.println("SUB class:i " + Calendar.getInstance().getTime());
    }

    @Override
    Main getAdd() throws Exception {
        String s = "asd";
        if (s.length() > 1) {
            // không thể throw exception lớn hơn của cha, mà phải nhỏ hơn hoặc bằng.
            throw new IOException();
        }
        return null;
    }
}

abstract class AbClass {
    static void showInfo() {
        System.out.println("ABSTRACT: Static from abstract class");
    }

    protected abstract void showToday();

    abstract Object getAdd() throws Exception;
}
