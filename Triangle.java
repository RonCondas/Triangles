/*Ronald Noriega-Valdeolla
 * INEW 2338
 * 10/30/2023
 In this exercise, I wrote a class named RightTriangle that asks the user for a BASE and HEIGHT
 The program create an instance of the RightTriangle class, with the value entered by the user passed to the constructor.
  The program call the object's methods to display the area and perimeter.
 */

//import java.io.IOException;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double base = inBase();
		double height = inHeight();
		
//		System.out.println("Please enter height");
//		height = kb.nextDouble();
		
		RightTriangle triAngle = new RightTriangle(base,height);
		//my objects
		double area = triAngle.calcArea();
		double perimeter = triAngle.calcPerimeter();
		
		//outputs
		display(area, perimeter);
//		}
//		catch(IOException e){
//			
//		}
	}
	public static void display( double area, double perimeter)
	{	
		int newArea = (int) area;
		int newPerimeter = (int) perimeter;
		System.out.printf("%nThe area of the triangle is:  %d",newArea);
		System.out.printf("%nThe perimeter of the triangle is:  %d",newPerimeter);
	}
	public static double inBase() {
		//1. variables
				double daBase = 0.0;
//				boolean notCorrect = false;
		try {
			Scanner key = new Scanner(System.in);
			
			//2.Ask the user to enter base and height to store it
			System.out.println("Please enter base");
			
			daBase = key.nextDouble();
			}
			catch(Exception e){
				Scanner ki = new Scanner(System.in);
				System.out.println("Not right format. Please re-enter your base:-)");
				while(!ki.hasNextDouble()) {
					ki.next();
					System.out.println("Not right format. Please re-enter your base:-)");
				}
				
				daBase = ki.nextDouble();
			}
		
		return daBase;	
	}
	public static double inHeight() {
		//1. variables
				double daHeight = 0.0;
		
		try {
			Scanner key = new Scanner(System.in);
			
			//2.Ask the user to enter base and height to store it
			System.out.println("Please enter height");
			
			daHeight = key.nextDouble();
			}
		
		catch(Exception e){
				Scanner ki = new Scanner(System.in);
				System.out.println("Not right format. Please re-enter your height\t:-)");
				while(!ki.hasNextDouble()) {
					ki.next();
					System.out.println("Not right format. Please re-enter your height\t:-)");
				}
				
				daHeight = ki.nextDouble();
			}
		
		return daHeight;
	}
	
}
