/*
 * Author Zulfiqar Salahuddin
 * Calculate Area and Perimeter for Triangle
 */

package MainPackage;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	
	private double side2 = 1.0;
	
	private double side3 = 1.0;

	
	Triangle() {
		
	}

	public Triangle(double side1, double side2, double side3) {
		
		this.side1 = side1;
		
		this.side2 = side2;
		
		this.side3 = side3;
	
	} 
	
	/*
	 * Accessor for side1
	 */
	public double getSide1() {
		
		return side1;
		
	}
	
	/*
	 * Accessor for side2
	 */
	public double getSide2() {
		
		return side2;
		
	}
	
	/*
	 * Accessor for side3
	 */
	public double getSide3() {
		
		return side3;
		
	}
	
	/*
	 * Calculate Area for the Triangle
	 */
	public double getArea() {
		
		double p;
		
		p = (getSide1() + getSide2() + getSide3()) / 2;
		
		float P_side1;
		
		P_side1 = (float)(p - getSide1());
		
		float P_side2;
		
		P_side2 = (float)(p - getSide2());
		
		float P_side3;
		
		P_side3 = (float)(p - getSide3());
		
		double inside;
		
		inside = p*(P_side1)*(P_side2)*(P_side3);
		
		double AREA;
		
		AREA = (double)Math.sqrt(inside);
		
		return AREA;
			
	}
	
	/*
	 * Calculates Perimeter for the Triangle
	 */
	public double getPerimeter() {
		
		double P;
		
		P = getSide1() + getSide2() + getSide3();
		
		return P;
		
	}
	
	/*
	 * Return Triangle Description
	 */
	public String toString() {
		
		String s1 = " side1: " + getSide1();
		
		String s2 = " side2: " + getSide2();
		
		String s3 = " side3: " + getSide3();
		
		return "Triangle Description ----> " + s1 + s2 + s3;
		
	}

}