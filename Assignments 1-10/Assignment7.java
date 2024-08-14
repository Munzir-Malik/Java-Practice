/*
  Write a function that calculates the factorial of a given number.
 */


public class Assignment7 {
  public static int factorial (int num){
    if(num == 1){
      return 1;
    }
    return num * factorial(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
