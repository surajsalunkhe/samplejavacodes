import java.util.Scanner;

public class numberReverse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String to reverse");
        int orignal=in.nextInt();
        int reverse=0;
        while (orignal>0)
        {
            reverse=reverse*10;
            reverse=reverse+(orignal%10);
            orignal=orignal/10;
        }
        System.out.println("reverse="+reverse);
    }

}
//1st loop
//123
//0=0*10
//3=0+3
//12=123/10

