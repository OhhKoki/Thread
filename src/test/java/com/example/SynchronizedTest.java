package com.example;

/**
 * 修饰代码块，如果为对象锁则相同对象阻塞，不同对象不阻塞。如果为类锁，无论是否为同一对象，均为阻塞。
 * 修饰普通方法，相同对象阻塞，不同对象不阻塞。
 * 修饰静态方法，无论是否为同一对象，均为阻塞。
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        test08();
    }

    /**
     * synchronized 修饰一个代码块，被修饰的代码块称为同步语句块。作用的对象是调用这个代码块的对象，其作用的范围有以下两种情况；
     *      1）synchronized(this) 为对象锁，不同对象调用时不会阻塞，相同对象调用时为同步阻塞。
     *      2）synchronized(Task.class) 为类锁，则无论是都相同对象调用都为同步阻塞。
     */
    public static void test01() {
        // 使用对象锁，对象为相同对象
        Task1 task1 = new Task1();
        new Thread(task1, "A").start();
        new Thread(task1, "B").start();
        new Thread(task1, "C").start();
        new Thread(task1, "D").start();
        new Thread(task1, "E").start();
        new Thread(task1, "F").start();
        new Thread(task1, "G").start();
        new Thread(task1, "H").start();
        new Thread(task1, "I").start();
        new Thread(task1, "J").start();
    }

    /**
     * synchronized 修饰一个代码块，被修饰的代码块称为同步语句块。作用的对象是调用这个代码块的对象，其作用的范围有以下两种情况；
     *      1）synchronized(this) 为对象锁，不同对象调用时不会阻塞，相同对象调用时为同步阻塞。
     *      2）synchronized(Task.class) 为类锁，则无论是都相同对象调用都为同步阻塞。
     */
    public static void test02() {
        // 使用对象锁，对象为不同对象
        new Thread(new Task1(), "A").start();
        new Thread(new Task1(), "B").start();
        new Thread(new Task1(), "C").start();
        new Thread(new Task1(), "D").start();
        new Thread(new Task1(), "E").start();
        new Thread(new Task1(), "F").start();
        new Thread(new Task1(), "G").start();
        new Thread(new Task1(), "H").start();
        new Thread(new Task1(), "I").start();
        new Thread(new Task1(), "J").start();
    }

    /**
     * synchronized 修饰一个代码块，被修饰的代码块称为同步语句块。作用的对象是调用这个代码块的对象，其作用的范围有以下两种情况；
     *      1）synchronized(this) 为对象锁，不同对象调用时不会阻塞，相同对象调用时为同步阻塞。
     *      2）synchronized(Task.class) 为类锁，则无论是都相同对象调用都为同步阻塞。
     */
    public static void test03() {
        // 使用对象锁，对象为相同对象
        Task2 task2 = new Task2();
        new Thread(task2, "A").start();
        new Thread(task2, "B").start();
        new Thread(task2, "C").start();
        new Thread(task2, "D").start();
        new Thread(task2, "E").start();
        new Thread(task2, "F").start();
        new Thread(task2, "G").start();
        new Thread(task2, "H").start();
        new Thread(task2, "I").start();
        new Thread(task2, "J").start();
    }

    /**
     * synchronized 修饰一个代码块，被修饰的代码块称为同步语句块。作用的对象是调用这个代码块的对象，其作用的范围有以下两种情况；
     *      1）synchronized(this) 为对象锁，不同对象调用时不会阻塞，相同对象调用时为同步阻塞。
     *      2）synchronized(Task.class) 为类锁，则无论是都相同对象调用都为同步阻塞。
     */
    public static void test04() {
        // 使用类锁，对象为不同对象
        new Thread(new Task2(), "A").start();
        new Thread(new Task2(), "B").start();
        new Thread(new Task2(), "C").start();
        new Thread(new Task2(), "D").start();
        new Thread(new Task2(), "E").start();
        new Thread(new Task2(), "F").start();
        new Thread(new Task2(), "G").start();
        new Thread(new Task2(), "H").start();
        new Thread(new Task2(), "I").start();
        new Thread(new Task2(), "J").start();
    }

    /**
     * 修饰普通方法，相同对象阻塞，不同对象不阻塞。
     */
    public static void test05() {
        // 对象为相同对象
        Task3 task3 = new Task3();
        new Thread(task3, "A").start();
        new Thread(task3, "B").start();
        new Thread(task3, "C").start();
        new Thread(task3, "D").start();
        new Thread(task3, "E").start();
        new Thread(task3, "F").start();
        new Thread(task3, "G").start();
        new Thread(task3, "H").start();
        new Thread(task3, "I").start();
        new Thread(task3, "J").start();
    }

    /**
     * 修饰普通方法，相同对象阻塞，不同对象不阻塞。
     */
    public static void test06() {
        // 对象为不同对象
        new Thread(new Task3(), "A").start();
        new Thread(new Task3(), "B").start();
        new Thread(new Task3(), "C").start();
        new Thread(new Task3(), "D").start();
        new Thread(new Task3(), "E").start();
        new Thread(new Task3(), "F").start();
        new Thread(new Task3(), "G").start();
        new Thread(new Task3(), "H").start();
        new Thread(new Task3(), "I").start();
        new Thread(new Task3(), "J").start();
    }

    /**
     * 修饰静态方法，无论是否为同一对象，均为阻塞。
     */
    public static void test07() {
        // 对象为相同对象
        Task4 task4 = new Task4();
        new Thread(task4, "A").start();
        new Thread(task4, "B").start();
        new Thread(task4, "C").start();
        new Thread(task4, "D").start();
        new Thread(task4, "E").start();
        new Thread(task4, "F").start();
        new Thread(task4, "G").start();
        new Thread(task4, "H").start();
        new Thread(task4, "I").start();
        new Thread(task4, "J").start();
    }

    /**
     * 修饰静态方法，无论是否为同一对象，均为阻塞。
     */
    public static void test08() {
        // 对象为不同对象
        new Thread(new Task4(), "A").start();
        new Thread(new Task4(), "B").start();
        new Thread(new Task4(), "C").start();
        new Thread(new Task4(), "D").start();
        new Thread(new Task4(), "E").start();
        new Thread(new Task4(), "F").start();
        new Thread(new Task4(), "G").start();
        new Thread(new Task4(), "H").start();
        new Thread(new Task4(), "I").start();
        new Thread(new Task4(), "J").start();
    }

}
