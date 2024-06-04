package File Manipulation;

public // //File Creation and Writing
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class test {
//     public static void main(String[] args) {
//         try{
//             File myfile = new File("testfile.txt");
//             if (myfile.createNewFile()) {
//                 System.out.println("File Created");
//             } else {
//                 System.out.println("File already exists");
//             }

//             FileWriter writer = new FileWriter("testfile.txt");
//             writer.write("exam ar bhallage na");
//             writer.close();

//             System.out.println("Successfully Written");
//         } catch (IOException e){
//             System.out.println("An error occured");
//             e.printStackTrace();
//         }
//     }
// }


// //File Reading
// import java.io.FileReader;
// import java.io.IOException;

// public class test {
//     public static void main(String[] args) {
//         try{
//             FileReader reader = new FileReader("testfile.txt");
//             int i;
//             while ((i=reader.read())!=-1){
//                 System.out.print((char)i);
//             }
//             reader.close();
//         } catch (IOException e){
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }



// //File Reading using Scanner
// import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         try {
//             File myfile = new File("testfile.txt");
//             Scanner sc = new Scanner(myfile);

//             while (sc.hasNextLine()) {
//                 System.out.println(sc.nextLine());
//             }
//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }



// //File to Variable (Ma'am dekhay naai)
// import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         try {
//             File myfile = new File("testfile.txt");
//             Scanner sc = new Scanner(myfile);

//             String test = sc.nextLine();
//             System.out.println(test);

//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }




// //Buffered Reader
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class test {
//     public static void main(String[] args) {
//         try {
//             FileReader myfile = new FileReader("testfile.txt");
//             BufferedReader br = new BufferedReader(myfile);

//             String i;
//             while ((i=br.readLine()) != null) {
//                 System.out.println(i);
//             }
//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }



// //BufferedWriter
// import java.io.FileWriter;
// import java.io.BufferedWriter;
// import java.io.IOException;

// public class test{
//     public static void main(String[] args) {
//         try{
//             FileWriter myfile = new FileWriter("testfile.txt");
//             BufferedWriter bw = new BufferedWriter(myfile);

//             String text = "Hello world! Hello world! Hello world! Hello world! Hello world! Hello world! Hello world!";

//             bw.write(text);
//             bw.newLine();
//             bw.write(text);

//             bw.flush();

//         } catch (IOException e){
//             System.out.println("An error occured");
//             e.printStackTrace();
//         }
//     }
// }



// //Word Count
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class test {
//     public static void main(String[] args) {
//         try {
//             FileReader myfile = new FileReader("testfile.txt");
//             BufferedReader br = new BufferedReader(myfile);

//             String i;
//             int wordscount = 0;
//             while ((i=br.readLine()) != null) {
//                 String[] words = i.split("\\s+");

//                 wordscount += words.length;
//             }
//             System.out.println(wordscount);
//         } catch (IOException e) {
//             System.out.println("error occured");
//             e.printStackTrace();
//         }
//     }
// }




// //Character Count
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class test {
//     public static void main(String[] args) {
//         try {
//             FileReader myfile = new FileReader("testfile.txt");
//             BufferedReader br = new BufferedReader(myfile);

//             String i;
//             int charCount = 0;
//             while ((i = br.readLine()) != null) {
//                 charCount += i.length();
//             }
//             System.out.println("Total alphanumeric characters: " + charCount);
//         } catch (IOException e) {
//             System.out.println("An error occurred");
//             e.printStackTrace();
//         }
//     }
// } {
    
}
