   class thread1 extends Thread{
    private int sum=0;
    public void run(){
        
        for(int i=1;i<=50;i++){
            sum=i+sum;
            
        }

    }
    public int returnsum(){
        
        return sum;
    }
}
 class thread2 extends Thread{
    private int sum=0;
    public void run(){
        
        for(int i=51;i<=100;i++){
            sum=i+sum;
        }

    }
    public int returnsum(){
        
        return sum;
    }
}


public class task9 {
    public static void main(String[] args) {
        int result;
        thread1 t1 = new thread1();
        thread2 t2= new thread2();

        t1.start();
        try{
            t1.join();
            

        }
        catch(InterruptedException e){
            System.out.println("error");
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Error in t2.join()");
        }
        result = t1.returnsum() + t2.returnsum();
        System.out.println(result);

        
    }
}