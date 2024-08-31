public class Car {
  String make;
  String model;
  int year;

  //Constructor
  public Car(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
  }

  //Method to show deails 
  public void displayDetails(){
    System.out.println("Make: " + this.make);
    System.out.println("Model: " + this.model);
    System.out.println("Year: " + this.year);
  }

  public static void main(String[] args) {
    Car car = new Car("Toyota", "Camry", 2022);
    car.displayDetails();
  }

}



