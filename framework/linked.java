
import java.util.LinkedList;
class linked{
    public static void main(String[] args) {
        LinkedList<String> a= new LinkedList<>();
        a.add("dog");
        a.add("cat");
        a.add("cow");
        a.add(1,"goat");
        System.out.println(a);

        String b= a.get(0);
        System.out.println(b);

        a.set(3,"tiger");
        System.out.println(a);


        a.remove(2);
        System.out.println(a);
        
       int index= a.indexOf("tiger");
       System.out.println(index);
     boolean con = a.contains("cow");
     System.out.println(con );




    }
}