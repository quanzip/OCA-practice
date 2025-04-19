package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;

public class Bai2Bai3 {
    public static void main(String[] args) {

    }
    public float parseFloat( String s ){
        if (s.isEmpty()) {
//            throw new Exception();    nee to add try catch
        }
        Long l = Long.valueOf("s");
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2
//            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
//            return f;     // 5
            throw new Exception();
        }
        finally {
            return f;     // 6

        }
//        return f ;    // 7
    }
}
