import java.util.Scanner;

public class TriangleConstructor {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter side 1: ");
		tri.setSide1(keyboard.nextDouble());
		
		System.out.print("Enter side 2: ");
		tri.setSide2(keyboard.nextDouble());
		
		System.out.print("Enter side 3: ");
		tri.setSide3(keyboard.nextDouble());
		
		System.out.print("Enter the height: ");
		tri.setHeight(keyboard.nextDouble());
		
		System.out.println("The area of the triangle is: "+tri.area());
		System.out.println("The perimeter of the triangle is: "+tri.perimeter());
		
	}
	
}