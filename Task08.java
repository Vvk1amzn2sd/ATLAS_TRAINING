import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();  // creting lo9ck here

    public void increment() {
        lock.lock();       // lock here to ensure thread is accessed only by one thread at a time since it is share resource
        try {
            count++;
        } finally {
            lock.unlock();  //unlock finally to make sure to always release
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo extends Thread {
    Counter counter;

    ThreadDemo(Counter counter) {
        this.counter = counter;
    }
@Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Task08 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadDemo t1 = new ThreadDemo(counter);   //both threads using same object
        ThreadDemo t2 = new ThreadDemo(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// main finsh after both t1 and t2 finish
        System.out.println("Final count: " + counter.getCount());  // count was using shared between t1 and t2
    }
}
