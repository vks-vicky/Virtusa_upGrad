package com.java.thr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurEx1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i <= 5; i++) {
            int taskId = i;

            executorService.submit(() -> {
                System.out.println("Task ID: " + taskId + ", Executed by: " +  Thread.currentThread().getName());
                try{
                    Thread.sleep(3000);
                }catch(Exception e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();
    }
}
