import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();
        
        // Generate two random integers between 1 and 6
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        
        // Calculate the sum
        int sum = die1 + die2;
        
        // Print the results
        System.out.println("Roll of die 1: " + die1);
        System.out.println("Roll of die 2: " + die2);
        System.out.println("Sum of the two dice rolls: " + sum);
    }
}
