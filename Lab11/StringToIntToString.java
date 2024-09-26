public class StringToIntToString {
    public static void main(String[] args) {
       
        String initialString = "12345";
        
       
        int number = Integer.parseInt(initialString);
        System.out.println("Converted to int: " + number);
        
        
        number += 10;
        System.out.println("After adding 10: " + number);
        
        
        String finalString = Integer.toString(number);
        System.out.println("Converted back to String: " + finalString);
    }
}
