class Box {
    int b,h;

  void b1(){
    b=10;
    h=10;
    System.out.println("superclass");
  }

}
class xo extends Box{
    int b,h;
    void b1(){
        super.b1();
        b=2;
        h=3;
        System.out.println("superclass");
        System.out.println(super.b+" "+super.h);
        System.out.println(b+" "+h);



      }
}

class l1 {
    public static void main(String[] args) {
      xo ob1= new xo();
      ob1.b1();
    }
}
