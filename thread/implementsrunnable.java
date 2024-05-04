


class myrunnable1 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("thread 1");
           
        }
       

    }

}
class myrunnable2 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("thread 2");
           
        }

    }

}

public class implementsrunnable {
    public static void main(String[] args) {
        myrunnable1 bullet1= new myrunnable1();
        Thread gun1= new Thread(bullet1);
        myrunnable2 bullet2= new myrunnable2();
        Thread gun2= new Thread(bullet2);
        gun1.start();
        gun2.start();

        /* Thread gun1= new Thread(new myrunnable1());
        gun1.start(); 
 */

        
    }
}
