
class Employee {
  int employeeID;
  String name;
  String department;
  double salary;

  // Getter Methods for instance variables
  public int getEmployeeID() {
    return employeeID;
  }
  public String getName() {
    return name;
  }
  public String getDepartment(){
    return department;
  }
  public double getSalary(){
    return salary;
  }

  public Employee(int employeeID, String name, String department, double salary){
    this.employeeID = employeeID;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }
}

//Manage class that inheret Employee`s instance 
class Manager extends Employee{
  int teamSize;
  double bouns;

  public Manager(int employeeID, String name, String department, double salary, int teamSize, double bouns){
    super(employeeID, name, department, salary);
    this.teamSize = teamSize;
    this.bouns = bouns;
  }
}

// EmployeeManagement Class
class EmployeeManagement{
  private Employee[] employees;
  private int counter = 0;

  //Constructor that takes size for empolyees array
  public EmployeeManagement(int size){
    employees = new Employee[size];
  }

  //Method to add employee to employees array
  public void addEmployee(Employee employee){
    if(counter < employees.length){
      employees[counter] = employee;
      counter++;
    }
    else {
      System.out.println("The size is full you can`t add another employees");
    }
  }

  // Method to remove employee from employees array based on their ID
  public void removeEmployee(int employeeID) {
    int indexToRemove = -1;
    for (int i = 0; i < counter; i++) {
        if (employees[i].getEmployeeID() == employeeID) {
            indexToRemove = i;
            break;
        }
    }

    if (indexToRemove != -1) {
        for (int i = indexToRemove; i < counter - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[counter - 1] = null;
        counter--;
        System.out.println("Employee removed successfully.");
    } else {
        System.out.println("Employee not found.");
    }
}


// Method to find and return an employee based on their employee ID
  public Employee findEmployee(int employeeID) {
    for (int i = 0; i < counter; i++) {
        if (employees[i].getEmployeeID() == employeeID) {
            return employees[i];
        }
    }
    return null; // Return null if no employee with the given ID is found
  }

  // Method to calculate and return the total salaries of all employees
  public double calculateTotalSalaries() {
    double totalSalaries = 0.0;

    for (int i = 0; i < counter; i++) {
        totalSalaries += employees[i].getSalary();
    }

    return totalSalaries;
  }

}
public class EmployeeManagementSystem {
  public static void main(String[] args){
    // Print out details of all employees.
    // Perform various operations like finding, adding, and removing employees.

    // instances of Employee
    Employee emp1 = new Employee(0, "Munzir", "Human resources", 100);
    Employee emp2 = new Employee(1, "Mohammed", "Health Care", 900);
    
    // instances of Manager
    Manager manage1 = new Manager(1, "Omer", "Officer", 800, 8, 50);
    Manager manage2 = new Manager(2, "Ali", "Police man", 700, 7, 50);
    
    EmployeeManagement employeeManage = new EmployeeManagement(4);
    // Add objects to the EmployeeManagement.
    employeeManage.addEmployee(emp1);
    employeeManage.addEmployee(emp2);
  
    employeeManage.addEmployee(manage1);
    employeeManage.addEmployee(manage2);

    
  }
}
