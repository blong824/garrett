public class Triangle {

	private double side1;
	private double side2;
	private double side3;
	private double height;
	
	public Triangle() {}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setSide1(double s1) {
		side1 = s1;
	}
	
	public void setSide2(double s2) {
		side2 = s2;
	}
	
	public void setSide3(double s3) {
		side3 = s3;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double area() {
		return .5 * side2 * height;
	}
	
	public double perimeter() {
		return side1 + side2 + side3;
	}
	
}