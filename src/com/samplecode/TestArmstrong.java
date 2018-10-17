package com.samplecode;

import java.util.Scanner;

public class TestArmstrong {
    public static void main(String [] args){
        int no,temp,r,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println();
        no=in.nextInt();
        temp=no;
        while (no>0){
            r=no%10;
            no=no/10;
            sum=sum+(r*r*r);
        }
        if(temp==sum)
        {
            System.out.println(temp+ "is an Armstrong number");
        }
        else
        {
            System.out.println(temp+ "is not an Armstrong number");
        }
    }

}
