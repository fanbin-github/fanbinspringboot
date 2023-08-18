package com.fb.springbootfbtest;

public class TestThread extends Thread {

    public void run() {
        System.out.println("hh");
    }

    public static void main(String[] args) {
        TestThread testThrea = new TestThread();

        testThrea.run();
        System.out.println("zhu");
    }

}
