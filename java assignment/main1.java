
import java.sql.Date;

class Visit {
    Date date;
    double serviceExpense;
    double productExpense;

    Visit(Date date) {
        this.date = date;
    }

    double getServiceExpense() {
        return serviceExpense;
    }

    void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    double getProductExpense() {
        return productExpense;
    }

    void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    void DisplayInfo() {
        System.out.println("Date: " + date);
        System.out.println(serviceExpense);
        System.out.println( productExpense);
        System.out.println( getTotalExpense());
    }

}

class Customer {
    String Name;
    boolean member;
    String memberType;

    Visit s;

    Customer(String Name, Visit s) {
        this.Name = Name;
        this.s = s;
    }

    String getName() {
        return Name;
    }

    boolean isMember() {
        return member;
    }

    void setMember(boolean member) {
        this.member = member;
    }

    String getMemberType() {
        return memberType;
    }

    void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    void DisplayInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Member: " + member);
        System.out.println("Member Type: " + memberType);
    }
}

class Discount {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) {
            return serviceDiscountPremium;
        } else if (type.equals("Gold")) {
            return serviceDiscountGold;
        } else if (type.equals("Silver")) {
            return serviceDiscountSilver;
        } else {
            return 0;
        }
    }

    double getProductDiscountRate(String type) {
        if (type.equals("Premium")) {
            return productDiscountPremium;
        } else if (type.equals("Gold")) {
            return productDiscountGold;
        } else if (type.equals("Silver")) {
            return productDiscountSilver;
        } else {
            return 0;
        }
    }
}

class main1 {
    public static void main(String args[]) {
        Visit v = new Visit(new Date(2024, 03, 30));
        v.setServiceExpense(3500);
        v.setProductExpense(5000);
        v.DisplayInfo();

        System.out.println();

        Customer c = new Customer("Rahim", v);
        c.setMember(true);
        c.setMemberType("Silver");
        c.DisplayInfo();

        System.out.println();

        Discount d = new Discount();
        System.out.println( d.getServiceDiscountRate(c.getMemberType()));
        System.out.println( d.getProductDiscountRate(c.getMemberType()));
    }
}