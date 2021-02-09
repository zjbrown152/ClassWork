public class Square extends Rectangle
{
	private double side;
	
	
    public Square(double side)
    {
        super(side,side);
        this.side=side;
        this.calculateArea();
    }
  
    protected void calculateArea(){
        super.calculateArea();
    } 
    public double getArea(){
        return this.area;
    }
}
