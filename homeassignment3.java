package assignment2;
import java.util.*;
public class homeassignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 and y1");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("enter x2 and y2");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("enter x3 and y3");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		// to find the length of all the sides of a triangle
		double ab = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) );//Math.sqrt(any number) find square root of that number 
		double bc = (Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)) );
		double ca = (Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3)) );
		
		double s = (ab + bc + ca)/2;
		double area = Math.sqrt(s * (s-ab) * (s-bc) * (s-ca));
		System.out.println("Area is " + area );
		
		
		}
}
