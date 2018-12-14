import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumberInString {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i <str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                System.out.println(str.charAt(i)+"");
            }
        }

        Pattern pattern=Pattern.compile("[0-9]*");
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
    //        String str =matcher.group();
        }
    }
}
