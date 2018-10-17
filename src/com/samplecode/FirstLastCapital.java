package com.samplecode;

import java.util.Scanner;

public class FirstLastCapital {
    public static void main(String[] args){

        System.out.println("Enter String to Made changes");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String firstLetter=str.substring(0,1).toUpperCase();
        String remaining=str.substring(1).toLowerCase();
        String FinalString=firstLetter+remaining;
        System.out.println("Output:"+FinalString);

         str = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
        System.out.println("Output1:"+str);

       /* int length=str.length();
        char a=str.charAt(0);
        String s=Character.toString(a);
        String finalstring=s+str.toLowerCase();*/

        /*char[] stringArray = str.toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        System.out.println("str"+stringArray.toString());*/

    }
}
