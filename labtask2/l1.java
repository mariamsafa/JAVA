
import java.util.*;

class person {
    String title;

  /*   void getfirstname() {

    } */

    void getlastname() {
        Scanner input = new Scanner(System.in);
        title = input.nextLine();

    }

}

class employee extends person {

    int id;

    void getempid() {
        Scanner input = new Scanner(System.in);
        id = input.nextInt();

    }

    void display() {
        System.out.println("title is "+ title);
    }

}

class l1 {

    public static void main(String args[]) {
        employee ob1 = new employee();
        ob1.getlastname();
        ob1.display();

    }

}