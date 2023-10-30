
public class RightTriangle {
	
	private double base; // Instance variable
	private double height;// Instance variable
	
	public RightTriangle(double b, double h)// Triangle constructor that receive two parameters
	{
		base = b;
		height = h;
	}
	
	public RightTriangle()// Triangle constructor that receive two parameters
	{
		base = 0.0;
		height = 0.0;
	}
	
	//method that set the base
	public void setBase(double b)
	{
		base = b;
	}
	//method that get the base
	public double getBase() 
	{
		return base;
	}
	public void setHeight(double h)//method that set the height
	{
		height = h;
	}
	public double getHeight()//method that get the height
	{
		return base;
	}
	public double calcArea()//method that get the area
	{
		double area = 0.0;
		
		area = (base * height) / 2;
		
		return area;
	}
	
	public double calcPerimeter()//method that get the perimeter
	{	
		double perimeter = 0.0;
		double hypotenuse = Math.sqrt((Math.pow(base, 2)) + (Math.pow(height, 2)));
		perimeter = base + height + hypotenuse;
		
		return perimeter;
		
	}
}
