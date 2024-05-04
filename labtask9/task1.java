import java.util.Arrays;

class AnagramCheck {
   
    public boolean areAnagram(String str1, String str2) {
       
        int n1 = str1.length();
        int n2 = str2.length();

        
        if (n1 != n2)
            return false;

       
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

       
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        
        for (int i = 0; i < n1; i++)
            if (charArray1[i] != charArray2[i])
                return false;

        return true;
    }

    
   
}

class task1{
     public static void main(String[] args) {

        String str1 = "mariam";
        String str2 = "maimar";
    AnagramCheck ob1 = new AnagramCheck();

        if (ob1.areAnagram(str1, str2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}