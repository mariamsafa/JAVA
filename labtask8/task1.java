class EvenPrinter implements Runnable {
    
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            
            System.out.println("Even: " + i);
            
        }
    }
}

class OddPrinter implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
           
        }
    }
}



public class task1 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        evenThread.start();
        oddThread.start();
    }
}