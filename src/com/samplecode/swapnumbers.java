package com.samplecode;

import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no 1\n");
        int no1=in.nextInt();
        System.out.println("Enter no 2\n");
        int no2=in.nextInt();
        no2=no1+no2;
        no1=no2-no1;
        no2=no2-no1;
        System.out.println("swapped first no:"+no1+"\n second no:"+no2);
    }
}
//1 2
//3=1+2
//2=3-1
//1=3-2