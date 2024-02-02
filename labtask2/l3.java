import java.util.*;

class bankaccount {
    int d, w;

    void deposit() {
        System.out.print("Enter the diposit: ");
        Scanner input = new Scanner(System.in);
        d = input.nextInt();
    }

    void withdraw() {
        System.out.println("withdraw success");

    }

}

class Saveaccount extends bankaccount {

    void deposit() {
        System.out.print("Enter the diposit: ");
        Scanner input = new Scanner(System.in);
        d = input.nextInt();
    }

    void withdraw() {
        if (d < 100) {
            System.out.println("withdraw not possible");
        } else {
            System.out.println("withdraw possible");

        }

    }

}

class l3 {
    public static void main(String args[]) {

        Saveaccount ob1 = new Saveaccount();
        ob1.deposit();
        ob1.withdraw();

    }

}