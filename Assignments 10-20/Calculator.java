import java.util.Scanner;
// Simple Calculator Opreations class
class CalculatorOpreations{
// Adding Method
  public double add(double a, double b){
    return a + b;
  }
// Subtracting Method
  public double subtract(double a, double b){
    return a - b;
  }
// Multiplaying Method
  public double multiply(double a, double b){
    return a * b;
  }
// Dividing Method
  public double divide(double a, double b){
    if (b == 0) return 0;
    return a / b;
  }
}

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    CalculatorOpreations clac = new CalculatorOpreations();
    double result;
  
  // Start piont for the Calculator program
    System.out.println("Welcome to simple Calculator program");
  
  //While loop to keep the program running until user enter 'q' letter
    while (true){
      System.out.println("Enter two numbers to process them.");
      double n1 = input.nextDouble();
      double n2 = input.nextDouble();
      input.nextLine(); // Consume the leftover newline
    
      System.out.println("'+' to add.");
      System.out.println("'-' to subtract." );
      System.out.println("'*' to multiply.");
      System.out.println("'/' to divide.");
      System.out.println("'q' to quite");
      System.out.print("Please enter opreation from the list: ");
    
      char op = input.nextLine().charAt(0);
    
    

      switch (op) {
        case '+':
          result = clac.add(n1, n2);
          System.out.println(result);
          break;
      
        case '-':
          result = clac.subtract(n1, n2);
          System.out.println(result);
          break;
      
        case '*':
          result = clac.multiply(n1, n2);
          System.out.println(result);
          break;
      
        case '/':
          result = clac.divide(n1, n2);
          System.out.println(result);
          break;
      
        case 'q', 'Q':
          input.close();
          return;
      
        default:
          System.out.println("Invalid opreator.");
          break;
      }
    }
  }
}
