// class Animal {
//     int a;

//     Animal() {
//         System.out.println("Animal constructor");
//     }

//     Animal(int a) {
//         System.out.println("Animal Parameterized");
//         this.a = a;
//     }
// }

// class Dog extends Animal {
//     int b;

//     Dog() {
//         super();
//         System.out.println("Dog Constructor");
//     }

//     Dog(int b) {
        
//         //super(1);
        
//         System.out.println("Dog Parameterized");
//         this.b = b;
//     }

// }

// class puppy extends Dog {
//     int c;

//     puppy() {
//         System.out.println("puppy constructor");

//     }

//     puppy(int c) {

//         System.out.println("puppy parameterized");
//         this.c = c;
//     }

// }

// class crow extends puppy {
//     int d;

//     crow() {
//         System.out.println("crow constructor");

//     }

//     crow(int d) {

//         System.out.println("crow parameterized");
//         this.d = d;
//     }

// }

// class mid {
//     public static void main(String args[]) {
//         Animal a = new Animal(10);
//         System.out.println();
//         Dog d = new Dog(10);
//         Dog o = new Dog();

//         System.out.println();

//         puppy r = new puppy(2);
//         System.out.println();

//         crow q = new crow();
//         System.out.println();


//     }
// }


class uni{
   String dept;
   int sid,sec;
   uni(String dept, int sid, int sec){
    this.dept=dept;
    this.sid=sid;
    this.sec=sec;
   }
   void display(){
    System.out.println("Department: " + dept);
    System.out.println("sid " + sid);
    System.out.println("sec: " + sec);
   }
}
class cse extends uni{
    cse(String dept, int sid, int sec) {
        super(dept, sid, sec);
        
    }
    void display() {
        super.display();
    }

}
class eee extends uni{
    eee(String dept, int sid, int sec) {
        super(dept, sid, sec);
        
    }
    void display() {
        super.display();
    }

}
public class mid {
    public static void main(String[] args) {
        cse ob1 = new cse("cse",509,1);
        eee ob2 = new eee("eee",066,1);

        System.out.println("Details of CSE Department:");
        ob1.display();

        System.out.println("\nDetails of EEE Department:");
        ob2.display();
    }
}


































































// class over{
//     void check()
//     {
//         System.out.println("empty");
//     }
//     void check(int i){
//         System.out.println(i);
//     }
//     void check(int i, int j)
//     {
//         System.out.println(i+" "+j);

//     }
//     void check(double i, int j){
//         System.out.println(i+" "+j);
//         //return i;

//     }
// }

// class mid{
//     public static void main (String args[]){
//          over ob1= new over();
//          ob1.check();
//          ob1.check(3,4);
//          ob1.check(4);
//          ob1.check(5.5,2);
//          //double p= ob1.check(3.4);
//          //System.out.println(p);

         
//     }
// }