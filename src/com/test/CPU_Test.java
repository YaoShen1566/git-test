package com.test;

public class CPU_Test {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(30 * 60 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread.setName("thread-" + i);
            thread.start();

        }

        Thread highCpuThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    i++;
                }
            }
        });

        highCpuThread.setName("HighCpu");
        highCpuThread.start();

    }
}
