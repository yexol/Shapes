/**
* Defines a rectangle given the length and width.
*
* @author Samuel Ashby
*/
public class Rectangle implements Shape {
	
	private final double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}

}
