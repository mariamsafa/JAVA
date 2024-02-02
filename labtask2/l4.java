class vehicle {
    int distance;
    int fuel;
    int time;

    String model, fueltype;
    int year;

    void calefficiency() {

        int result = distance / fuel;
        System.out.println("fuel efficiency  " + result + " main class");

    }

    void calmaxspeed() {

        int result;
        result = distance / time;

        System.out.println("max speed  " + result);
        System.out.println(model + " " + fueltype + " " + " " + year + "main class");

    }

}

class truck extends vehicle {
    truck(int d, int f, int t) {
        model = "pickup";
        fueltype = "diesel";
        year = 2004;
        distance = d;
        fuel = f;
        time = t;

    }

    void calefficiency() {

        int result = distance / fuel;
        System.out.println("for truck :");
        System.out.println("fuel efficiency  " + result);

    }

    void calmaxspeed() {

        int result;
        result = distance / time;

        System.out.println("max speed  " + result);
        System.out.println(model + " " + fueltype + " " + " " + year);
        System.out.println();

    }

}

class car extends vehicle {

    car(int d, int f, int t) {
        model = "corolla";
        fueltype = "petrol";
        year = 2000;
        distance = d;
        fuel = f;
        time = t;

    }

    void calefficiency() {

        int result = distance / fuel;
        System.out.println("for car :");
        System.out.println("fuel efficiency  " + result);

    }

    void calmaxspeed() {

        int result;
        result = distance / time;
        System.out.println("max speed  " + result);
        System.out.println(model + " " + fueltype + " " + " " + year);
        System.out.println();

    }

}

class motorcycle extends vehicle {

    motorcycle(int d, int f, int t) {
        model = "guxer";
        fueltype = "petrol";
        year = 2007;
        distance = d;
        fuel = f;
        time = t;

    }

    void calefficiency() {

        int result = distance / fuel;
        System.out.println("for motorcycle :");
        System.out.println("fuel efficiency  " + result);

    }

    void calmaxspeed() {

        int result;
        result = distance / time;
        System.out.println("max speed  " + result);
        System.out.println(model + " " + fueltype + " " + " " + year);
        System.out.println();

    }

}

class l4 {

    public static void main(String args[]) {

        truck ob1 = new truck(100, 20, 10);
        ob1.calefficiency();
        ob1.calmaxspeed();
        car ob2 = new car(300, 50, 20);
        ob2.calefficiency();
        ob2.calmaxspeed();
        motorcycle ob3 = new motorcycle(400, 30, 23);
        ob3.calefficiency();
        ob3.calmaxspeed();

    }

}
