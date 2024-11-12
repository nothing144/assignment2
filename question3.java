package assignment2;
import java.util.*;
public class question3 {
	public static void main(String[] args) {
		System.out.println("enter basic salary");
		Scanner sc = new Scanner(System.in);
		long BasicSalary = sc.nextLong();
		double DA = BasicSalary * 0.4d;
		double HRA = BasicSalary * 0.2d;
		double GrossSalary = BasicSalary + DA + HRA;
		System.out.println("DA is " + DA);
		System.out.println("HRA is " + HRA);
		System.out.println("Gross Salary is " + GrossSalary);
		sc.close();
		
	}

}
