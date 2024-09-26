import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Start an infinite loop
        while (true) {
            // Prompt the user to enter 'yes' or 'no'
            System.out.print("Enter 'yes' to find the area of a circle (or 'no' to exit): ");
            String userInput = scanner.nextLine().trim().toLowerCase();
            
            // Check if the user wants to exit
            if (userInput.equals("no")) {
                System.out.println("Exiting the program.");
                break;  // Exit the loop
            } 
            // Check if the user wants to find the area of a circle
            else if (userInput.equals("yes")) {
                try {
                    // Prompt the user to enter the radius of the circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = Double.parseDouble(scanner.nextLine().trim());
                    
                    // Calculate the area of the circle
                    double area = calculateCircleArea(radius);
                    
                    // Display the area of the circle
                    System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
                } 
                // Handle invalid input for the radius
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for the radius.");
                }
            } 
            // Handle invalid input for the yes/no prompt
            else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        
        // Close the scanner to release resources
        scanner.close();
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;  // Area formula: π * radius^2
    }
}
