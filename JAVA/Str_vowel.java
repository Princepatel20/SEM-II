import java.util.Scanner;
public class Str_vowel {
   public static void main(String args[]){
      int count = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence :");
      String sentence = sc.nextLine();
      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}
