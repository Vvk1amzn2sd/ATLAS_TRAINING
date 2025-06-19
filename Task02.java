class RunnableDemo implements Runnable {     // Implementing Runnable interface
    private Thread t;
    private String threadName;

    RunnableDemo( String name){  //constructor with thread name
    threadName = name;   //
    System.out.println("Creating " + threadName );
    }

   @Override
    public void run() {
     System.out.println("Running " + threadName );

      try {    //for handling exceptions

    for(int i = 4; i > 0; i--) {
    System.out.println("Thread: " + threadName + ", " + i);
    // Let the thread sleep for a while.
    Thread.sleep(50);
    }
    } catch (InterruptedException e) {
    System.out.println("Thread " + threadName + " interrupted.");
    }
    System.out.println("Thread " + threadName + " exiting.");
    
    }
   // @Override
    public void start()
    {
    System.out.println("Starting " + threadName ); 
    if (t == null)    //create only one thread for each runnable instance   -- although we only pass string parameter to RunabbleDemo constructor, be default t is null
    {
    t = new Thread (this, threadName);  //creating new instance so that when r1 and r2 give fn call to start, there corresponding R1 or 2 is initialized
    t.start ();

    }
    }
    }
    public class Task02 {
    public static void main(String args[]) {
    RunnableDemo R1 = new RunnableDemo( "Thread-1");
    R1.start();
    RunnableDemo R2 = new RunnableDemo( "Thread-2");
    R2.start();
    }
    }