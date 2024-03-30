//try...catch block
//  class exceptions{
//     public static void main(String[] args) {
//         try {
//             int b =5/0;
//             System.out.println("Rest");
//         }
//         catch (ArithmeticException e){
//             System.out.println("arithmeticexception " + e.getMessage());
//         }
//     }
// } 



//finally block
/* In Java, the finally block is always 
executed no matter whether there is an exception or not. */

// class exceptions {
//     public static void main(String[] args) {
//         try {
//             int a = 10 / 0;
//             System.out.println("its okey");
//         } catch (ArithmeticException t) {
//             System.out.println("arithmetic exception happened");

//         } finally {
//             System.out.println("this is final block");
//         }
//     }
// }


//throw and throws

//throw
// public class exceptions {
//     public static void main(String[] args) {
//         int dividend = 10;
//         int divisor = 0;
        
//         try {
//             if (divisor == 0) {
                
//                 throw new ArithmeticException("Cannot divide by zero");
//             }
//             int result = dividend / divisor; 
//             System.out.println("Result: " + result); 
//         } catch (ArithmeticException e) {
            
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }
// }

//throws 
// public class exceptions {
    
//     public static void validateAge(int age) throws IllegalArgumentException {
//         if (age < 0) {
            
//             throw new IllegalArgumentException("Age cannot be negative");
//         }
//         System.out.println("Valid age: " + age);
//     }

//     public static void main(String[] args) {
//         try {
           
//             validateAge(-5);
//         } catch (IllegalArgumentException e) {
            
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }
// }

//throws without try catch block
// class exceptions 
// {
//     public static void validate(int age) throws IllegalArgumentException
//     {
//         if(age<0)
//         {
//             throw new IllegalArgumentException("Not eligible");
//         }
//         else
//         {
//             System.out.println("Eligible");
//         }
//     }
//     public static void main(String args[])
//     {
//         validate(-13);
//     }
// }

//throws with multiple exceptions
// import java.util.Arrays;
// public class exceptions {
//     public static void main(String[] args) {
//         try {
//             processInput(10);
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//         }
//     }

  
//     public static void processInput(int index) throws ArithmeticException, ArrayIndexOutOfBoundsException {
//         int[] array = {1, 2, 3};
//         if (index < 0) {
            
//             throw new ArithmeticException("Negative index");
//         } else if (index >= array.length) {
          
//             throw new ArrayIndexOutOfBoundsException("Index out of bounds");
//         } else {
            
//             System.out.println("Element at index " + index + ": " + array[index]);
//         }
//     }
// }









