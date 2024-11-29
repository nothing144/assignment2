public class CylinderSurfaceArea {
    public static void main(String[] args) {
        // Parse command line arguments
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        
        // Calculate the surface area
        double surfaceArea = Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
        
        // Print the result
        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
}
