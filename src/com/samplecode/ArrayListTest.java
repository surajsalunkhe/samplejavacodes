package com.samplecode;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String [] args){

        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for (int i=0;i<arrayList.size();i++){
            arrayList.remove(i);
        }
        System.out.println(arrayList);

        String str="abc";
        str.replace("abc","xyz");
        str=str.replace("abc","xyz");
        System.out.println(str);

    }
}
