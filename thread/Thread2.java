/* class Counter {
     int count ;
     Counter(int c){
        count=c;
     }

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to decrement the count
    public synchronized void decrement() {
        count--;
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }
}

public class multiplethreads {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        // Create multiple threads to increment and decrement the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // Start the threads
        incrementThread.start();
        decrementThread.start();

        // Wait for threads to complete
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
 */
// Class-Main
public class Thread2 {
 
    // Main Driver Method
    public static void main(String[] args) throws Exception
    {
 
        // Creating a thread
        MyThread thread = new MyThread();
 
        // Naming thread as "Java"
        thread.setName("Java");
 
        // Start the functioning of a thread
        thread.start();
 
        // Sleeping thread for specific amount of time
        Thread.sleep(500);
 
        // Thread Java suspended temporarily
        thread.suspend();
 
        // Display message
        System.out.println(
            "Thread going to sleep for 5 seconds");
 
        // Sleeping thread for specific amount of time
        Thread.sleep(5000);
 
        // Display message
        System.out.println("Thread Resumed");
 
        // Thread Java resumed
        thread.resume();
    }
}