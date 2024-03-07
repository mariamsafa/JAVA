
// abstract class and abstract method
abstract class Vehicle
{
  abstract void show();
    void display()
    {
        System.out.println("Vehicle");
    }
    
}
class Car extends Vehicle 
{
    void show()
    {
        System.out.println("Car");
    }
}

class abstraact
{
    public static void main(String args[])
    {
        Car v = new Car();
        v.show();
        v.display();
    }
}

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




