import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer no=sc.nextInt();
        int fact=1;
        for(int i=0;i<no;i++){
            fact=fact*no;
        }
        System.out.println("Factorial="+fact);
    }
}
