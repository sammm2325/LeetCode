
package Beginner;
import java.util.regex.*;

public class isValid {
    public static boolean isValid(String s) {
        Pattern pattern = Pattern.compile("\\(\\)|\\[\\]|\\{\\}");
        Matcher matcher = pattern.matcher(s);
        String result = matcher.replaceAll("");
        return result.isEmpty();
    }
}
