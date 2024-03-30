import java.util.Scanner;

interface Electrified {
    public int getChargeCapacity();

    public double getCurrentCharge();

    public void setCurrentCharge(double charge);

}
 
class Bicycle {
    double frameSize;
    int nGears;
    int currentGear;

    Bicycle(double frameSize, int nGears) {
        this.frameSize = frameSize;
        this.nGears = nGears;
        System.out.println("Bicycle elements : " + frameSize + " " + nGears);

    }

}

class CargoBicycle extends Bicycle {
    double maxLoad;
    double currentLoad;

    CargoBicycle(double frameSize, int nGears, double maxLoad) {
        super(2, 3);
        this.frameSize = frameSize;
        this.nGears = nGears;
        this.maxLoad = maxLoad;
        System.out.println("CargoBicycle elements : " + frameSize + " " + nGears + " " + maxLoad);
    }

}

class ElectricCargoBicycle extends CargoBicycle implements Electrified {
    ElectricCargoBicycle(double frameSize, int nGears, double maxLoad) {
        super(1, 8, 9);
        this.frameSize = frameSize;
        this.nGears = nGears;
        this.maxLoad = maxLoad;
        System.out.println("ElectricCargoBicycle elements : " + frameSize + " " + nGears + " " + maxLoad);

    }

    int batteryCapacity;
    double getCurrentCharge;

    public int getChargeCapacity() {
        System.out.println("Enter getChargeCapacity :");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(" batteryCapacity2 :" + batteryCapacity);
        return a;

    }

    public double getCurrentCharge() {
        System.out.println("Enter getCurrentCapacity :");
        Scanner input = new Scanner(System.in);
        getCurrentCharge = input.nextInt();
        return getCurrentCharge;

    }

    public void setCurrentCharge(double charge) {
        System.out.println(" charge :" + charge);

    }

}

class ElectricBicycle extends Bicycle implements Electrified {

    ElectricBicycle(double frameSize, int nGears) {
        super(4, 5);
        this.frameSize = frameSize;
        this.nGears = nGears;
        System.out.println("ElectricBicycle elements : " + frameSize + " " + nGears);

    }

    int batteryCapacity;
    double getCurrentCharge;

    public int getChargeCapacity() {
        System.out.println("Enter getChargeCapacity :");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(" batteryCapacity1 :" + batteryCapacity);
        return a;

    }

    public double getCurrentCharge() {
        System.out.println("Enter getCurrentCapacity :");
        Scanner input = new Scanner(System.in);
        getCurrentCharge = input.nextInt();
        return getCurrentCharge;

    }

    public void setCurrentCharge(double charge) {
        System.out.println(" charge :" + charge);

    }

}

class main2 {
    public static void main(String args[]) {

        ElectricCargoBicycle ob1 = new ElectricCargoBicycle(10, 20, 30);
        ob1.batteryCapacity = 100;
        int a = ob1.getChargeCapacity();
        System.out.println(" getChargeCapacity :" + a);
        double b = ob1.getCurrentCharge();
        System.out.println(" getCurrentCapacity :" + b);
        ob1.setCurrentCharge(2);

        ElectricBicycle ob2 = new ElectricBicycle(40, 50);
        ob2.batteryCapacity = 200;
        int c = ob1.getChargeCapacity();
        System.out.println(" getChargeCapacity :" + c);
        double d = ob1.getCurrentCharge();
        System.out.println(" getCurrentCapacity :" + d);
        ob1.setCurrentCharge(4);

    }
}
