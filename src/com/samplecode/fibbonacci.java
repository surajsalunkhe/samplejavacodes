import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args){
        int a=0,b=1,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter till you print fibonnaci series\n");
        int no=in.nextInt();
        System.out.println(""+a+"\n"+b);
        for(int i=2;i<no;i++)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }

    }
}
