import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Welcome to Mini Calculator!");
        System.out.println("Choose the operation you want to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        // Get user choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        // Get input numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform operation based on user choice
        switch (choice) {
            case 1:
                System.out.println("Result of addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result of subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result of multiplication: " + (num1 * num2));
                break;
            case 4:
                    System.out.println("Result of division: " + (num1 / num2));
                    break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
        
        scanner.close();
    }
}
