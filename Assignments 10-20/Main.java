
class Person{
  private String name;
  private String address;
  private int age;

  /*I made these get methods to use Person`s instance varible in Show method to view details in another classes.
   *You will see "Show Method" sentnce in another classes to understand why i made these getter methods...*/
  // Get method
  public String getName() {
    return name;
  }

  // Get method
  public int getAge() {
    return age;
  }

  // Get method
  public String getAddress() {
    return address;
  }


  // Person constructor
  public Person(String name, int age, String address){
      this.name = name;
      this.age = age;
      this.address = address;
    }

    // Show Method
  public void showDetails(){
    System.out.print("Name: "+ name + " | ");
    System.out.print("Age: " + age + " | ");
    System.out.print("Address: " + address + " | ");
  }
}

class Student extends Person {
  private String major;
  private int studentID;

  public Student(String name, int age, String address, int studentID, String major){
    super(name, age, address);
    this.studentID = studentID;
    this.major = major;
  }

  //Show Method
  public void showDetails(){
    super.showDetails();
    System.out.print("Student`s ID: " + studentID + " | ");
    System.out.print("Student`s major: " + major + " | \n");
  }
}

class Teacher extends Person{
  private int employeeID;
  private String subject;

  public Teacher (String name, int age, String address, int employeeID, String subject){
    super(name, age, address);
    this.employeeID = employeeID;
    this.subject = subject;
  }

  //Show Method
  public void showDetails(){
    super.showDetails();
    System.out.print("Employee`s ID: " + employeeID + " | ");
    System.out.print("Employes`s subject: " + subject + " | \n");
  }
}


public class Main{
  
  public static void main(String[] args) {
    Student student1 = new Student("Munzir", 28, "Khartoum", 9090, "CS");
    Teacher teacher1 = new Teacher("Mohamed", 42, "USA", 9191, "English");

    student1.showDetails();
    teacher1.showDetails();

  }
}