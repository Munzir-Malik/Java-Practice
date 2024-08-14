/*Task: Write a program that prints the numbers from 1 to 50.
For multiples of three, print "Fizz" instead of the number.
For the multiples of five, print "Buzz" instead of the number.
For numbers which are multiples of both three and five, print "FizzBuzz". */

public class Assignment1{
  public static void main(String[] args) {
    for (int i = 1; i <= 50; i++){
      if(i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
        continue;
      }

      if(i % 3 == 0) {
        System.out.println("Fizz");
      }

      else if(i % 5 == 0) {
        System.out.println("Buzz");
      }

      else System.out.println(i);
    }

  }
}
