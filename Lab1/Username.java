import java.util.Scanner;

// Create the class
public class Username {
    // Main function
    public static void main(String[] args) {
        // Create scanner 
        Scanner scan = new Scanner(System.in);
        
        //user to enter the username
        System.out.print("Enter the username: ");
        String s = scan.nextLine();
        
        // Print welcome message
        System.out.println("Welcome " + s);
    }
}
       


