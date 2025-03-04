package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.Arrays;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int ar[] = {'a', 'v'};

        int av[] = {'a', 'v', 'c', 'l'};


        // this will compare the length (arg1.length - arg2.length)
        // => -2
        //int r = Arrays.compare(ar, av);

        // this will return the first index that are not equals => 2, first 2 index (0 & 1) of two arrays are the same, but index 2 of second arrays is different from array 1, so result is 2
         // => 2
        // int b = Arrays.mismatch(ar, av);
    }
}
