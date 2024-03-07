// //Different types of Constructors
// class Box 
// {
//     double width,height,depth;
//     Box()
//     {
//         System.out.println("Default");
//         width=2;
//         height=3;
//         depth=4;
//     }
//     Box(double width,double height,double depth)
//     {
//         System.out.println("Parameterized");
//         this.width = width;
//         this.height = height;
//         this.depth = depth;
//     }
//     Box(Box p)
//     {
//         System.out.println("Copy");
//         width = p.width;
//         height = p.height;
//         depth = p.depth;
//     }
//     double volume()
//     {
//         return width*height*depth;
//     }
// }
// class BoxDemo
// {
//     public static void main(String [] args)
//     {
//         Box b1 = new Box();
//         Box b2 = new Box(10,10,20);
//         Box b3 = new Box(b1);
//         Box b4 = b3; //reference of b3 assigned to b4
//         double v = b4.volume();
//         System.out.println(v);
//     }
// }

// // Method Overloading 
// class Test 
// {
//     void check()
//     {
//         System.out.println("No parameter");
//     }
//     void check(int i)
//     {
//         System.out.println("i: "+i);
//     }
//     void check(int i,int j)
//    {
//        System.out.println("i and j: "+i+" "+j);
//    }
//    double check(double i)
//    {
//        System.out.println("i is: "+i);
//        return i*i;
//    }
// }
// class TestDemo
// {
//     public static void main(String [] args)
//     {
//        Test ob1 = new Test();
//        ob1.check();
//        ob1.check(10);
//        ob1.check(10,20);
//        double p = ob1.check(6.4);
//        System.out.println(p);
//     }
// }

// //passing object as parameter
// class Test 
// {
//    int a,b;
//    Test(int a,int b)
//    {
//        this.a=a;
//        this.b=b;
//    }
//    boolean equals(Test p) //passing object as parameter
//    {
//        if(a==p.a && b==p.b)
//        return true;
//        return false;
//    }
// }
// class TestDemo
// {
//     public static void main(String [] args)
//     {
//        Test ob1 = new Test(10,20);
//        Test ob2 = new Test(10,20);
//        Test ob3 = new Test(3,4);
//        System.out.println("ob1 and ob2: "+ob1.equals(ob2));
//        System.out.println("ob1 and ob3: "+ob1.equals(ob3));
//     }
// }

//passing object
// class Sum
// {
//    int value;
//    Sum(int value)
//    {
//        this.value=value;
//    }
//    void add(Sum a) //passing object as parameter
//    {
//       value=value+a.value;
//       System.out.println(value);
//    }
//    void add(int p) //passing integer variable as parameter
//    {
//        value = value+p;
//        System.out.println(value);
//    }
   
// }
// class SumDemo
// {
//     public static void main(String [] args)
//     {
//       Sum s1 = new Sum(10);
//       Sum s2 = new Sum(20);
//       s1.add(s2);
//       s2.add(7);
//     }
// }
//
//returning object
// class Sum
// {
//    int value;
//    Sum()
//    {
//        value = 5;
//    }
//    Sum(int value)
//    {
//        this.value=value;
//    }
//    Sum add(Sum a) //returning object
//    {
//       Sum temp = new Sum();
//       temp.value=value+a.value;
//       return temp;
//    }
//    Sum add(int p) //returning object
//    {
//        Sum temp = new Sum();
//        temp.value = value+p;
//        return temp;
//    }
//    void display()
//    {
//        System.out.println("Value: "+value);
//    }
   
// }
// class BoxDemo
// {
//     public static void main(String [] args)
//     {
//       Sum s1 = new Sum(10);
//       Sum s2 = new Sum(20);
//       s1 = s1.add(s2);
//       s1.display();
//       //System.out.println(s1); //check this
//       s2 = s2.add(7);
//       s2.display();
//     }
// }



// //week4
// class Test 
// {
//     int a;
//     public int b;
//     private int c;
//     void setc(int i)
//     {
//         c = i;
//     }
//     int getc()
//     {
//         return c;
//     }
// }
// class AccessTest 
// {
//     public static void main(String args[])
//     {
//         Test ob = new Test();
//         ob.a = 10;
//         ob.b = 20;
//         //ob.c;
//         ob.setc(100);
//         System.out.println("a,b and c: "+ob.a+" "+ob.b+" "+ob.getc());
//     }
// }

