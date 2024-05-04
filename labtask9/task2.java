class Even{
  
    
    public static void printEvenLengthWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
        String word = words[i];
        if (word.length() % 2 == 0) {
            System.out.println(word);
        }
    }
    }
}

class task2{
      public static void main(String[] args) {
        String sentence = "I am a student of BUBT";
        Even  ob1= new Even();
        ob1.printEvenLengthWords(sentence);
    }
}
