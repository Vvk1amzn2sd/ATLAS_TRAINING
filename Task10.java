class Resource {
    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try { Thread.sleep(100); } catch (InterruptedException e) {
            System.out.println("another thread interrupted sleep");
        }
        r.method2(this);  // this here refers to the current instance of resource which is r2 as it was called on r2
    }

    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.method2(this);  // this here refers to r1 and hence method1 is being called on r1
    }
}

public class Task10{
    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.method2(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}

    
