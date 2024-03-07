 class Animal {

    // method in the superclass
    public void eat() {
      System.out.println("I can eat");
    }
  }
  
  // Dog inherits Animal
  class Dog extends Animal {
  
    // overriding the eat() method
    
    public void eat() {
      System.out.println("I eat dog food");
    }
  
    // new method in subclass
    public void bark() {                                                                                     
      System.out.println("I can bark");
    }
  }

  class cat extends Animal{
    public void eat() {
      System.out.println("I eat cat food");
    }
  }
  
  class overriding {
    public static void main(String[] args) {
  
      // create an object of the subclass
      //Animal ob1=new Animal();
      Dog labrador = new Dog();
      cat ob = new cat();
  
      // call the eat() method
      //labrador.eat();
      //labrador.bark();
      //ob1.eat();
      ob.eat();
    }
  } 


  //super function overriding (member function)
// class Animal
// {
//     void show()
//     {
//         System.out.println("Animal");
//     }
// }
// class Bird extends Animal
// {
//     void show()
//     {
//         super.show();
//         System.out.println("Bird");
//     }
// }
// class Crow extends Bird 
// {
//     void show()
//     {
//         super.show();
//         System.out.println("Crow");
//     }
// }
// class overriding
// {
//     public static void main(String args[])
//     {
//         Crow b1 = new Crow();
//         Animal b2= new Animal();
//         b1.show();
//         b2.show();
//     } 
// }

//this code shows the same output wihtout using super();
// class Animal
// {
//     Animal()
//     {
//         System.out.println("Animal");
//     }
// }
// class Bird extends Animal
// {
//      Bird()
//     {
//         //super.show();
//         System.out.println("Bird");
//     }
// }
// class Crow extends Bird 
// {
//      Crow()
//     {
//         //super.show();
//         System.out.println("Crow");
//     }
// }
// class overriding
// {
//     public static void main(String args[])
//     {
//         Crow b1 = new Crow();
//         System.out.println();
//         //Animal b2= new Animal();
//        // b1.show();
//         //b2.show();
//     } 
// }