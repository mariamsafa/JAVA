// interface shape {
    

//     public void getarea();

//     public void getper();

// }

// class rec implements shape {
//     int length, width, area, perimeter;

//     rec(int a, int b) {
//         length = a;
//         width = b;
//     }

//     public void getarea() {
//         area = length * width;
//     }

//     public void getper() {
//         perimeter = 2 * (length + width);
//     }

//     void display() {
//         System.out.println(area + " " + perimeter);
//     }
// }

// class triangle implements shape {
//     double base, h, a, c, area, perimeter;

//     triangle(int a, int b, int p, int q){
//         base=a;
//         h=b;
//         a=p;
//         c=q;
//     }
//     public void getarea() {
//         area = 0.5 * base*h;
//     }

//     public void getper() {
//         perimeter = base+a+c;
//     }

//     void display() {
//         System.out.println(area + " " + perimeter);
//     }

// }

// class interfacee{
//     public static void main (String atgs[]){
//         rec ob1= new rec(2,3);
//         ob1.getarea();
//         ob1.getper();
//         ob1.display();
//         triangle ob2= new triangle(1,2 , 3 , 4);
//         ob2.getarea();
//         ob2.getper();
//         ob2.display();

//     }
// }
interface DemoInterface  
{   
//default method   
 void display() ;  
  
}   
//interface without default method  
interface DemoInterface1 extends DemoInterface  
{   
      
}   
//interface without default method  
interface DemoInterface2 extends DemoInterface  
{  
      
}   
//implementation class code   
public class interfacee implements DemoInterface1, DemoInterface2  
{   
public static void main(String args[])   
{   
interfacee obj = new interfacee();   
//calling method  
obj.display();   
}   
}  