/**
* Defines a ellipse given the semimajor and semiminor.
*
* @author Samuel Ashby
*/
public class Ellipse implements Shape {
	
	private final double semimajor, semiminor;
	
	public Ellipse(double semimajor, double semiminor) {
		this.semimajor = semimajor;
		this.semiminor = semiminor;
	}

	@Override
	public double getArea() {
		return Math.PI * semimajor * semiminor;
	}

	@Override
	public double getPerimeter() { // Changed to Ramanujan approximation to be more accurate.
		return Math.PI * (3 * (semimajor + semiminor)
				- Math.sqrt((3 * semimajor + semiminor) * (semimajor + 3 * semiminor)));
		//return 2 * Math.PI * Math.sqrt((Math.pow(semimajor, 2) + Math.pow(semiminor, 2)) / 2);
	}

}
