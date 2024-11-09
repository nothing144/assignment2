package assignment2;
import java.util.*;
public class homeassignment2 {
	public static void main(String[] args) {
		System.out.println("enter no of eggs");
		Scanner sc = new Scanner(System.in);
		int totaleggs = sc.nextInt();
		int gross = totaleggs/144; // 1 gross = 144 eggs
		int lefteggs = totaleggs%144;
		int dozen = lefteggs/12;
		int leftover = lefteggs%12;
		System.out.println("your number of eggs is "+ gross + "  gross " + dozen + " dozen and " + leftover + " left");
		/*
		 enter no of eggs
         1342
         your number of eggs is 9  gross 3 dozen and 10 left

		 */
		
	}

}
