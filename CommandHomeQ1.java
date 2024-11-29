public class Q1 {
    public static void main(String[] args) {
        // Parse command line arguments
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Print the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
