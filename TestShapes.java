import static org.junit.Assert.*;
import org.junit.*;

/**
* Tests all implementations of the shape interface.
*
* @author Samuel Ashby
*/
public class TestShapes {
	
	@Test
	public void testTriangle() {
		System.out.println("Beginning test of triangle implementation.");
		try {
			//Test 1
				Triangle t1 = new Triangle(3, 7, 9);
				assertEquals(8.7856, t1.getArea(), 0.0001);
				assertEquals(19, t1.getPerimeter(), 0);
			//Test 2
				Triangle t2 = new Triangle(5, 5, 5);
				assertEquals(10.8253, t2.getArea(), 0.0001);
				assertEquals(15, t2.getPerimeter(), 0);
			//Test 3
				Triangle t3 = new Triangle(3, 4, 3);
				assertEquals(4.4721, t3.getArea(), 0.0001);
				assertEquals(10, t3.getPerimeter(), 0);
			//Test 4
				Triangle t4 = new Triangle(8, 10, 15);
				assertEquals(36.9789, t4.getArea(), 0.0001);
				assertEquals(33, t4.getPerimeter(), 0);
			//Test 5
				Triangle t5 = new Triangle(30, 24, 10);
				assertEquals(106.132, t5.getArea(), 0.0001);
				assertEquals(64, t5.getPerimeter(), 0);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}
	
	@Test
	public void testCircle() {
		System.out.println("Beginning test of circle implementation.");
		try {
			//Test 1
				Circle c1 = new Circle(5);
				assertEquals(78.5398, c1.getArea(), 0.0001);
				assertEquals(31.4159, c1.getPerimeter(), 0.0001);
			//Test 2
				Circle c2 = new Circle(17);
				assertEquals(907.9202, c2.getArea(), 0.0001);
				assertEquals(106.8141, c2.getPerimeter(), 0.0001);
			//Test 3
				Circle c3 = new Circle(13);
				assertEquals(530.9291, c3.getArea(), 0.0001);
				assertEquals(81.6814, c3.getPerimeter(), 0.0001);
			//Test 4
				Circle c4 = new Circle(32);
				assertEquals(3216.9908, c4.getArea(), 0.0001);
				assertEquals(201.0619, c4.getPerimeter(), 0.0001);
			//Test 5
				Circle c5 = new Circle(24);
				assertEquals(1809.5573, c5.getArea(), 0.0001);
				assertEquals(150.7964, c5.getPerimeter(), 0.0001);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}
	
	@Test
	public void testRectangle() {
		System.out.println("Beginning test of rectangle implementation.");
		try {
			//Test 1
				Rectangle r1 = new Rectangle(5, 7);
				assertEquals(35, r1.getArea(), 0);
				assertEquals(24, r1.getPerimeter(), 0);
			//Test 2
				Rectangle r2 = new Rectangle(13, 4);
				assertEquals(52, r2.getArea(), 0);
				assertEquals(34, r2.getPerimeter(), 0);
			//Test 3
				Rectangle r3 = new Rectangle(10, 6);
				assertEquals(60, r3.getArea(), 0);
				assertEquals(32, r3.getPerimeter(), 0);
			//Test 4
				Rectangle r4 = new Rectangle(24, 14);
				assertEquals(336, r4.getArea(), 0);
				assertEquals(76, r4.getPerimeter(), 0);
			//Test 5
				Rectangle r5 = new Rectangle(30, 51);
				assertEquals(1530, r5.getArea(), 0);
				assertEquals(162, r5.getPerimeter(), 0);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}
	
	@Test
	public void testEllipse() {
		System.out.println("Beginning test of ellipse implementation.");
		try {
			//Test 1
				Ellipse e1 = new Ellipse(10, 6);
				assertEquals(188.4955, e1.getArea(), 0.0001);
				assertEquals(51.0539, e1.getPerimeter(), 0.0001);
			//Test 2
				Ellipse e2 = new Ellipse(15, 8);
				assertEquals(376.9911, e2.getArea(), 0.0001);
				assertEquals(73.9396, e2.getPerimeter(), 0.0001);
			//Test 3
				Ellipse e3 = new Ellipse(7, 12);
				assertEquals(263.8937, e3.getArea(), 0.0001);
				assertEquals(60.7281, e3.getPerimeter(), 0.0001);
			//Test 4
				Ellipse e4 = new Ellipse(14, 11);
				assertEquals(483.8052, e4.getArea(), 0.0001);
				assertEquals(78.8228, e4.getPerimeter(), 0.0001);
			//Test 5
				Ellipse e5 = new Ellipse(20, 27);
				assertEquals(1696.4600, e5.getArea(), 0.0001);
				assertEquals(148.4748, e5.getPerimeter(), 0.0001);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}
	
	@Test
	public void testSquare() {
		System.out.println("Beginning test of square implementation.");
		try {
			//Test 1
				Square s1 = new Square(5);
				assertEquals(25, s1.getArea(), 0);
				assertEquals(20, s1.getPerimeter(), 0);
			//Test 2
				Square s2 = new Square(8);
				assertEquals(64, s2.getArea(), 0);
				assertEquals(32, s2.getPerimeter(), 0);
			//Test 3
				Square s3 = new Square(10);
				assertEquals(100, s3.getArea(), 0);
				assertEquals(40, s3.getPerimeter(), 0);
			//Test 4
				Square s4 = new Square(25);
				assertEquals(625, s4.getArea(), 0);
				assertEquals(100, s4.getPerimeter(), 0);
			//Test 5
				Square s5 = new Square(31);
				assertEquals(961, s5.getArea(), 0);
				assertEquals(124, s5.getPerimeter(), 0);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}
	
	@Test
	public void testTrapezoid() {
		System.out.println("Beginning test of trapezoid implementation.");
		try {
			//Test 1
				Trapezoid t1 = new Trapezoid(9, 5, 3, 4);
				assertEquals(19.468, t1.getArea(), 0.001);
				assertEquals(21, t1.getPerimeter(), 0);
			//Test 2
				Trapezoid t2 = new Trapezoid(26, 16, 13, 13);
				assertEquals(252, t2.getArea(), 0.001);
				assertEquals(68, t2.getPerimeter(), 0);
			//Test 3
				Trapezoid t3 = new Trapezoid(20, 13, 7, 6);
				assertEquals(89.447, t3.getArea(), 0.001);
				assertEquals(46, t3.getPerimeter(), 0);
			//Test 4
				Trapezoid t4 = new Trapezoid(15, 7, 9, 10);
				assertEquals(94.042, t4.getArea(), 0.001);
				assertEquals(41, t4.getPerimeter(), 0);
			//Test 5
				Trapezoid t5 = new Trapezoid(8, 6, 3, 2);
				assertEquals(13.89, t5.getArea(), 0.001);
				assertEquals(19, t5.getPerimeter(), 0);
		} catch (AssertionError incorrect) {
			System.out.println(incorrect.getMessage());
		}
	}

	@After
	public void testCompletion() {
		System.out.println("Testing has been completed.");
	}

}
