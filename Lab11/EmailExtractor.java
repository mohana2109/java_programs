import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Hey, there how are you? this is my email id great123@gmail.com in java";

        
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

 
        Pattern pattern = Pattern.compile(emailPattern);

   
        Matcher matcher = pattern.matcher(text);

        
        if (matcher.find()) {
            System.out.println("Email ID found: " + matcher.group());
        } else {
            System.out.println("No email ID found.");
        }
    }
}
