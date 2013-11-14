package gravity;

public class Gravity {

	//d= 1/2gt^2
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			double distance = fallingDistance(i);
			System.out.println(distance);
		}	

		
	}
	
	public static double fallingDistance(int seconds) {
		
		double gravity = 9.8;
		
		double d = 0.5 * gravity * (seconds * seconds);
		
		return d;
		
	}
	
}
