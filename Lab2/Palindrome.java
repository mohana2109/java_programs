import java.util.Scanner;

class Palindrome{  
 public static void main(String args[]){  
     Scanner scan = new Scanner (System.in);
     int r,sum=0,temp;    
    // Prompt the user to enter a number
     System.out.print("Enter a number to check if it is a palindrome: ");
     int  n = scan.nextInt(); 
  
     temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }  
// Check if the number is a palindrome
   if(temp==sum)  {  
        System.out.println("The number " + temp + " is a palindrome.");
        } else {
            System.out.println("The number " + temp + " is not a palindrome.");
        }
        
    }    
} 

