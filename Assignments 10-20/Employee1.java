public class Employee1 {
  String name;
  double salary;

  //Instance constructor
  public Employee1(String name, double salary){
    this.name = name;
    this.salary = salary;
  }

  //Method to increase salary
  public double increaseSalary(double increment){
    return this.salary += increment;
  }

  //Method to disdlay salary
  public void displaySalary(){
    System.out.println("Salary after increment: " + this.salary);
  }


  public static void main(String[] args) {
    Employee1 employe = new Employee1("Omer", 30000);

    employe.increaseSalary(25000);

    employe.displaySalary();
  }


}