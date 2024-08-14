/*
  Write a program that counts the number of vowels (a, e, i, o, u) in a given string.
 */
import java.util.Scanner;

public class Assignment6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter a string to count numbers of vowels letters in it");
  
    String str = input.nextLine();
    int counter = 0;
  

    for (int i = 0; i <= str.length() - 1; i++){
      switch (str.charAt(i)) {
        case 'a', 'A':
          // counter++;
          // break;
      
        case 'o', 'O':
          // counter++;
          // break;
      
        case 'u', 'U':
          // counter++;
          // break;
          
          case 'e', 'E':
          // counter++;
          // break;
          
          case 'i', 'I': 
          counter++;
          break;
        }
    }

    System.out.println(counter);

    input.close();
  }
}
