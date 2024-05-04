
class safa extends Thread {
    public safa(String name) {

        super(name);
    }

    public void run() {
      
        System.out.println("hello" + this.getName());
      
            
        
        
    }
}

public class threadprio {
public static void main(String[] args) {
    safa t1 = new safa("1");
    safa t2= new safa("2");
    safa t3= new safa("3");
    safa t4= new safa("4");
    safa t5= new safa("5");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(1);
    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    int priority = t1.getPriority();
    System.out.println("priority is "+ priority);
}
  
}
