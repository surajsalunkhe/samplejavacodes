import java.util.Scanner;

public class Pallindrom {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String rev="";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
        if(string.equals(reverse)){
            System.out.println("String is pallindrom");
        }else{
            System.out.println("String is not pallindrom");
        }
        for(int i=string.length()-1;i>=0;i--){
            rev=rev+string.charAt(i);
        }
        System.out.println("Rveresed string is="+rev);
    }

}
