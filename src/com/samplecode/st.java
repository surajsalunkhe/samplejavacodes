import java.util.Scanner;
public class st {
        public static void main(String []args){
            String str="Hi this is me";
            int len=str.length();
            char[] ct=new char[len];
            char[] ch=str.toCharArray();
            for(int i=0;i<=len-1;i++){
                ct[i]=ch[(ch.length-1)-i];
                //System.out.println(""+ct[i]);
                }
            String output1 = new String(ct);
            System.out.println("output1 : " + output1);
        }
}


