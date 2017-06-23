/**
* Defines a triangle given the length of the 3 sides.
*
* @author Samuel Ashby
*/
public class Triangle implements Shape {
	
	private final double first_side, second_side, third_side;
	
	public Triangle(double first_side, double second_side, double third_side) {
		this.first_side = first_side;
		this.second_side = second_side;
		this.third_side = third_side;
	}

	@Override
	public double getArea() { // Uses Heron's formula to get area without the height.
		double semiperi = (first_side + second_side + third_side) / 2;
		return Math.sqrt(semiperi * (semiperi - first_side) * (semiperi - second_side) * (semiperi - third_side));
	}

	@Override
	public double getPerimeter() {
		return first_side + second_side + third_side;
	}

}
