package assignment2;
import java.util.*;
public class question5 {
	public static void main(String[] args) {
		System.out.println("enter radius");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double r = Math.pow(radius, 2);
		double pi = Math.PI;
		double area = 3*pi*r;
		double r2 = Math.pow(radius, 3);
		double volume = (2.0/3)*pi*r2;
		System.out.println("the volume of hemisphere is " + volume + "\nthe area of hemisphere is "+ area);
	}

}
