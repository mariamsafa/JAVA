// class Table{
//     synchronized void printTable(int n){
//           for(int i=1;i<=5;i++){
//               System.out.println(n*i);
//               try{
//                   Thread.sleep(1000);
//               }catch(Exception e){System.out.println(e);}
//           }
//   ​
//       }
//   }
//   ​
//   class MyThread1 extends Thread{
//       Table t;
//       MyThread1(Table t){
//           this.t=t;
//       }
//       public void run(){
//           t.printTable(5);
//       }
//   ​
//   }
//   class MyThread2 extends Thread{
//       Table t;
//       MyThread2(Table t){
//           this.t=t;
//       }
//       public void run(){
//           t.printTable(100);
//       }
//   }
//   ​
//    public class sync{
//       public static void main(String args[]){
//           Table obj = new Table();
//           MyThread1 t1=new MyThread1(obj);
//           MyThread2 t2=new MyThread2(obj);
//           MyThread1 t3 = new MyThread1(obj);
//           t1.start();
//         /* try
//           {
//               t1.join();
//           }
//           catch(Exception e)
//           {
//               System.out.println(e);
//           }*/
//           t2.start();
//          t3.start();
//       }
//   }




//Synchronized
/* class Callme {
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
   
   } */


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





class Counter {
    private int count = 0;
  
    public synchronized void increment() {
      count++;
    }
  
    public void printCount() {
      System.out.println("Count: " + count);
    }
  }
  
  public class SyncTest {
    public static void main(String[] args) {
      Counter counter = new Counter();
  
      Thread thread1 = new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
          counter.increment();
        }
      });
  
      Thread thread2 = new Thread(() -> {
        for (int i = 0; i < 1000; i++) {
          counter.increment();
        }
      });
  
      thread1.start();
      thread2.start();
  
      // Wait for threads to finish
      try {
        thread1.join();
        thread2.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  
      counter.printCount();
    }
  }
  