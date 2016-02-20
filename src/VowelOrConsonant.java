import java.util.Scanner;

public class VowelOrConsonant {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter grade: ");
    String temp = input.nextLine();
    char letter = temp.charAt(0);
    
    if (letter < 'A' || letter > 'z')
      System.out.println(letter + " is an invalid input");
    else{
      if ("AEIOUaeiou".indexOf(letter) < 0)
        System.out.println(letter + " is a consonant");
      else
        System.out.println(letter + " is a vowel");
    } // else
  } // main 
} // VowelOrConsonant
