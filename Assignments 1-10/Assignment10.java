
import java.util.Scanner;
public class Assignment10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num, sum = 0;
    System.out.println("Enter an integer number.");
    num = scanner.nextInt();
    while (num > 0){
      sum += (num % 10); //To separate the last digit EX. 123 => 3
      num = num / 10; //To delete the last digit EX. 123 => 12
    }
    System.out.println(sum);

    scanner.close();
  }
}
