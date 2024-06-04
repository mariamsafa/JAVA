
import java.util.ArrayList;
import java.util.Collections;
class arraylistt{
    public static void main(String[] args) {
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(0);
        l1.add(2);
        l1.add(4);
        l1.add(5);

        System.out.println(l1);

        
        int a= l1.get(1);
        System.out.println(a);

        //add el in between
        l1.add(0,1);
        l1.add(2,5);
        System.out.println(l1);

        //set element
        l1.set(0,10);
        System.out.println(l1);

        //delete el
        l1.remove(0);
        System.out.println(l1);


        //size
        int size= l1.size();
        System.out.println(size);


        for(int i=0;i<size;i++)
        {
            System.out.print(l1.get(i));
        }
        
       //sorting
       Collections.sort(l1);
       System.out.println(l1);

       int index= l1.indexOf(2);
       System.out.println(index);
       boolean con = l1.contains(5);
       System.out.println(con );


//l1.clear();
//System.out.println(l1);





    }
}


/* import java.util.ArrayList;

class Car {
    private double price;
    private String brand;
    private double speed;

    // Constructor to initialize properties
    public Car(double price, String brand, double speed) {
        this.price = price;
        this.brand = brand;
        this.speed = speed;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Override toString method for better display
    @Override
    public String toString() {
        return "Car [Brand=" + brand + ", Price=" + price + ", Speed=" + speed + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store Car objects
        ArrayList<Car> cars = new ArrayList<>();

        // Create 5 Car objects and add them to the ArrayList
        cars.add(new Car(2500000, "Toyota", 220));
        cars.add(new Car(1800000, "Honda", 200));
        cars.add(new Car(3000000, "BMW", 240));
        cars.add(new Car(1500000, "Ford", 210));
        cars.add(new Car(2800000, "Mercedes", 230));

        // Display cars whose price is over 2000000 takas
        System.out.println("Cars with price over 2000000 takas:");
        for (Car car : cars) {
            if (car.getPrice() > 2000000) {
                System.out.println(car);
            }
        }
    }
}
 */