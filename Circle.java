public class Circle extends Shape
{
    private double radius;
    
    public Circle(double radius)
    {
        super();
        this.radius=radius;
        this.calculateArea();
        
    }
    
    
    
    protected void calculateArea()
    {
    	
         this.area=Math.PI*Math.pow(radius,2);
       
       
    }
    public double getArea()
    {
        return this.area;
    }

	

	
    
    
}