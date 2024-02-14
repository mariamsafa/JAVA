/*2. Write an interface called Movaable, which contains 4 abstract methods moveUp(),
moveDown(), moveLeft() and moveRight(). This interface must be overridden by two classes
named MovaablePoint and MovaableCircle. Create necessary variables in the classes and
implement the methods.*/

interface movaable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

}

class MovaablePoint implements movaable {

    public int x, y;

    public MovaablePoint(int a, int b) {

        x = a;
        y = b;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    void show() {
        System.out.println("x = " + x + " " + "y = " + y);
    }

}

class MovaableCircle implements movaable {

    public int p, q;

    public MovaableCircle(int a, int b) {

        p = a;
        q = b;
    }

    public void moveUp() {
        p++;
    }

    public void moveDown() {
        p--;
    }

    public void moveLeft() {
        q--;
    }

    public void moveRight() {
        q++;
    }

    void show() {
        System.out.println("p = " + p + " " + "q = " + q);
    }

}

class l2 {
    public static void main(String args[]) {
        MovaablePoint ob1 = new MovaablePoint(4, 5);
        MovaableCircle ob2 = new MovaableCircle(3, 1);
        ob1.moveUp();
        ob1.moveDown();
        ob1.moveLeft();
        ob1.moveRight();
        ob2.moveUp();
        ob2.moveDown();
        ob2.moveLeft();
        ob2.moveRight();
        ob1.show();
        ob2.show();

    }

}