package assignment2;
import java.util.*;
public class question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//     
		System.out.println("input a1--a5 and b1--b5");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt(); 
		int b1 = sc.nextInt();
		int b2 = sc.nextInt(); 
		int b3 = sc.nextInt();
		int b4 = sc.nextInt();
		int b5 = sc.nextInt();
		System.out.println("a\t b\t pow(a, b)");
		// Math.pow(a, b) gives b^a means if a = 2 and b =3 output will be 9
		System.out.println( a1 +"\t "+ b1 + "\t " + (int) Math.pow(a1, b1));
		System.out.println(a2 +"\t "+ b2 + "\t " + (int) Math.pow(a2, b2));
		System.out.println(a3 +"\t "+ b3 + "\t " + (int) Math.pow(a3, b3));
		System.out.println(a4 +"\t "+ b4 + "\t " + (int)Math.pow(a4, b4));
		System.out.println(a5 +"\t "+ b5 + "\t " +(int) Math.pow(a5, b5)); 
		sc.close();
	}
}
