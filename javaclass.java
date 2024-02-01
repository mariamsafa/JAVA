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
         * be counted as a constructor cz it has a return type void. for that the code will be
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
   using static in a class method, we can call the method
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

/*create a vehicle class. This class must have two member variables and one member function.
This class must have two child classes. Both of the child classes must have one member variable and function
and must override the function from the parent class. Implement the code using c++.*/
/*
#include <iostream>
using namespace std;


class Vehicle {
  public:
    int wheels;
    int speed;
    void drive() {
      cout << "Driving the vehicle" << endl;
    }
};

class Car : public Vehicle {
  public:
    string carr;
    void drive() {
      cout << "D riving the car" <<endl;
    }
};

class Motorcycle : public Vehicle {
  public:
    string bike;
    void drive() {
      cout << "Riding the motorcycle" <<endl;
    }
};
int main() {


    Car gari;
    Vehicle garii;
    Motorcycle gariii;
    garii.drive();
    gari.drive();
    gariii.drive();

    return 0;
}
*/

#include <iostream>
using namespace std;


class Time{
  public:
    int hours;
    int minute;
    int seconds;

    Time(int a , int b, int c){
        hours=a;
        minute=b;
        seconds=c;
    }

    Time(){
        hours=10;
        minute=50;
        seconds=20;
    }


    Time add_time(Time a, Time b){
       Time c;
       c.hours=a.hours+b.hours;
       c.minute= a.minute+b.minute;
       c.seconds=a.seconds+ b.seconds;

       c.minute+=c.seconds/60;
       c.seconds=c.seconds%60;

       c.hours+=c.minute/60;
       c.minute=c.minute%60;

       return c;


    }

    void display()
    {
        cout<<hours<<":"<<minute<<":"<<seconds<<endl;
    }

};

int main()
{

    Time one(2,55,40);
    Time two(5,20,30);
    Time three;
    three=three.add_time(one, two);
    three.display();



}
