public class VowelConsonantCounter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the string to lowercase to simplify comparison
        inputString = inputString.toLowerCase();
        
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
