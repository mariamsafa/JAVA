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



// interface geo{
//     void getarea();
//     void perimeter();
// }

// class circle implements geo{

// }


// class rec implements geo{

// }

interface GeometricObject{
     double getArea();
     double getPerimeter();
}
class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

   
    public double getArea() {
        return Math.PI * radius * radius;
        // Alternatively, you can directly use "radius" since there's no superclass.
    }

    public double getPerimeter() {
        return 2 * Math.PI *radius;
        // Alternatively, you can directly use "radius" since there's no superclass.
    }
}

class Rectangle implements GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
        // Alternatively, you can directly use "width" and "height" since there's no superclass.
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
        // Alternatively, you can directly use "width" and "height" since there's no superclass.
    }
}


public class midexampractice {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        //GeometricObject rectangle = new Rectangle(4, 6);

        // Dynamic method dispatch
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        circle =new Rectangle(4, 6);

        System.out.println("Rectangle Area: " + circle.getArea());
        System.out.println("Rectangle Perimeter: " + circle.getPerimeter());
    }
}