// //Inheritance 
// class A 
// {
//     int i,j;
//     void showij()
//     {
//         System.out.println("i and j: "+i+" "+j);
//     }
// }
// class B extends A
// {
//     int k;
//     void showk()
//     {
//         System.out.println("k: "+k);
//     }
//     void sum()
//     {
//         System.out.println("i+j+k: "+(i+j+k));
//     }
// }
// class SimpleInheritance 
// {
//     public static void main(String args[])
//     {
//         A superOb = new A();
//         B subOb = new B();
//         superOb.i = 10;
//         superOb.j = 20;
//         System.out.println("Contents of super object: ");
//         superOb.showij();
//         System.out.println();
        
//         subOb.i = 7;
//         subOb.j = 8;
//         subOb.k = 9;
//         System.out.println("Contents of sub object: ");
//         subOb.showij();
//         subOb.showk();
//         System.out.println();
//         System.out.println("Sum of i,j and k: ");
//         subOb.sum();
//     }
// }


// //
// class A 
// {
//     int i;
//     int j;
    
//     void setij(int x,int y)
//     {
//         i = x;
//         j = y;
//     }
// }
// class B extends A
// {
//     int total;
//     void sum()
//     {
//         total = i+j;
//     }
// }
// class Access
// {
//     public static void main(String args[])
//     {
//         B subob = new B();
//         subob.setij(10,20);
//         subob.sum();
//         System.out.println("Total is: "+subob.total);
//     }
// }


//constructors in inheritance
//  class Animal
// {
//     int a;
//     Animal()
//     {
//         System.out.println("Animal constructor");
//     }
//     Animal(int a)
//     {
//         System.out.println("Animal Parameterized");
//         this.a = a;
//     }
// }
// class Dog extends Animal 
// {
//     int b;
//     Dog()
//     {
//         System.out.println("Dog Constructor");
//     }
//     Dog(int b)
//     {
//         System.out.println("Dog Parameterized");
//        // this.a = a;
//         this.b =b;
//     }
    
// }
// class Main
// {
//     public static void main(String args[])
//     {
//         Animal a = new Animal(10);
//         Dog d = new Dog(10);
//     }
// }


// // super (constructor)
// class Box
// {
//     private double length,width;
//     Box()
//     {
//         length = 2;
//         width = 4;
//         System.out.println("length and width: "+length+" "+width);
//     }
//     Box(double l,double w)
//     {
//         length = l;
//         width = w;
//         System.out.println("length and width: "+length+" "+width);
//     }
//     Box(Box b)
//     {
//         length = b.length;
//         width = b.width;
//         System.out.println("length and width: "+length+" "+width);
//     }
    
// }
// class Boxweight extends Box
// {
//     private double weight;
//     Boxweight()
//     {
//         super();
//         weight = 4;
//         System.out.println("weight: "+weight);
//     }
//     Boxweight(double l,double w,double h)
//     {
//         super(l,w);
//         weight = h;
//         System.out.println("weight: "+weight);
//     }
//     Boxweight(Boxweight b)
//     {
//         super(b);
//         weight = b.weight;
//         System.out.println("weight: "+weight);
//     }
    
// }
// class Boxcolor extends Boxweight
// {
//     private String color;
//     Boxcolor()
//     {
//         super();
//         color = "red";
//         System.out.println("color: "+color);
//     }
//     Boxcolor(double l,double w,double h,String p)
//     {
//         super(l,w,h);
//         color = p;
//         System.out.println("color: "+color);
//     }
//     Boxcolor(Boxcolor c)
//     {
//         super(c);
//         color = c.color;
//         System.out.println("color: "+color);
//     }
// }
// class HelloWorld {
//     public static void main(String[] args) {
//         Box b1 = new Box();
//         Box b2 = new Box(10,20);
//         Box b3 = new Box(b1);
        
//         Boxweight w1 = new Boxweight();
//         Boxweight w2 = new Boxweight(10,20,30);
//         Boxweight w3 = new Boxweight(w1);
        
//         Boxcolor c1 = new Boxcolor();
//         Boxcolor c2 = new Boxcolor(10,20,30,"Blue");
//         Boxcolor c3 = new Boxcolor(c1);
       
        
//     }
// }

