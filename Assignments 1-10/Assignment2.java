/*
  Write a function that takes an array of integers and returns a new array with the elements in reverse order.
 */
import java.util.Scanner;

public class Assignment2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
  
    int size;
  
    System.out.println ("Please Enter The Number Of Your Array Elemnts Then Enter The Numbers");
    size = input.nextInt();
    int nums[] = new int[size];
    int revIndex = 0;
  
    for(int i = 0; i < size; i++){
      System.out.println("Enter element " + (i + 1));
      nums[i] = input.nextInt(); 
    }
  
    int[] reverseNum = new int[size];
    for(int i = size - 1; i >= 0; i--){
      reverseNum[revIndex] = nums[i];
      revIndex++;
    }

    for(int i : reverseNum) System.out.println(i);

    input.close();

  }
}
