class child1 extends Thread{
    String name="Humayra";
    public void run() {
        Thread.currentThread().setPriority(10);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name);

                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception caught");
        }
    }
}
class child2 extends Thread
{
    int id = 8;
    public void run()
    {
        Thread.currentThread().setPriority(2);
        try{
            for(int i = 1;i<=5;i++)
            {
                System.out.println(id);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
public class join {
    public static void main(String[] args)
    {
        child1 c1 = new child1();
        child2 c2 = new child2();


        c1.start();
        try
        {
            c1.join();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        c2.start();

    }
}