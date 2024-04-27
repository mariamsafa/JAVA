import java.util.Scanner;
class Pizza {
    private String size;
    int cheese, pepperoni, pineapple;

    Pizza(String size, int cheese, int pepperoni, int pineapple) {
        this.cheese = cheese;
        this.size=size;
        this.pepperoni = pepperoni;
        this.pineapple = pineapple;
    }

    public String getSize() {
        System.out.print("Enter size: ");
        Scanner input = new Scanner(System.in);
        size = input.next();
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        System.out.print("Enter cheese Toppings: ");
        Scanner input = new Scanner(System.in);
        int cheese = input.nextInt();
        return cheese;
    }

    public void setCheeseToppings(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoniToppings() {
        System.out.print("Enter pepperoni Toppings: ");
        Scanner input = new Scanner(System.in);
        int pepperoni = input.nextInt();
        return pepperoni;
    }

    public void setPepperoniToppings(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getPineappleToppings() {
        System.out.print("Enter pineapple Toppings: ");
        Scanner input = new Scanner(System.in);
        int pineapple = input.nextInt();
        return pineapple;
    }

    public void setPineappleToppings(int pineapple) {
        this.pineapple = pineapple;
    }

    public double calcCost() {
        double Cost;
        switch (size.toLowerCase()) {
            case "small":
                Cost = 10;
                break;
            case "medium":
                Cost = 12;
                break;
            case "large":
                Cost = 14;
                break;
            default:
                Cost = 0;
                break;
        }
        return Cost + (cheese + pepperoni + pineapple) * 2;
    }

    public String getDescription() {
        return "Pizza size: " + size + " Cheese toppings: " + cheese + " Pepperoni toppings: " + pepperoni
                + " Pineapple toppings: " + pineapple;
    }
}

class PizzaOrder{
    private Pizza[] pizzas;
    private int numberOfPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        numberOfPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numberOfPizzas < 3) {
            pizzas[numberOfPizzas++] = pizza;
        } else {
            System.out.println("Maximum limit of pizzas reached in this order.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numberOfPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }

}

 class task3 {
    public static void main(String[] args) {
        
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 0, 1);

        System.out.println("Pizza 1: " + pizza1.getDescription());
        System.out.println("Pizza 2: " + pizza2.getDescription());

        
        System.out.println("Cost of Pizza 1: $" + pizza1.calcCost());
        System.out.println("Cost of Pizza 2: $" + pizza2.calcCost());

        
        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);


        System.out.println("Total cost of order: $" + order.calcTotal());
    }
}