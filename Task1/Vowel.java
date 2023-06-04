
import java.util.Scanner;
public class Vowel{
  public static void main(String[]args){
    Scanner inp= new Scanner(System.in);
    System.out.println("Enter a character.");
    char letter = inp.next().charAt(0);
    letter = Character.toLowerCase(letter);

    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
      System.out.println("The letter is vowel ");
    } else {
      System.out.println("The letter is consonant.");
    }
    }
}