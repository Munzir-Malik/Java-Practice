/*
  Write a function that converts a temperature from Celsius to Fahrenheit and vice versa.
 */
public class Assignment9 {

  // Temp > Temperature | type > Temperature Type
  public static int tempConvertor(int temp, char type){
    switch (type) {
      case 'f': case 'F':
        return (int) ( ((temp - 32) * (5/9)) );
    
        case 'c': case 'C':
        return (int) ( ((temp * (5/9) + 32)) );
      
      default:
        return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println (tempConvertor(25, 'c') );
  }
}
