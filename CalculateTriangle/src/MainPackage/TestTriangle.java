package MainPackage;

public class TestTriangle {

	public static void main(String[] args) {
		
		
		Triangle userTriangle = new Triangle();
			
		System.out.println(userTriangle.toString());
			
		System.out.println("The Perimeter for Triangle is: " + userTriangle.getPerimeter());
			
		System.out.println("The Area for the Triangle is: " + userTriangle.getArea());
		
		System.out.println("The Triangle's Color is : " + userTriangle.getColor());
		
		System.out.println("The Triangle is " + userTriangle.isFilled());
		
			
			
	}

}
