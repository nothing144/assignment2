package assignment2;
import java.util.*;
public class question6 {
public static void main(String[] args) {
	System.out.println("input time");
	Scanner sc = new Scanner(System.in);
	double t = sc.nextDouble();
	double time = Math.pow(t, 2);
	double d = (0.5d)*32.174d*time; 
System.out.println("Distance travelled " + d);	
sc.close();
 }
}
