public class ShapeApp
{
    

    public static void main (String[]args)
    {
        
        Circle aCircle=new Circle(3);
		System.out.println("Circle's area: "+aCircle.getArea());
		Rectangle aRectangle=new Rectangle(4,5);
		System.out.println("Rectangle's area: "+aRectangle.getArea());
		Square aSquare=new Square(6);
		System.out.println("Square's area: "+aSquare.getArea());
        
       
        
    }
}