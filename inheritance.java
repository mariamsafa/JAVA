//example1
/* clas {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class inheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of super object: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of sub object: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i,j and k: ");
        subOb.sum();
    }
}
 */
//example2
/* class A {
    int i;
    int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int total;

    void sum() {
        total = i + j;
    }
}

class inheritance {
    public static void main(String args[]) {
        B subob = new B();
        subob.setij(10, 20);
        subob.sum();
        System.out.println("Total is: " + subob.total);
    }
} */

//example3
/* class Animal {
    int a;

    Animal() {
        System.out.println("Animal constructor");
    }

    Animal(int a) {
        System.out.println("Animal Parameterized");
        this.a = a;
    }
}

class Dog extends Animal {
    int b;

    Dog() {
        System.out.println("Dog Constructor");
    }

    Dog(int b) {
        System.out.println("Dog Parameterized");
        // this.a = a;
        this.b = b;
    }

}

class puppy extends Dog {
    int c;


    puppy() {
        System.out.println("puppy constructor");

    }

    puppy(int c) {
        System.out.println("puppy parameterized");
        this.c = c;
    }

}

class inheritance {
    public static void main(String args[]) {
        Animal a = new Animal(10);
        Dog d = new Dog(10);
        puppy r = new puppy(2);
    }
} 
*/


// super (constructor)
 class Box
{
    private double length,width;
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
    private double weight;
    Boxweight()
    {
        super();
        weight = 4;
        System.out.println("weight: "+weight);
    }
    Boxweight(double l,double w,double h)
    {
        super(l,w);
        weight = h;
        System.out.println("weight: "+weight);
    }
    Boxweight(Boxweight b)
    {
        super(b);
        weight = b.weight;
        System.out.println("weight: "+weight);
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
class inheritance {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10,20);
        Box b3 = new Box(b1);
        
        Boxweight w1 = new Boxweight();
        Boxweight w2 = new Boxweight(10,20,30);
        Boxweight w3 = new Boxweight(w1);
        
        Boxcolor c1 = new Boxcolor();
        Boxcolor c2 = new Boxcolor(10,20,30,"Blue");
        Boxcolor c3 = new Boxcolor(c1);
       
        
    }
}
 




















































 =