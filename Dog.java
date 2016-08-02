public class Dog 
{
  private String _name;
  private int _age;
  
  public Dog (String name, int age)
  {
    _name = name;
    _age = age;
  }
  
  public String getName ()
  {
    return _name;
  }
  
  public int getAge ()
  {
    return _age;
  }
  
  public int getPersonYears ()
  {
    return getAge() * 7;
  }
  
  public String toString() 
  {
    return "The name of the dog is" + getName() + 
           "The age of the dog in dog years is: " + getAge()
           "The dog's age in person years is: " + getPersonYears();
  }
}
  
