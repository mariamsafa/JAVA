/*5. Create an interface named People. This must include getfirstname() and getlastname() and
displayname() methods. Two child classes named Student and Teacher must implement methods
to display full name for an individual person. */

import java.util.Scanner;

interface People {
    void getfirstname();
    void getlastname();
    void displayname();
}

class student implements People {
    public String fs, ls;
    Scanner input = new Scanner(System.in);

    public void getfirstname() {
        fs = input.next();

    }

    public void getlastname() {
        ls = input.next();
    }

    public void displayname() {

        System.out.println("First name for student : " + fs);
        System.out.println("Last name for student : " + ls);

    }

}

class Teacher implements People {
    public String fs, ls;
    Scanner input = new Scanner(System.in);

    public void getfirstname() {
        fs = input.next();

    }

    public void getlastname() {
        ls = input.next();
    }

    public void displayname() {

        System.out.println("First name for teacher  : " + fs);
        System.out.println("Last name for teacher : " + ls);

    }

}

class l5 {
    public static void main(String args[]) {
        student ob1 = new student();
        Teacher ob2 = new Teacher();
        ob1.getfirstname();
        ob1.getlastname();
        ob2.getfirstname();
        ob2.getlastname();
        ob1.displayname();
        ob2.displayname();

    }
}

