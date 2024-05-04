import java.util.Scanner;
class replacee{
    void a(){
        System.out.print("Enter a word: ");
    Scanner input= new Scanner(System.in);
    String a= input.next();
    System.out.print("Enter a char you want to replace: ");
    char c = input.next().charAt(0);
    System.out.println(a.replace(a.charAt(0),c));
    }
}

class task3{
    public static void main (String args[]){
        replacee ob1 = new replacee();
        ob1.a();
    }
}