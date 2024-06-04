class thread1 extends Thread{
    //private int sum=0;
    public void run(){
        
        for(char letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
            
        }

    }
    
}
 class thread2 extends Thread{
    //private int sum=0;
    public void run(){
        
        for(char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
            
        }

    }
    
}


public class task10 {
    public static void main(String[] args) {
        int result;
        thread1 t1 = new thread1();
        thread2 t2= new thread2();

        t1.start();
        t2.start();
        // try{
        //     t1.join();
            

        // }
        // catch(InterruptedException e){
        //     System.out.println("error");
        // }
        // t2.start();
        // try {
        //     t2.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Error in t2.join()");
        // }
       

        
    }
}