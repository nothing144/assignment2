package assignment2;
import java.util.*;
public class question1 {
public static void main(String[] args) {
	
	System.out.println("enter temperature in fahrenheit  ");
	Scanner sc = new Scanner(System.in);
	long temperature = sc.nextLong();
	int celcius = (int) ((temperature-32)*(5.0/9));
	
	System.out.println( "temperature in celcius" + celcius);
	
	
 }
}
