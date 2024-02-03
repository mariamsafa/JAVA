class Sum {
//     int value;

//     Sum() {
//         value = 5;
//     }

//     Sum(int value) {
//         this.value = value;
//     }

//     Sum add(Sum a) // returning object
//     {
//         Sum temp = new Sum();
//         temp.value = value + a.value;
//         return temp;
//     }

//     Sum add(int p) // returning object
//     {
//         Sum temp = new Sum();
//         temp.value = value + p;
//         return temp;
//     }

//     void display() {
//         System.out.println("Value: " + value);
//     }

// }

// class passob {
//     public static void main(String[] args) {
//         Sum s1 = new Sum(10);
//         Sum s2 = new Sum(20);
//         s1 = s1.add(s2);
//         s1.display();
//         // System.out.println(s1); //check this
//         s2 = s2.add(7);
//         s2.display();
//     }
// }