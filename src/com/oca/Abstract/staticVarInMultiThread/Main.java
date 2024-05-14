package com.oca.Abstract.staticVarInMultiThread;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Trong ngữ cảnh static, chỉ có thể sử dụng các biến/phương thức static, không thể gọi, sử dụng biến, phương thức thường.
 * Ngược lại, trong ngữ cảnh thường, có thể gọi , sử dụng mọi loại biến, phương thức: thường và static
 *
 * Thread:
 * run and start.
 * RUN: sẽ sử dụng thread hiện tại để chạy pt RUN() của raunable mà không tạo thread mới. => gọi bao nhiêu cũng được, không tạp thread mới
 * START: sẽ khởi tạo thread mới để chạy hàm run của runable mà không sử dụng thread hiện tại => gọi bao nhiêu sẽ tạo bấy nhiêu thread mới.
 *
 * */
public class Main {
    static int a = 0;
    int b = 10;
    public static void main(String[] args) {
        System.out.println("");
//        new Test().checkResult();
        List<Integer> list = new Random().ints(100).boxed().collect(Collectors.toList());
        Collections.fill(list,0);

        Thread thread = new Thread(r1, "r1");
        Thread thread1 = new Thread(r2, "r2");

        /*
        * Như này đơn giản là gọi 2 phương thức của 1 đối tượgn thread: Main - luồng chính, chúng sẽ chạy đúng theo tuần tự
        * giống như gọi 2 phương thức bình thường. => không có xáo trộn
        * */
        for (Integer i : list) {
            thread.run();
            thread1.run();
        }

        /**
         * Như này thì các thread sẽ được khỏi tạo và chạy bất đồng bộ
         * Biến a vì là static nên sẽ đượcxywr lý đồng bộ giữa các thread
         * */
        for (Integer i : list) {
            new Thread(r1).start();
        new Thread(r2).start();
        }


    }

    public static Runnable r1 = () -> {
        System.out.println(Thread.currentThread().getName() + "-" + a);
        a+=1; // biến static trong ngữ cảnh thường.
    };

    static public Runnable r2 = () -> {
        System.out.println(Thread.currentThread().getName() + "-" + a);
        a+=1;
    };



    public void normalMEthos(){
        System.out.println("Nomrmal method");
    }

    public static void staticMethod() {
        System.out.println("static method");
        // b++;   Biến thường
        // normalMEthos(); Phương thức thường.
    }
}

class Test {
    static int min = 0;
    int max; // we do not assign value to it, JVM automatically give 0 as value

    public void checkResult(){
        if (this.max < min) {
            System.out.println("OK");
        }
        System.out.println(max);
    }
}
