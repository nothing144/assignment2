public class Q4 {
    public static void main(String[] args) {
        // Parse the command line argument to an integer
        int number = Integer.parseInt(args[0]);
        
        // Ensure the number is a four-digit number by splitting into first and last digits
        // Extract the first digit
        int firstDigit = number / 1000;
        
        // Extract the last digit
        int lastDigit = number % 10;
        
        // Calculate the sum of the first and last digits
        int sum = firstDigit + lastDigit;
        
        // Print the result
        System.out.println("Sum of the first and last digits: " + sum);
    }
}
