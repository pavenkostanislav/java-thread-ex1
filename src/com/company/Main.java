package com.company;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Hello world!");
        ThreadLog1 first = new ThreadLog1("First");
        ThreadLog1 second = new ThreadLog1("Second");

        /*
         first.run();
         second.run();
        */
        ExecutorService  executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first);
        executorService.submit(second);
    }
}
