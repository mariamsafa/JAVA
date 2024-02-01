import java.util.*;

class bankaccount {
    int d, w;

    void deposit() {
        System.out.print("Enter the diposit: ");
        Scanner input = new Scanner(System.in);
        d = input.nextInt();
    }

/* void withdraw(){

} */

}

    Saveaccount extends bankaccount{

    void show() {

        if (d < 100) {
            System.out.println("withdraw not possible");
        } else {
            System.out.println("withdraw possible");

        }
    }

}

class l3 {
    public static void main(String args[]) {

    }

}