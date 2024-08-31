public class Rectangle {
  private int length;
  private int width;

  ////Setter methods that uses method chaining
  public Rectangle setLength(int length) {
    this.length = length;
    return this;
  }
  
  public Rectangle setWidth(int width) {
    this.width = width;
    return this;
  }

  //Method to display Rec. area
  public int calculateArea(){
    return length * width;
  }
  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    rect.setLength(4).setWidth(4).calculateArea();
    System.out.println(rect.calculateArea());
  }
}

