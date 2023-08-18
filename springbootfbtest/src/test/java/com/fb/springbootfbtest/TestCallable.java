package com.fb.springbootfbtest;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class TestCallable implements Callable<Integer> {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);







/*
        Future future = executorService.submit(new TestCallable());
        try {
            future.get();
            System.out.println("231");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
*/

/*        FutureTask futureTask=new FutureTask<>(new TestCallable());
        try {
            executorService.submit(futureTask).get();
            System.out.println("123");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

    }

    @Test

    public void teCall() {
        try {
            System.out.println(new TestCallable().call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void tets() {
        TestCallable testCallable = new TestCallable();

        FutureTask<Integer> futureTask = new FutureTask<>(testCallable);

        futureTask.run();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
