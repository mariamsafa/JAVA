// class Test {
//     int a, b;

//     Test(int p, int q) {
//         a = p;
//         b = q;
//     }

//     boolean equals(Test w) // passing object as parameter
//     {
//         if (a == w.a && b == w.b)
//             return true;
//         return false;
//     }
// }

// class passob {
//     public static void main(String[] args) {
//         Test ob1 = new Test(10, 20);
//         Test ob2 = new Test(10, 20);
//         Test ob3 = new Test(3, 4);
//         Test ob4 = new Test(5, 9);
//         System.out.println("ob1 and ob2: " + ob1.equals(ob2));
//         System.out.println("ob1 and ob3: " + ob1.equals(ob3));
//         System.out.println(ob4.equals(ob1));

//     }
// }

// class Sum {
//     int value;

//     Sum(int value) {
//         this.value = value;
//     }

//     void add(Sum a) // passing object as parameter
//     {
//         value = value + a.value;
//         System.out.println(value);
//     }

//     void add(int p) // passing integer variable as parameter
//     {
//         value = value + p;
//         System.out.println(value);
//     }

// }

// class passob {
//     public static void main(String[] args) {
//         Sum s1 = new Sum(10);
//         Sum s2 = new Sum(20);
//         s1.add(s2);
//         s2.add(7);
//     }
// }

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

class passob {

    public static void main(String args[]) {

        complex ob1 = new complex();
        complex ob2 = new complex(5, 8);
        ob1.read();
         ob2.read();
        ob1 = ob1.add(ob2);
        ob1.display();
    }
}

// class Sum {
//     int value;

//     Sum() {
//         value = 5;
//     }

//     Sum(int value) {
//         this.value = value;
//     }

//     Sum add(Sum a) // returning object
//     {
//         Sum temp = new Sum();
//         temp.value = value + a.value;
//         return temp;
//     }

//     Sum add(int p) // returning object
//     {
//         Sum temp = new Sum();
//         temp.value = value + p;
//         return temp;
//     }

//     void display() {
//         System.out.println("Value: " + value);
//     }

// }

// class passob {
//     public static void main(String[] args) {
//         Sum s1 = new Sum(10);
//         Sum s2 = new Sum(20);
//         s1 = s1.add(s2);
//         s1.display();
//         // System.out.println(s1); //check this
//         s2 = s2.add(7);
//         s2.display();
//     }
// }