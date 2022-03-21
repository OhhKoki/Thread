package com.example;

/**
 * 修饰代码块，使用对象锁则相同对象阻塞，不同对象不阻塞。
 */
public class Task1 implements Runnable {

    static int count = 100;

    @Override
    public void run() {
        synchronized (this) {
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
