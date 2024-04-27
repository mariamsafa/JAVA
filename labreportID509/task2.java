import java.util.Scanner;

interface Contact_Numbers {

    public void Dial_number();
    public void Save_number(String number);

}

interface Messages {

    public void Send_Message(String message_length);
    public void Receive_Message();
}

interface Weather {

    public String get_locationName();
    public void set_locationName(String l_name);
    public int get_Temparature();
    public void set_Temparature(int type_temparature);
    public void PrintWeatherInfo();

}

class JavaPhone implements Contact_Numbers, Messages, Weather {
    String number;
    String name;
    String message;
    String locationName;
    int temparature;

    public void Dial_number() {
        System.out.println("Dialing number: " + number);

    }

    public void Save_number(String number) {
        if (number.charAt(0) == '0' && number.charAt(1) == '1' && number.length() == 11) {
            this.number = number;
            System.out.println("Contact saved: " + name + " - " + number);
        } else {
            System.out.println("Invalid number format");
        }
    }

    public void Send_Message(String message_length) {
        if (message_length.length() <= 200) {
            this.message = message_length;
            System.out.println("Message sent: " + message);
        } else {
            System.out.println("Message length exceeds 200 words.");
        }
    }

    public void Receive_Message() {
        System.out.println("Message received: " + message);

    }

    public String get_locationName() {
        System.out.print("Enter Location name: ");
        Scanner input = new Scanner(System.in);
        locationName = input.next();
        return locationName;
    }

    public void set_locationName(String l_name) {
        locationName = l_name;

    }

    public int get_Temparature() {
        System.out.print("Enter temparature: ");
        Scanner input = new Scanner(System.in);
        int temparature = input.nextInt();
        return temparature;

    }

    public void set_Temparature(int type_temparature) {
        temparature = type_temparature;
    }

    public void PrintWeatherInfo() {
        System.out.println("Location name: " + locationName);
        System.out.println("Temparature: " + temparature);
    }

}

 class task2 {
    public static void main(String[] args) {
        JavaPhone phone = new JavaPhone();
        phone.number = "01999969961";
        phone.Dial_number();
        phone.name = "Afia";
        phone.Save_number("01999969961");
        phone.Send_Message("I am a student of BUBT");
        phone.Receive_Message();
        String lm = phone.get_locationName();
        phone.set_locationName(lm);
        int tmp = phone.get_Temparature();
        phone.set_Temparature(tmp);
        phone.PrintWeatherInfo();

    }
}