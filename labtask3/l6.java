/*6. Suppose you have a Train class. You have to keep track of how many trains have started their
journey after 10 a.m. Write a code to implement the scenario. */

import java.util.Scanner;

class train {
    static int t;
    static int sum;

    train() {
        sum = 0;
    }

    public static void track() {

        if (t > 10) {
            sum = sum + 1;

        }
        if (t < 10) {
            sum = sum + 1;
        }

    }

    public static void show() {
        System.out.println("total trains after 10 am : " + sum);
    }

}

class l6 {
    public static void main(String args[]) {
        train ob1 = new train();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            train.t = input.nextInt();
            train.track();
        }
        train.show();

    }
}
