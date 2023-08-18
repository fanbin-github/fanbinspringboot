package com.fb.springbootfbtest;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {


    @Test
    public void test() {
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("future1");
            return "fu1 end";
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {

            System.out.println("future2 ");
            return "fu2 end";
        });

        CompletableFuture.supplyAsync(() -> {
            return "we";
        });

        CompletableFuture.runAsync(() -> {

        });

        CompletableFuture completableFuture = CompletableFuture.anyOf(completableFuture1, completableFuture2);
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }



        CompletableFuture cc = completableFuture1.thenCombine(completableFuture2, (a, b) -> {
            return a + b;
        });
        try {
            System.out.println(cc.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }



/*
        CompletableFuture completableFuture3 = CompletableFuture.anyOf(completableFuture1, completableFuture2);
        try {
            System.out.println("f3 result" + "  " + completableFuture3.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
*/

/*
        completableFuture1.whenComplete(new BiConsumer<String, Throwable>() {

            @Override
            public void accept(String s, Throwable throwable) {
                System.out.println("comlete result" + s);

            }
        });

        System.out.println(completableFuture1.isDone() + "" + completableFuture2.isDone());
*/


    }
}
