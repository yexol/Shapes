/**
* Defines a trapezoid given the 2 bases and 2 sides.
*
* @author Samuel Ashby
*/
public class Trapezoid implements Shape {
	
	private final double base_one, base_two, leg_one, leg_two;
	
	public Trapezoid(double base_one, double base_two, double leg_one, double leg_two) {
		if (base_one > base_two) {
			this.base_one = base_one;
			this.base_two = base_two;
		} else {
			this.base_one = base_two;
			this.base_two = base_one;
		}
		this.leg_one = leg_one;
		this.leg_two = leg_two;
	}
	
	@Override
	public double getArea() {
		double height = Math.sqrt((base_one + leg_one - base_two + leg_two) *
				(-base_one + leg_one + base_two + leg_two) *
				(base_one - leg_one - base_two + leg_two) *
				(base_one + leg_one - base_two - leg_two) /
				(4 * Math.pow((base_one - base_two), 2)));
		return ((base_one + base_two) / 2) * height;
	}

	@Override
	public double getPerimeter() {
		return base_one + base_two + leg_one + leg_two;
	}

}
