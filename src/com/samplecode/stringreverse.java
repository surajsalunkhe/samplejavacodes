package com.samplecode;

import java.util.Scanner;

public class stringreverse {

    public static void main(String[] args) {

	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String str=in.nextLine();
        String reverse="";
        int length=str.length();
        System.out.println("length"+length);
        for(int i=length-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversed String="+reverse);
        if(str.equals(reverse)){
            System.out.println("pallindrom");
        }else {
            System.out.println("not a pallindrom");
        }

        System.out.println("Enter String to reverse");
        String ws=in.nextLine();
        char[] try1=ws.toCharArray();
        for(int i=try1.length-1;i>=0;i--){
            System.out.print(try1[i]);
        }

        System.out.println("Enter String to reverse");
        String js=in.nextLine();
        int len=js.length();
        StringBuffer stringBuffer= new StringBuffer();
        for(int i=len-1;i>=0;i--){
          stringBuffer=stringBuffer.append(js.charAt(i));
        }
        System.out.println("Reverse string is="+stringBuffer);


    }
}
