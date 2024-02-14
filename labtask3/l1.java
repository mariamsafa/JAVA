public abstract class student {
    public abstract void take_exam();

    void show() {
        System.out.println("parent method using child obj");
    }

}

class PhdStudent extends student {

    public void take_exam() {
        System.out.println("giving final defense presentation");
    }

}

class GradStudent extends student {

   public  void take_exam() {
        System.out.println("giving a writtem paper");
    }

}

class l1 {
    public static void main(String args[]) {
        PhdStudent ob1 = new PhdStudent();
        GradStudent ob2 = new GradStudent();
        ob1.show();
        ob1.take_exam();
        ob2.take_exam();
    }
}
