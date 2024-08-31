
class Circle {
  private double radius;
  private String color;
//Getter Methods
  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }
// Circle constructor to initialize instance varible
  public Circle (double radius, String color){
    this.radius = radius;
    this.color = color;
  }
// Private method to find the circle's area
  private double calculateArea(){
    return Math.PI * radius * radius;
  }
// Method to disply details
  public void displayDetails(){
    System.out.println("The color is: " + getColor() + " | The raduis is: " + getRadius() + " | Circle area = " + calculateArea());
  }
}
public class Main3 {
  public static void main(String[] args) {
    Circle circle = new Circle(1, "Red");

    circle.displayDetails();
  }
}
