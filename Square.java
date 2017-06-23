/**
* Defines a square given the length of a side.
*
* @author Samuel Ashby
*/
public class Square implements Shape {
	
	private final double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}
