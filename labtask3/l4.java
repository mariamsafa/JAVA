/*4. You are given an interface AdvancedArithmetic which contains a method named
divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
Divisor_sum function just takes an integer as input and return the sum of all its divisors. For
example, divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at
most 1000. */

import java.util.Scanner;

interface AdvancedArithmetic {
    void divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    int sum;

    public void divisor_sum(int n) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum = sum + i;

        }

    }

    public void display() {
        System.out.println("sum of all divisors : " + sum);
    }

}

class l4 {
    public static void main(String args[]) {
        int a;

        MyCalculator ob1 = new MyCalculator();
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        ob1.divisor_sum(a);
        ob1.display();

    }
}