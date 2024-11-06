package assignment2;
import java.util.*;
public class homeassignment1 {
	public static void main(String[] args) {
		System.out.println("enter the number of minutes");
		Scanner sc = new Scanner(System.in);
		long minutes = sc.nextLong();
		int totaldays = (int)(minutes / (24 * 60)); 
		int year = totaldays/365;
		int days = totaldays%365; 
		System.out.println(minutes + " is approximatly " + year + " years and " + days);
		sc.close();
	}

}
