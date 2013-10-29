package gravity;

public class Player {

	public static void main(String[] args) {
		
		moveUp();
		moveUp();
		moveLeft();
		moveUp(4);
		moveUp(5.5);
		moveRight();
		moveDown();
		
	}
	
	public static void moveUp() {
		System.out.println("Im moving up");
	}
	
	public static void moveUp(int spaces) {
		System.out.println("Im moving up "+spaces);
	}
	
	public static void moveUp(double moreSpaces) {
		System.out.println("Im moving up "+moreSpaces);
	}	
	
	public static void moveDown() {
		System.out.println("Im moving down");
	}
	
	public static void moveLeft() {
		System.out.println("Im moving left");
	}
	
	public static void moveRight() {
		System.out.println("Im moving right");
	}
	
}