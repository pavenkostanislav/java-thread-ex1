package com.company;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadLog1 implements Runnable {
    private final String name;
    private final static ArrayList<String> arrName = new ArrayList<>();
    public ThreadLog1 (String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadLog" + this.name  + i);
                ThreadLog1.arrName.add(this.name  + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex){
            Logger.getLogger(ThreadLog1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(ThreadLog1.arrName.toString());
        }
    }
}
