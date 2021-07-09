import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {
		System.out.println("Area of circle is calculated using this formula:Pi*r*r2 ");
		System.out.println("Area of rectangle is calculeted using this formula:l*w");
		System.out.println("Area of rectangle is calculeted using this formula:(l * h) / 2 ");
		System.out.println("1 - Circle\n2 - Rectangle\n3 - Triangle\nPlease enter a number: ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		if(choice == 1) {
			// Calculate the area of a circle.
			System.out.println("Please enter the radius of the circle: ");
			double r = scan.nextDouble();
			double area = Math.PI * r * r;
			System.out.println("Area: " + area);
		}
		else if(choice == 2) {
			// Calculate the area of a rectangle.
			System.out.println("Please enter the length of the rectangle: ");
			double l = scan.nextDouble();
			System.out.println("Please enter the width of the rectangle: ");
			double w = scan.nextDouble();
			double area = l * w;
			System.out.println("Area: " + area);
			}
			else if(choice == 3) {
				// Calculate the area of a triangle.
				System.out.println("Please enter the base of the triangle: ");
				double l = scan.nextDouble();
				System.out.println("Please enter the height of the triangle: ");
				double h = scan.nextDouble();
				double area = (l * h) / 2;
				System.out.println("Area: " + area);
			}
			
		else {
			// Invalid choice.
			System.out.println("You entered an invalid choice!");
		}
	}
}




