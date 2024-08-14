/*
  Write a function that checks if a given number is a prime number.
 */
import java.util.Scanner;
public class Assignment5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to check if it`s prime or not");
    int num = input.nextInt();
    if(num == 2 || num % 2 != 0) System.out.println(num + " is a prime number.");;

    input.close();
  }
}
