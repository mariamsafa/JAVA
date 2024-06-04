import java.util.Scanner;

class stringbasic {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // String line = input.nextLine();
        // String word = input.next();
        // System.out.println(line);
        // System.out.print(word);

        // // 2 types of object creation in string

        // // Using string literals
        // String str1 = "Hello, World!";
        // String str2 = "Hello, World!";

        // // Using the new keyword
        // String str3 = new String("Hello, World!");

        // // Using a character array
        // char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        // String str4 = new String(charArray);

        // /* str1 references an object from the string pool.
        // str1 and str2 has same contents but they are not different objects,
        // if jvm finds the same string in the string pool then the object becomes
        // reference object to the main object.
        // str3 references a new String object explicitly created with the new keyword
        // in the string heap.
        // str3 references a new String object created from a character array.
        // str1 == str3 will returns false because str1 references the object in the
        // string pool,
        // while str3 references a new object on the heap. */
         


        // concatenation
        // String s = "ABC";
        // s = s.concat("DEF"); 
        // System.out.println(s);//ABCDEF
        // String b = "GHI";
        // s=s.concat(b); 
        // System.out.println(s);//ABCDEFGHI
        // System.out.println(s + b); //ABCDEFGHIGHI
        // System.out.println(s + " mariam safa");
        // //System.out.println("Concatenation using concat: " + first.concat(", ").concat(second).concat("!"));

        // // lenght count
        // int i = s.length();
        // System.out.println("lenghth:" + i);
        // System.out.println("mariam".length()); 



        // String h= "hello" +2+2;
        // System.out.println(h);//hello22
        // String r= "hello" +(2+2);
        // System.out.println(r);//hello4

        
        //String of character extraction
        // char e= b.charAt(1); //b=GHE
        // System.out.println(e);
        // String  f= "i am mariam safa and i live in dhaka";
        // int start=10;
        // int end =14;
        // char buf[]= new char[end-start];
        // f.getChars(start, end, buf, 0);
        // System.out.println(buf);


        //string comparison

        // String c1 ="hello";
        // String c2="hello";
        // String c3= "world";
        // String c4="HELLO";
        // System.out.println(c1.equals(c2));
        // System.out.println(c3.equals(c2));
        // System.out.println(c1.equals(c4));
        // System.out.println(c1.equalsIgnoreCase(c4));
        //(equals() varsus ==)

        //searching index
        //indexOf() searches for the first occurrence of a character or substring
       //lastIndexOf()searches for the last occurrence of a character or substring
        //int indexOf(String str, int startindex)
        //int lastIndexOf(String str, int startindex)

        // String c5= "Now is the time for all good men " + "to come to the aid of their country.";
        // System.out.println(c5);
        // //String c6= c5.indexOf('i');
        // System.out.println(" hello "+ c5.indexOf('t'));
        // System.out.println( c5.lastIndexOf("t"));
        // System.out.println( c5.indexOf("the"));
        // System.out.println( c5.lastIndexOf("the"));
        // System.out.println(c5.indexOf('t',12));
        // System.out.println( c5.lastIndexOf('t',60));




        // //modifying a string

        // String c6= "Now is the time for all good women ";
        // String search = "is";
        // int i= c6.indexOf(search);
        // System.out.println(i);//4
        // int j=c6.indexOf("is");
        // System.out.println(j);//4
        // String result = c6.substring(0,i);
        // String out = c6.substring(j);
        // System.out.println("substring" + result);//Now
        // System.out.println(out);//is the time for all good women 
        


        // //string replace
        // String c7= "Russia";
        // // String c7= "Russia".replace('u','i');
        // String output= c7.replace('u', 'i');
        // System.out.println("replacing " +output);

        // //string trimming
        // String c8= "   Hi safa  ".trim();
        // System.out.println(c8);
        // //removes spaces from the start and the end but not the spaces between the words
        


        //upperlower conversion
        String c9="ThiS is A test";
        System.out.println("Original : " + c9);
        String upper = c9.toUpperCase();
        String lower =c9.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        



        




















      






    }
}