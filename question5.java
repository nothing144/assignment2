package assignment2;
import java.util.*;
public class question5 {
	public static void main(String[] args) {
		System.out.println("enter radius");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		float area = 3 * 3.14f * radius * radius;
		float volume = (2.0f/3.14f)*radius * radius * radius;
		System.out.println("area of hemisphere " + area);
		System.out.println("volume of hemisphere " + volume);
		sc.close();
	}

}
