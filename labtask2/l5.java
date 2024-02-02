class employee {

    String name, address, jobtitle;
    int salary, bonus;

}

class manager extends employee {

    manager() {
        bonus = 1000;
        jobtitle = "manager";

    }

    void calculatesalary() {

        salary = 40000 + bonus;

    }

}

class developer extends employee {

    developer() {
        bonus = 5000;
        jobtitle = "developer";

    }

    void calculatesalary() {

        salary = 50000 + bonus;

    }

}

class programmer extends employee {

    programmer() {

        bonus = 2000;
        jobtitle = "programmer";

    }

    void calculatesalary() {

        salary = 60000 + bonus;

    }

}

class l5 {
    public static void main(String[] args) {

        manager ob1 = new manager();
        ob1.calculatesalary();
        System.out.println("manager salary " + ob1.salary + " " + ob1.jobtitle);
        developer ob2 = new developer();
        ob2.calculatesalary();
        System.out.println("developer salary " + ob2.salary + " " + ob2.jobtitle);
        programmer ob3 = new programmer();
        ob3.calculatesalary();
        System.out.println("programmer salary " + ob3.salary + " " + ob3.jobtitle);

    }
}
