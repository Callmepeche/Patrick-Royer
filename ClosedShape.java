
public class ClosedShape implements Compareable <ClosedShape>
{
  private double area;
  private final double TOLERANCE = 0.00001;
  private int compareTo(ClosedShape other);
  
  {
     double a = (double)this.getArea(); 
     double b = (double)other.getArea(); 
     double c = a - b;

     if (c <= TOLERANCE && c >= 0)
     {
       return 0;
     }
     else if (c > 0)
     {
       return 1;
     }
     else 
     {
       return -1;
     }
  }
         
    public ClosedShape (double area)
    {
      this.area = area;
    }
    
    public void setArea (double area)
    {
      this.area = area;
    }
    
    public double getArea()
    {
      return area;
    }
  
     public String toString()
   {
      String result;
      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
      return result;
   }
}
    
  
  
  
