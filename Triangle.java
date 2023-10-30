/*Ronald Noriega-Valdeolla
 * INEW 2338
 * 10/30/2023
 In this exercise, I wrote a class named RightTriangle that asks the user for a BASE and HEIGHT
 The program create an instance of the RightTriangle class, with the value entered by the user passed to the constructor.
  The program call the object's methods to display the area and perimeter.
 */

import java.io.IOException;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		try {
		//1. variables
		double base = 0.0;
		double height = 0.0;
		
		Scanner kb = new Scanner(System.in);
		
		//2.Ask the user to enter base and height to store it
		System.out.println("Please enter base");
		base = kb.nextDouble();
		System.out.println("Please enter height");
		height = kb.nextDouble();
		
		RightTriangle triAngle = new RightTriangle(base,height);
		//my objects
		double area = triAngle.calcArea();
		double perimeter = triAngle.calcPerimeter();
		
		//outputs
		display(base, height, area, perimeter);
		}
		catch(IOException e){
			
		}
	}
	public static void display(double base, double height, double area, double perimeter)
	{
		System.out.printf("%nThe area of the triangle is:  %.2f",area);
		System.out.printf("%nThe perimeter of the triangle is:  %.2f",perimeter);
	}
}
