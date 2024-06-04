// //Stack 
// public class random {

// }
// import java.util.Stack;
// class stack{
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<Integer>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);
//         while(!stack.isEmpty())
//         {
//             System.out.println(stack.pop());
//         }
//        }
    

// }


import java.util.Scanner;
import java.util.Stack;

// Define the Student class
class Student {
    private int id;
    private String name;
    private double grade;

    // Constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Override toString method for easy display
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + '}';
    }
}

public class stack {
    public static void main(String[] args) {
        // Create a stack to hold Student objects
        Stack<Student> studentStack = new Stack<>();

        // Insert 10 Student objects into the stack
        for (int i = 1; i <= 10; i++) {
            studentStack.push(new Student(i, "Student" + i, 80 + i));
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter menu option (1: Insert, 2: Delete, 3: Output Top, 4: Exit): ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                // Insert another Student object
                System.out.println("Enter student id, name, and grade: ");
                int id = scanner.nextInt();
                String name = scanner.next();
                double grade = scanner.nextDouble();
                studentStack.push(new Student(id, name, grade));
                System.out.println("Student added.");
            } else if (menu == 2) {
                // Delete the top Student object
                if (!studentStack.isEmpty()) {
                    Student removedStudent = studentStack.pop();
                    System.out.println("Removed: " + removedStudent);
                } else {
                    System.out.println("Stack is empty. No student to remove.");
                }
            } else if (menu == 3) {
                // Output the top Student object
                if (!studentStack.isEmpty()) {
                    Student topStudent = studentStack.peek();
                    System.out.println("Top Student: " + topStudent);
                } else {
                    System.out.println("Stack is empty. No student to show.");
                }
            } else if (menu == 4) {
                // Exit the program
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid menu option. Please try again.");
            }
        }

        scanner.close();
    }
}

