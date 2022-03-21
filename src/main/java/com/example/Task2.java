package com.example;

/**
 * 修饰代码块，使用类锁，无论是否为同一对象，均为阻塞。
 */
public class Task2 implements Runnable {

    static int count = 100;

    @Override
    public void run() {
        synchronized (Task2.class) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程：" + Thread.currentThread().getName() + "打印共享变量 count:" + count--);
            }
        }
    }

}
