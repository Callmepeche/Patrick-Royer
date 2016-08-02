# Patrick-Royer

import java.util.Scanner;

public class Kennel
{
  public static void main(String[] args) 
  {
    Dog dog = new Dog("nigel", 4);
    System.out.println(dog.toString());
    
    
    String name;
    int age = 0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please put in dog's name and age: ");
    name = scan.nextLine();
    age = scan.nextInt();
    
    scan.close();
   
    Dog dog = new Dog(name, age);
    
    System.out.println(dog);
    
  }
}
