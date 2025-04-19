package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.BigTest1;
import java.io.*;
class Great {
    public void doStuff() throws IOException{
    }
}

class Amazing extends Great {
    public void doStuff() throws IOException, IllegalArgumentException{
    }
}

public class Bai1 {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
    }
}