// //super (member variable)
// class Animal
// {
//     String color = "Purple";
// }
// class Bird extends Animal
// {
//     String color = "Blue";
//     void show()
//     {
//         System.out.println("Color: "+color);
//         System.out.println("Color: "+super.color);
//     }
// }
// class hello
// {
//     public static void main(String args[])
//     {
//         Bird b1 = new Bird();
//         b1.show();
//     }
// }

// //super function overriding (member function)
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
// class hello
// {
//     public static void main(String args[])
//     {
//         Crow b1 = new Crow();
//         b1.show();
//     }
// }


// // Dynamic method dispatch
// class A
// {
//     void show()
//     {
//         System.out.println("class A");
//     }
// }
// class B extends A
// {
//     void show()
//     {
//         System.out.println("class B");
//     }
// }
// class C extends A
// {
//     void show()
//     {
//         System.out.println("class C");
//     }
// }
// class classwork {
//     public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        C c = new C();
       
//        A r;
//        r = a;
//        r.show();
       
//        r = b;
//        r.show();
       
//        r = c;
//        r.show();
//     }
// }

// //static 
// class hello 
// {
//     static int a = 10; //static variable
//     static int b;
//     static  //static block
//     {
//         b = 6;
//     }
//     static void display() //static function
//     {
//         System.out.println("a: "+a);
//         System.out.println("b: "+b);
//     }
//     public static void main(String args[])
//     {
//         display();
//     }
// }

// //outside class - static
// class Test
// {
//     static int a = 10; //static variable
//     static void display() //static function
//     {
//         System.out.println("a: "+a);
//     }
//     void show()
//     {
//         System.out.println("Nothing");
//     }
// }
// class hello 
// {
    
//     public static void main(String args[])
//     {
//         Test t = new Test();
//         Test.display();
//         System.out.println("a: "+Test.a);
//         t.show();
//     }
// }

// //static (sharing same variable)
// import java.util.*;
// class Student
// {
//    static int counter = 0;
//    int id;
//    void getData()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Student ID: ");
//        id = sc.nextInt();
//    }
//    static int Count_student()
//    {
//        counter++;
//        return counter;
//    }
//    void display()
//    {
//        System.out.println("Student number: "+Count_student());
//        System.out.println("Id: "+id);
//    }
   
// }
// class hello 
// {
    
//     public static void main(String args[])
//     {
//         Student s1 = new Student();
//         s1.getData();
//         s1.display();
        
//         Student s2 = new Student();
//         s2.getData();
//         s2.display();
//     }
// }

 //abstract class and abstract method
// abstract class Vehicle
// {
//     void display()
//     {
//         System.out.println("Vehicle");
//     }
//     abstract void show();
// }
// class Car extends Vehicle 
// {
//     void show()
//     {
//         System.out.println("Car");
//     }
// }

// class hello
// {
//     public static void main(String args[])
//     {
//         Vehicle v = new Car();
//         v.show();
//         v.display();
//     }
// }

// //Interface 
// interface Vehicle
// {
//    void SpeedUp(int a);
//    void SpeedDown(int a);
// }
// class Car implements Vehicle 
// {
//    int speed;
//    Car(int speed)
//    {
//        this.speed = speed;
//    }
//    public void SpeedUp(int a)
//    {
//        speed += a;
//        System.out.println("Speed of car: "+speed);
//    }
//    public void SpeedDown(int a)
//    {
//        speed -= a;
//        System.out.println("Speed of car: "+speed);
//    }
// }

// class hello
// {
//     public static void main(String args[])
//     {
//         Vehicle v = new Car(10);
//         v.SpeedUp(4);
//         v.SpeedDown(2);
        
//         Car c = new Car(12);
//         c.SpeedUp(3);
//         c.SpeedDown(1);
        
//     }
// }

// //multiple inheritance through interface
// interface A
// {
//     void show();
// }
// interface B
// {
//     void show();
// }
// class Test implements A,B 
// {
//     public void show()
//     {
//         System.out.println("A and B");
//     }
// }
// class hello 
// {
//     public static void main(String args[])
//     {
//         Test t = new Test();
//         t.show();
//     }
// }