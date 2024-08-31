// I made this Animal class to inherit speak method from it beacuse that it's empty
class Animal{
  public void speak(){};
}
// Dog class that ineherited from Animal base class 
class Dog extends Animal{
  public void speak(){
    System.out.println("Woof");
  }
}
// Cat class that ineherited from Animal base class 
class Cat extends Animal{
  public void speak(){
    System.out.println("Meow");
  }
}

public class Main2
{
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.speak();
    cat.speak();

    
  }
}
