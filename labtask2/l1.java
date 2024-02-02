import java.util.*;

class person {
    String firstname, lastname, title;

    void getfirstname() {
        Scanner input = new Scanner(System.in);
        firstname = input.nextLine();

    }

    void getlastname() {
        Scanner input = new Scanner(System.in);
        lastname = input.nextLine();
        // System.out.println(lastname);

    }

    void gettitle() {
        Scanner input = new Scanner(System.in);
        title = input.nextLine();
        // System.out.println(title);

    }

}

class employee extends person {

    int id;

    void getempid() {
        Scanner input = new Scanner(System.in);
        id = input.nextInt();

    }

    void display() {
        System.out.println("last name and title is " + lastname + " " + title);
    }

}

class l1 {

    public static void main(String args[]) {
        employee ob1 = new employee();
        ob1.getlastname();
        ob1.gettitle();
        ob1.display();

    }

}