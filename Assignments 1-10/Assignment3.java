/*
  Write a function that takes an array of integers and returns both the maximum and minimum values in the array.
 */
public class Assignment3{
  public static void maxMin(int[] arr){
    int max = arr[0], min = arr[0];
    for(int i : arr){
      if(i > max) max = i;
      if(i < min) min = i;
    }

    System.out.println("Max = " + max + ", " + "Min = " + min);
  }
  public static void main(String[] args) {
    int[] array = {3, 9, 1, -5, 70};
    maxMin(array);
  }
}