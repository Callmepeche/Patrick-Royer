
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
     else
     {
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
      if (area == 0)
         result = "The area of the shape is " + this.area ;
      else
            result = "The area of the two shapes are the same";
         
      return result;
   }
}
    
  
  
  
