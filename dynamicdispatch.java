// //run time polymorphism
// // Dynamic method dispatch
// class A
// {
//     void show()
//     {
//         System.out.println("class A");
//     }
// }
// class B extends A
// {
//     void show()
//     {
//         System.out.println("class B");
//     }
// }
// class C extends A
// {
//     void show()
//     {
//         System.out.println("class C");
//     }
// }
// class dynamicdispatch {
//     public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        C c = new C();

//        A r;
//        r = a;

//        r.show();

//        r = b;
//        r.show();

//        r = c;
//        r.show();
//     }
// }

//run time polymorphism
// Dynamic method dispatch
class A {
    void show() {
        System.out.println("class A");
    }
}

class B extends A {
    void show() {
        System.out.println("class B");
    }
}

class C extends A {
    void show() {
        System.out.println("class C");
    }
}

class dynamicdispatch {
    public static void main(String[] args) {

        A a = new B();
        a.show();
        a = new C();
        a.show();
        a = new A();
        a.show();

    }
}
