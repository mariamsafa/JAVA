/* class Box
{
     double length,width;
    Box()
    {
        length = 2;
        width = 4;
        System.out.println("length and width: "+length+" "+width);
        

    }
    Box(double l,double w)
    {
        length = l;
        width = w;
        System.out.println("length and width: "+length+" "+width);

    }
    Box(Box b)
    {
        length = b.length;
        width = b.width;
        System.out.println("length and width: "+length+" "+width);

    }

}
class Boxweight extends Box
{
   double weight;
    Boxweight()
    {
        super();
        weight = 5;
        System.out.println("weight: "+weight);
        System.out.println();


    }
    Boxweight(double l,double w,double h)
    {
        super(l,w);
        weight = h;
        System.out.println("weight: "+weight);
        System.out.println();

    }
    Boxweight(Boxweight b)
    {
        super(b);
        weight = b.weight;
        System.out.println("weight: "+weight);
        System.out.println();

    }

}
class Boxcolor extends Boxweight
{
    private String color;
    Boxcolor()
    {
        super();
        color = "red";
        System.out.println("color: "+color);
    }
    Boxcolor(double l,double w,double h,String p)
    {
        super(l,w,h);
        color = p;
        System.out.println("color: "+color);
    }
    Boxcolor(Boxcolor c)
    {
        super(c);
        color = c.color;
        System.out.println("color: "+color);
    }
}
class superj {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10,20);
        Box b3 = new Box(b1);
        System.out.println();

        Boxweight w1 = new Boxweight();
        Boxweight w2 = new Boxweight(10,20,30);
        Boxweight w3 = new Boxweight(w1);

        Boxcolor c1 = new Boxcolor();
        Boxcolor c2 = new Boxcolor(10,20,30,"Blue");
        Boxcolor c3 = new Boxcolor(c1);

    }
} */

//super (member variable)
// class Animal
// {
//     String color = "Purple";
// }
// class Bird extends Animal
// {
//     String color = "Blue";
//     void show()
//     {
//         System.out.println(color);
//         System.out.println(super.color);

//     }
// }
// class superj
// {
//     public static void main(String args[])
//     {
//         Bird b1 = new Bird();
//         b1.show();
//     }
// }

//super function overriding (member function)
  class Animal
  {
      void show()                                                        
      {
          System.out.println("Animal");
      }
  } 
  class Bird extends Animal
  {
      void show()
      {
          super.show();
          System.out.println("Bird");
      }
  }
  class Crow extends Bird 
  {
      void show()
      {
          super.show();
          System.out.println("Crow");
      }
  }
  class superj
  {
      public static void main(String args[])
      {
          Crow b1 = new Crow();
          b1.show();
      } 
  }

//super keyword to access constructor

// class animal {
//     animal() {
//         System.out.println("animal");
//     }

//     animal(int a, int b) {
//         System.out.println(a + b);
//     }
// }

// class dog extends animal {
//     dog() {
//         //super();// must be first in the subclass constructor
//         /* super() is not compulsory. এটা use না করলেও superclass এর default
//          constructor একাই কল হবে */
//         //super(3, 4); //এখানে এই ফাংশন কল করলে তখন আর  super() একা একা কল হবেনা
       
//         System.out.println("dog");
       

//     }

//     dog(int a, int b) {
//         //super(3, 4);// always must be the first statement of subclass para constructor.
//         System.out.println(a + b);
//     }
// }

// class crow extends animal{
//     crow(){
//         super(3, 4);
//         System.out.println("crow");

//     }
//     crow(int a,int b){
//         //super(3, 4);
//         System.out.println(a+b);

//     } 
// }


// class superj {
//     public static void main(String args[]) {
//         dog ob = new dog();
//         dog ob1 = new dog(1, 2);
//         crow ob2= new crow();
//         crow ob3= new crow(2,3);

//     }
// }


