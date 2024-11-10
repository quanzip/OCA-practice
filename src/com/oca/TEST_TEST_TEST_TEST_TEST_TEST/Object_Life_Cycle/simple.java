package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Object_Life_Cycle;

/*
* kiểu primitive và reference của object sẽ được lưu ở stack (high speed)
* */
public class simple {
    public static void main(String[] args) {
        System.gc(); // suggest JVm to reclaim memory
        Kind kind = new Kind("data");
       // in stack  // data of kind is saved in heap
    }
}

class Kind {
    public Kind(String data) {
    }
}
