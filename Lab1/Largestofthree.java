import java.util.Scanner;

// Create class
public class Largestofthree {
    // Main function
    public static void main(String[] args) {
        // Create scanner object
        Scanner scan = new Scanner(System.in);
        
        // user to enter the first number
        System.out.println("Enter the First Number:");
        int num1 = scan.nextInt();
        
        // user to enter the second number
        System.out.println("Enter the Second Number:");
        int num2 = scan.nextInt();
        
        // user to enter the third number
        System.out.println("Enter the Third Number:");
        int num3 = scan.nextInt();
        
        // Determine the largest number and print it
        if(num1 >= num2 && num1 >= num3) {
            System.out.println("The Largest Number is: " + num1);
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println("The Largest Number is: " + num2);
        } else {
            System.out.println("The Largest Number is: " + num3);
        }
    }
}
