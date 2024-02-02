
class Box {
    private double length, width;

    Box() {
        length = 2;
        width = 4;
        System.out.println("length and width: " + length + " " + width);
    }

    Box(double l, double w) {
        length = l;
        width = w;
        System.out.println("length and width: " + length + " " + width);
    }

    Box(Box b) {
        length = b.length;
        width = b.width;
        System.out.println("length and width: " + length + " " + width);
    }

}

class Boxweight extends Box {
    private double weight;

    Boxweight() {
        super();
        weight = 4;
        System.out.println("weight: " + weight);
    }

    Boxweight(double l, double w, double h) {
        super(l, w);
        weight = h;
        System.out.println("weight: " + weight);
    }

    Boxweight(Boxweight b) {
        super(b);
        weight = b.weight;
        System.out.println("weight: " + weight);
    }

}

class Boxcolor extends Boxweight {
    private String color;

    Boxcolor() {
        super();
        color = "red";
        System.out.println("color: " + color);
    }

    Boxcolor(double l, double w, double h, String p) {
        super(l, w, h);
        color = p;
        System.out.println("color: " + color);
    }

    Boxcolor(Boxcolor c) {
        super(c);
        color = c.color;
        System.out.println("color: " + color);
    }
}

class shipment extends Boxcolor {
    public double cost;

    shipment() {
        super();
        cost = 10;
        System.out.println("cost " + cost);
    }

    shipment(double l, double w, double h, String p, double c) {
        super(l, w, h, p);
        cost = c;
        System.out.println("cost: " + cost);
    }

    shipment(shipment c) {
        super(c);
        cost = c.cost;
        System.out.println("cost: " + cost);
    }

}

class recieved extends shipment {
    public boolean boxarrived;

    recieved() {
        super();
        cost = 10;
        System.out.println("boxarrived " + cost);
    }

    recieved(double l, double w, double h, String p, double c, boolean s) {
        super(l, w, h, p, c);
        boxarrived = s;
        System.out.println("boxarrived: " + boxarrived);
    }

    recieved(recieved c) {
        super(c);
        boxarrived = c.boxarrived;
        System.out.println("boxarrived: " + boxarrived);
    }

}

class l8 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 20);
        Box b3 = new Box(b1);

        Boxweight w1 = new Boxweight();
        Boxweight w2 = new Boxweight(10, 20, 30);
        Boxweight w3 = new Boxweight(w1);

        Boxcolor c1 = new Boxcolor();
        Boxcolor c2 = new Boxcolor(10, 20, 30, "Blue");
        Boxcolor c3 = new Boxcolor(c1);

        shipment s1 = new shipment();
        shipment s2 = new shipment(10, 20, 30, "color", 1000);
        shipment s3 = new shipment(s1);

        recieved r1 = new recieved();
        recieved r2 = new recieved(10, 20, 30, "color", 20, true);
        recieved r3 = new recieved(r1);

    }
}
