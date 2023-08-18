package com.fb.springbootfbtest;

public class TestRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        TestRunable testRunable = new TestRunable();
        testRunable.run();
    }
}
