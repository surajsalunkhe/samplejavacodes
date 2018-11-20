import java.util.Scanner;

public class armstrongnumber {
    public static void main(String [] args){
        int sum=0,r,temp,number;
        System.out.println("Enter the no to check ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        temp=number;
        while (number>0){
            r=number%10;
            number=number/10;
            sum=sum+r*r*r;
        }
        if (temp==sum){
            System.out.println(temp+":is amnstrong no");
        }else{
            System.out.println(temp+":is not an Armstrong number");
        }

    }
}
