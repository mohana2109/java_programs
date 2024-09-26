public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Using StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse();
        String reversedString = sb.toString();
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
