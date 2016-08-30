public class Triangle extends ClosedShape
{
  private double a, b;

public Triangle(double a, double b)
{
    this.a = a;
    this.b = b;
}

public void computeC()
//this bracket is a symbol error
{
      double c = (double)(a*0.5)*b;
      return c;
}

public void setA (double a)
{
      this.a = a;
}

public double getA ()
{
      return a;
}

public void setB (double b)
{
      this.b = b;
}

public double getB ()
{
      return b;
}

//this tostring is also a symbol error and so is the getA, getB and c
public string toString()
{
  return "Side A is equal to: " + getA + "Side B is equal to: " + getB 
         + "and Side C is equal to: " + c;
}
}


  
  
  
