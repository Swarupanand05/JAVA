

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Hello");
            System.out.println("My name is Rutuja");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Welcome");
            System.out.println("My name is Revati");
            i++;
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1(); // Object of Thread 1
        MyThread2 t2 = new MyThread2(); // Object of Thread 2

        t1.start(); // ✅ Now start() is available
        t2.start(); // ✅ Threads will run in parallel
    }
}
