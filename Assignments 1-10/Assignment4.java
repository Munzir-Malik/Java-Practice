/*
  Write a program that checks if a given string is a palindrome,
  (a word that reads the same backward as forward).
 */

import java.util.Scanner;

public class Assignment4{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /********************************      Way 1    ********************************/
    String str, reverse = "";
    str = scanner.nextLine();
  
    for (int i = str.length() - 1; i >=0; i--){
      reverse += str.charAt(i);
    }

    
    if (str.equalsIgnoreCase(reverse)) {
      System.out.println("Palindrome");
    }
    else System.out.println("Not palindrome");


    /********************************      Way 2    ********************************/
    // String str1;
    // String reverse1;
    // str1 = scanner.nextLine();
    // StringBuilder strB = new StringBuilder(str1);
    // reverse1 = strB.reverse().toString();

    scanner.close();
  }
}