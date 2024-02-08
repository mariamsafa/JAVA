abstract class student {
    abstract void take_exam();

    void show() {
        System.out.println("parent method using child obj");
    }

}

class PhdStudent extends student {

    void take_exam() {
        System.out.println("implemented method 1");
    }

}

class GradStudent extends student {

    void take_exam() {
        System.out.println("implemented method 2");
    }

}


class l1{
    public static void main(String args[])
    {
        PhdStudent ob1 = new PhdStudent();
        GradStudent ob2= new GradStudent();
        ob1.show();
        ob1.take_exam();
        ob2.take_exam();
    }
}