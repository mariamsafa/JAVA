import java.util.Scanner;


interface Java_Account {

    public String getAccount_name();
    public void setAccount_name(String name);

}

interface Java_Password {

    public String get_password();
    public void set_password(String password);

}

interface Java_Verify_me {

    public String get_number();
    public void send_otp(String number);
    public void verify_otp();
}

class account implements Java_Account, Java_Password, Java_Verify_me {

    String firstName;
    String lastName;
    String fullname;
    String password;
    String phoneNumber;
    String otp;

    public String getAccount_name() {

        System.out.print("Enter First name and last name: ");
        Scanner input = new Scanner(System.in);
        fullname = input.nextLine();
        return fullname;
    }

    public void setAccount_name(String name) {

        String[] names = name.split(" ");
        firstName = names[0];
        lastName = names[1];
        if (names.length != 2) {
            System.out.println("Please provide both first name and last name separated by a space.");

        } else if (!Character.isUpperCase(firstName.charAt(0)) || !Character.isUpperCase(lastName.charAt(0))) {
            System.out.println("The first letter of both firstname and lastname must be in uppercase.");

        } else {

            firstName = names[0];
            lastName = names[1];
            System.out.println("Account Holder's name :  " + names[0] + " " + names[1]);

        }

    }

    public String get_password() {
        System.out.print("Enter Password : ");
        Scanner input = new Scanner(System.in);
        password = input.next();
        return password;
    }

    public void set_password(String password) {
        if (password.length() < 8 || !password.matches(".*[A-Z].*") 
                || !password.matches(".*[a-z].*")
                || !password.matches(".*[0-9].*") 
                || !password.matches(".*[!@#$%^&*()_+/?].*")) {
            System.out.println("Please follow the proper format for password.");
        } else {
            this.password = password;
            System.out.println("Entered valid pass");
        }

    }

    public String get_number() {

        System.out.print("Enter Number : ");
        Scanner input = new Scanner(System.in);
        phoneNumber = input.next();
        return phoneNumber;
    }

    public void send_otp(String number) {
        this.phoneNumber = number;
        this.otp = "440376";
        System.out.println("OTP sent to " + number);
    }

    public void verify_otp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP: ");
        String inputOTP = scanner.nextLine();
        if (!inputOTP.equals(otp)) {
            System.out.println("OTP is wrong, try again.");

        }
        else
        {
            System.out.println("OTP verified successfully.");

        }

    }
}

class task4 {
    public static void main(String args[]) {
        account account1 = new account();
        String name = account1.getAccount_name();
        account1.setAccount_name(name);
        String pass = account1.get_password();
        account1.set_password(pass);
        String num = account1.get_number();
        account1.send_otp(num);
        account1.verify_otp();

    }

}