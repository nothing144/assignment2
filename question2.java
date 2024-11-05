package assignment2;
import java.util.*;
public class question2 {
	public static void main(String[] args) {
		System.out.println("enter distance in km ");
		Scanner sc = new Scanner(System.in);
		long km = sc.nextLong();
		double meter = km * 1000d;
		double feet = km * 3280.8399d;
		double inch = km * 39370.07087d;
		double centimeter = km * 100000;
		System.out.println(km + " km is " + meter + " meter" );
		System.out.println(km + " km is " + feet + " feet");
		System.out.println(km + " km is " + inch + " inch");
		System.out.println(km + " km s " + centimeter + " centimeter" );
	}

}
