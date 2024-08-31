public class Student {
  private String name;
  private int grade;
  private int studentID;

  //Name constructor
  public Student (String name){
    this(name, 10, 0);
  }

  //Name & Grade constructor
  public Student (String name, int grade){
    this(name, grade, 1001);
  }

  //Instance constructor
  public Student(String name, int grade, int studentID){
    this.name = name;
    this.grade = grade;
    this.studentID = studentID;
  }

  //Method to display student`s details
  public void displayInfo(){
    System.out.println("Student's name: " + this.name);
    System.out.println("Grade: " + this.grade);
    System.out.println("student's ID: " + this.studentID);
  }

  public static void main(String[] args) {
    Student studentObj = new Student("Munzir");
    studentObj.displayInfo();
  }
}
