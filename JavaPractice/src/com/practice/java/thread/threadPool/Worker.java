package com.practice.java.thread.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Worker implements Runnable {

    private Random random = new Random();
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public List<Integer> list1 = new ArrayList<>();
    public List<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        process();
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void stageOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                //do your work here
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void stageTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                //do your work here
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }
}