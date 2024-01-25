//simple class object
/* class box {

    public int width = 5;

    public void volume() {
        System.out.println("worked");

    }
}

public class javaclass {

    public static void main(String args[]) {

        box b1 = new box();//box() is a deafult constructor of box class
        int a = b1.width;
        System.out.println(a);
        b1.volume();
        // box b2 = new box();

    }

} */

//initializing object
/* class box {

    public int width;

    public box(int initializewidth) // constructor doesnt have any retun type.
    {
        width = initializewidth;
        System.out.println(width);

    }

}
public class javaclass {

    public static void main(String args[]) {

        box b1 = new box(1);// passing the value while creating an object because its a constructor.
        
         * if "public void box(int initializewidth) " then the box() function will not
         * be counted as a constructor cz it has a return type
         * void. for that the code will be
         * "box b1= new box();
         * b1.box(1);"
         

    }

} */

//simple class object code
/* class lamp {

    boolean ison;

    public void turnon() {
        ison = true;
        System.out.println(ison);
    }

    void turnoff() {

        ison = false;
        System.out.println(ison);

    }

}
class javaclass {

    public static void main(String args[]) {

        lamp led = new lamp();
        lamp halo = new lamp();

        led.turnon();
        halo.turnoff();

    }

} */

//with satic
/* class javaclass {

    public static int square(int num) {

        return num * num;

    }

    public static void main(String args[]) {

        int result;
        result = square(10);
        System.out.println(result);

    }

} */

//without static
/* class javaclass {

    public int square(int num) {

        return num * num;

    }
    public static void main(String args[]) {
        javaclass safa = new javaclass();
        int result;
        result = safa.square(10);
        System.out.println(result);

    }
}

 /* 
  * using static in a class method, we can call the method
  without creating any object of the class.
  */

 
//method overloading
/* class javaclass {
    private static void display(int a) {

        System.out.println("Arguments :" + a);

    }

    private static void display(double a) {
        System.out.println("Arguments : " + a);
    }

    public static void main(String args[]) {
        display(1);
        display(3.3);

    }

} */


//different type of constructor
class Box 
{
    double width,height,depth;
    Box()
    {
        System.out.println("Default");
        width=2;
        height=3;
        depth=4;
    }
    Box(double width,double height,double depth)
    {
        System.out.println("Parameterized");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box p)
    {
        System.out.println("Copy");
        width = p.width;
        height = p.height;
        depth = p.depth;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class javaclass
{
    public static void main(String [] args)
    {
        Box b1 = new Box();
        Box b2 = new Box(10,10,20);
        Box b3 = new Box(b1);
        Box b4 = b3; //reference of b3 assigned to b4
        double v = b4.volume();
        System.out.println(v);
    }
}

