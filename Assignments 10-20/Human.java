public class Human {
  private String name;
  private String email;
  private int age;

  // Setters methods with validation condition
  public void setName(String name){
    if(name != null && !name.isEmpty()){ // To ensure that the name was enterd and not empty
      this.name = name;
    } else {
      System.out.println("Please enter your name");
    }
  }

  public void setEmail(String email){ // To ensure that the email was enterd and contains @ symbol
    if(email != null && email.contains("@")){
      this.email = email;
    } else{
      System.out.println("Please enter a valid Email");
    }
  }

  public void setAge(int age){ // To ensure that the age is greater than 0
    if(age > 0){
      this.age = age;
    } else{
      System.out.println("You should enter age creater than 0");
    }
  }
//Getter methods
  public String getName (){
    return this.name;
  }

  public String getEmail (){
    return this.email;
  }

  public int getAge (){
    return this.age;
  }

  public void printInfo(){
    System.out.println("The person information : Name " + this.name + " | E-mail: " + this.email + " | Age: " + this.age);
  }

  public static void main(String[] args) {
    Human human = new Human(); // Human default constructor
    human.setName("Munzir");
    human.setEmail("Mohammed@gamil.com");
    human.setAge(3);
  
    human.printInfo();
    
  }
}
