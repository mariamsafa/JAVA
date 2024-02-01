//different type of constructor
class Box {
    double width, height, depth;

    Box() {
        System.out.println("Default");
        width = 2;
        height = 3;
        depth = 4;
        System.out.println(width+" "+ height+" " +depth);
    }

    Box(double width, double height, double depth) {
        System.out.println("Parameterized");
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println(width+" "+ height+" " +depth);

    }

    Box(Box p) {
        System.out.println("Copy");
        width = p.width;
        height = p.height;
        depth = p.depth;
        System.out.println(width+" "+ height+" " +depth);

    }

    double volume() {
        return width * height * depth;
    }
}

class constructor {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 10, 20);
        Box b3 = new Box(b1);
        Box b4 = b3; // reference of b3 assigned to b4
        double v = b4.volume();
        System.out.println(v);
    }
}


/* class main {

    public String name;

    main() {

        System.out.println("called default");
        name = "safa";

    }

}

class constructor {
    public static void main(String args[]) {

    main ob1= new main();
    System.out.println("The name is "+ob1.name);

    }
} */
