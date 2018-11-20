import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxTry {
    public static void main(String[] args) {
        int count = 0;
        String st = "abacbcabb";
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher(st);
        while (m.find()) {
            System.out.print("Start index: " + m.start());
            System.out.print(" End index: " + m.end() + " ");
            System.out.println(m.group());
            count++;
        }
        System.out.println("" + count);
    }
}
