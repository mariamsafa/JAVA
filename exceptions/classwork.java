/* //multiple catch clauses
class Hello
{
    public static void main(String args[])
    {
        try{
            int a = 42/0;
            int c[]={1};
            c[4]=3;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("code After try/catch block");
        }
    }
}
*/

//throw keyword

// class classwork 
// {
//     public static void validate(int age)
//     {
//         if(age<18)
//         {
            
//             throw new ArithmeticException("Not eligible");
            
//         }
//         else
//         {
//             System.out.println("Eligible");
//         }
//     }
//     public static void main(String args[])
//     {
//         validate(13);
       
//     }
// } 


// throws keyword
// import java.io.*;

// class HelloWorld {
    
//     public static void method() throws IOException
//     {
//       System.out.println("Exception caught");
//     }

//     public static void main(String[] args) {
//         try 
//         {
//             method();
//         }
//         catch(IOException e)
//         {
//             System.out.println("Exception handled");
//         }
      
//     }
// }

/*import java.util.*;
class CarException extends Exception
{
    int seat;
    CarException(int seat)
    {
        this.seat=seat;
    }

}

class Car
{
    int seat_number;
    Car(int seat_number) throws CarException
    {
        if(seat_number>4)
        {
            throw new CarException(seat_number);
        }
        else {
            this.seat_number = seat_number;
            System.out.println("Total seat_number: "+seat_number);
        }
    }

}


public class Main {
    public static void main(String[] args)
    {
        try
        {

            Car c1 = new Car(3);
        }
        catch(CarException e)
        {
            System.out.println("Car seat number cannot be more than 4");

        }
    } */

    /* 
class MyException extends Exception
{
    private int detail;
    MyException(int a)
    {
        detail = a;
    }
    public String toString()
    {
        return "MyException["+detail+"]";
    }
}
public class ExceptionClasses {

    static void compute(int a) throws MyException
    {
        System.out.println("Called compute("+a+")");
        if(a>10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            compute(1);
            compute(20);
        }
        catch(MyException e)
        {
            System.out.println("Caught "+e);
        }
    }
    
} 
*/

/* 
class InsufficientFundsException extends Exception
{
    private double amount;
    InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    double getAmount()
    {
        return amount;
    }
}
class CheckingAccount
{
    private double balance;
    private int number;
    CheckingAccount(int number)
    {
        this.number = number;
    }
    void deposit(double amount)
    {
        balance +=amount;
    }
    void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount<=balance)
        {balance-=amount;}
        else
        {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    double getBalance()
    {
        return balance;
    }
    int getNumber()
    {
        return  number;
    }
}
public class JavaApplication5 {

   
    
    public static void main(String[] args) {
        // TODO code application logic here
        CheckingAccount c = new CheckingAccount(101);
        c.deposit(500);
        try 
        {
            c.withdraw(100);
            c.withdraw(600);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println("Sorry but you are short : "+e.getAmount());
        }
    }
    
}*/



/*class NestedTry { 
  
    public static void main(String args[]) 
    { 
        // Main try block 
        try { 
  
            // initializing array 
            int a[] = { 1, 2, 3, 4, 5 }; 
  
            // trying to print element at index 5 
             System.out.println(a[5]); 
  
            // try-block2 inside another try block 
            try { 
                //int a[]={1,2,3,4,5};
                // performing division by zero 
                int x = a[2] / 0; 
            } 
            catch (ArithmeticException e2) { 
                System.out.println("division by zero is not possible"); 
            } 
        } 
        catch (ArrayIndexOutOfBoundsException e1) { 
            System.out.println("ArrayIndexOutOfBoundsException"); 
            System.out.println("Element at such index does not exists"); 
        } 
    } 
    
}  */