/**
* Defines a circle given the radius.
*
* @author Samuel Ashby
*/
public class Circle implements Shape {
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
