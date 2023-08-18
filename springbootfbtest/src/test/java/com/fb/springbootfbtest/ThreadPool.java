package com.fb.springbootfbtest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(12);


/*        CompletableFuture cc = CompletableFuture.supplyAsync(new Supplier<Object>() {
            @Override
            public Object get() {
                return null;
            }
        }, executorService);

        CompletableFuture cc1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("带有返回值");
            return "123";
        }, executorService);


        CompletableFuture cc22 = CompletableFuture.runAsync(() -> {
            System.out.println("123");
        }, executorService);

        CompletableFuture cc23 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        }, executorService);*/


        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("带有返回值");

            int a = 1 / 0;
            return 1;
        }, executorService).thenApply((result) -> {
            return result;
        });
        try {
            System.out.println("gg" + completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


/*
        completableFuture.thenApply((result) -> {
            System.out.println(result);
            return "then" + result;
        });
*/

/*
        completableFuture.whenComplete((result, errror) -> {
            System.out.println(result + "   " + errror);

        });
*/


/*        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());

                }
            });
        }

        try {
            System.out.println(executorService.submit(new TestCallable()).get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/


    }
}
