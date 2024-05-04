/* //Main thread
class currentThreadDemo
 {
     public static void main(String args[])
     {
         Thread t = Thread.currentThread();
         System.out.println("Current Thread: "+t.getName());
         t.setName("My thread");
         System.out.println("After name change: "+t);
     }
 } */


class classworkth  {
    public static void main(String args[]) {
        Thread t = Thread.currentThread(); // Obtaining a reference to the current thread
        System.out.println("Current Thread: " + t.getName()); // Printing the name of the current thread
        t.setName("My thread"); // Changing the name of the current thread
        System.out.println("After name change: " + t); // Printing the thread after the name change
    }
}

//output:
/* Current Thread: Thread[#1,main,5,main]
After name change: Thread[#1,My thread,5,main]

here 5 is the default priority and my thread is the thread's name and "main" is still the name of the thread group. 
 */




//Creating a thread using runnable interface

/* public class ExampleClass implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
        Thread t = new Thread (ec);
        t.start();
    }
}
 */



//Extending a thread 

/* class Test extends Thread 
 {
     public void run()
     {
         System.out.println("Print something");
     }
     public static void main(String args[])
     {
         Test t = new Test();
         t.start();
     }
 } */


 //Creating Multiple Threads
/* class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class classworkthread {

    
    public static void main(String[] args) {
           int n = 8; // Number of threads
           for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();

    }
    
}
} */





//Synchronized
class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

public class classworkthread {
   
       public static void main(String[] args) {
           
    Callme target = new Callme();
    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target, "Synchronized");
    Caller ob3 = new Caller(target, "World");
    // wait for threads to end
    try {
    ob1.t.join();
    ob2.t.join();
    ob3.t.join();
    } catch(InterruptedException e) {
    System.out.println("Interrupted");
    }
    }
   
   }