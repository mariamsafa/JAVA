
class mythread1 extends Thread {

    public void run() {
       // while (true) {
            System.out.println("thread 1");
           
        //}
    }

}

class mythread2 extends Thread {

    public void run() {
        //while (true) {
            System.out.println("thread 2");
            
        //}

    }

}

public class extendsthread {
    public static void main(String[] args) {

        mythread1 t1= new mythread1();
        mythread2 t2= new mythread2();
        System.out.println("thread 1: "+ t1);
        t1.start();
        t2.start();


    }
}