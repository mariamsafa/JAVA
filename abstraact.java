
// // abstract class and abstract method
// abstract class Vehicle
// {
//   abstract void show();
//     void display()
//     {
//         System.out.println("Vehicle");
//     }
    
// }
// class Car extends Vehicle 
// {
//     void show()
//     {
//         System.out.println("Car");
//     }
// }

// class abstraact
// {
//     public static void main(String args[])
//     {
//         Car v = new Car();
//         v.show();
//         v.display();
//     }
// }

// abstract class Language {

//   // method of abstract class
//   public void display() {
//     System.out.println("This is Java Programming");
//   }
// }

// class Main extends Language {

// }

// class abstraact {
//   public static void main(String[] args) {

//     Main obj = new Main(); /* we cannot create any objs for abstract classes but indirectly we can use the
//                            methods of the abstract class by using child class. */
//     obj.display();
//   }
// }





//Interface 
interface Vehicle
{
   void SpeedUp(int a);
   void SpeedDown(int a);
}
class Car implements Vehicle 
{
   int speed;
   Car(int speed)
   {
       this.speed = speed;
   }
   public void SpeedUp(int a)
   {
       speed += a;
       System.out.println("Speed of car: "+speed);
   }
   public void SpeedDown(int a)
   {
       speed -= a;
       System.out.println("Speed of car: "+speed);
   }
}

class abstraact
{
    public static void main(String args[])
    {
        Vehicle v = new Car(10);
        v.SpeedUp(4);
        v.SpeedDown(2);
        
        Car c = new Car(12);
        c.SpeedUp(3);
        c.SpeedDown(1);
        
    }
}