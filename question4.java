package assignment2;
import java.util.*;
public class question4 {
	public static void main(String[] args) {
		System.out.println("enter num between 0 and 1000");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	 int num1 = num % 10;
		int num2 = (num/10)%10;
		int num3 = (num/100)%10;
		System.out.println(num1  + num2 + num3); 
		sc.close();		
	}

}
