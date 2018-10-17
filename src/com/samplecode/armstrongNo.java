import java.util.Scanner;

public class armstrongNo {
    public static boolean isArmstrongNumber(int number) {
        String strNumber = String.valueOf(number);
        int value = 0;

        for (int i = 0; i<strNumber.length(); i++) {
            value += Math.pow(Integer.parseInt(strNumber.substring(i, i+1)), strNumber.length());
        }

        return value == number;
    }
    public static void main(String [] args){
        int sum=0,r,temp,number;
        System.out.println("Enter the no to check ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        boolean status=isArmstrongNumber(number);
        if(status==true){
            System.out.println(number+":is amstrong no");
        }else{
            System.out.println(number+":Not amstrong no");
        }
    }


}
