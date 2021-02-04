
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Rectangle.java");
		
		Rectangle rec1 = new Rectangle(2,2);
		
		int Rec1Length = rec1.getLength();
		System.out.println("Rectangle Length: "+Rec1Length);
		
		int Rec1Width = rec1.getWidth();
		System.out.println("Rectangle Width: "+Rec1Width);
		
		int Rec1Area = rec1.calculateArea();
		System.out.println("Rectangle Area: "+Rec1Area);
		
		int Rec1Perimeter = rec1.calculatePerimeter();
		System.out.println("Rectangle Perimeter: "+Rec1Perimeter);
		
		System.out.println("==============================");
		
		System.out.println("DistanceCalculator.java");
				
		DistanceCalculator calc = new DistanceCalculator();
		
		double dist = calc.calculateDistance(0, 0, 5, 5);
		
		System.out.println("The distance between the two points is: "+dist);
		
		System.out.println("==============================");
		
		System.out.println("BasicMath.java");
		
		BasicMath math = new BasicMath();
		
		int a=10 , b=5;
		
		int add = math.add(a, b);
		System.out.println("10 + 5 = "+ add);
		
		int subraction = math.subtract(a, b);
		System.out.println("10 - 5 = "+subraction);
		
		int mult = math.multiply(a, b);
		System.out.println("10 x 5 = "+mult);
		
		double div = math.divide(a, b);
		System.out.println("10 / 5 = "+div);
		
		System.out.println("==============================");
		
		System.out.println("DateManipulator.java");
		
		DateManipulator dm = new DateManipulator();
		
		boolean date1 = dm.isLeapYear(1780);
		System.out.println("1780 is a leap year: "+date1);
		boolean date2 = dm.isLeapYear(1789);
		System.out.println("1789 is a leap year: "+date2);
		boolean date3 = dm.isLeapYear(1400);
		System.out.println("1400 is a leap year: "+date3);


	}

}
