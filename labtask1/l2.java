
import java.util.*;
class complex {

    int real, imag;

    complex() {

        real = 10;
        imag = 20;

    }

    complex(int a, int b) {

        real = a;
        imag = b;

    }

    void read() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter real and imag num : ");
        real = input.nextInt();
        imag = input.nextInt();

    }

    complex add(complex a) {
        complex temp = new complex();
        temp.real = a.real + real;
        temp.imag = a.imag + imag;

        return temp;

    }

    void display() {

        System.out.println("Sum = " + real + "+" + imag);
    }

}

class l2 {

    public static void main(String args[]) {

        complex ob1 = new complex();
        complex ob2 = new complex(5, 8);
        ob1.read();
        // ob2.read();
        ob1 = ob1.add(ob2);
        ob1.display();

    }

}