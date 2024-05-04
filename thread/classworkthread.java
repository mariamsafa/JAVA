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
class MultithreadingDemo implements Runnable {
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
}