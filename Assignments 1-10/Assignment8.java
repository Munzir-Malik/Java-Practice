/*
  Write a program to print the first 10 numbers of the Fibonacci series.
 */
public class Assignment8 {
  public static void main(String[] args) {
    int[] fibSeries = new int[10];
    fibSeries[0] = 0;
    fibSeries[1] = 1;

    for (int i = 2; i < fibSeries.length; i++){
      fibSeries[i] = fibSeries[i - 1] + fibSeries[i -2];
    }

    for(int num : fibSeries) {
      if (num == 34) System.out.print(num);
      else System.out.print(num + ", ");
    }
  }
  
}

