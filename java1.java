
//input output and data types
import java.util.Scanner;

public class java1 {
  public static void main(String args[]){
 
    Scanner input= new Scanner(System.in);
    int num= input.nextInt();
    double num1=input.nextDouble();
    
    long l =input.nextLong();
    //System.out.printf("%d %.2f %d%n ",num,num1,l);
    //input.nextLine(); 
    /* 
    input.nextLine() is used to consume the extra new line when we press the enter key to execute a program*/

    String num2= input.next();
    System.out.println(num+num1+l+num2);
    input.close(); 
   /*  when we add any intereger or double number with a string, 
    in java the numbers are considered as string and concatinated with the string
    example : 23.4hello 
    here 23.4 converted into a string tho it was a double number*/
     
   } 
    
} 









