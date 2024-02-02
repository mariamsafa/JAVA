import java.util.*;

class shape {

    double pi = 3.1416, r;

    void getPerimeter() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = input.nextDouble();

    }

    void getarea() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = input.nextDouble();
    }

}

class circle extends shape {
    void getPerimeter() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = input.nextDouble();
        System.out.println("perimeter is " + 2 * pi * r);

    }

    void getarea() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = input.nextDouble();
        System.out.println("Area is " + 2 * pi * r * r);

    }
    // void showper() {
    // getPerimeter();
    // System.out.println("perimeter is " + 2 * pi * r);

    // }

    // void showarea() {
    // getarea();
    // System.out.println("Area is " + 2 * pi * r * r);

    // }

}

class l2 {

    public static void main(String args[]) {
        circle ob1 = new circle();
        ob1.getPerimeter();
        ob1.getarea();

    }

}