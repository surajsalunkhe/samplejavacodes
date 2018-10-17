package com.samplecode;

import java.util.HashSet;
import java.util.Set;

public class RepeatingElementArray {
    static void printRepeating(int arr[], int size)
    {

    }

    public static void main(String[] args)
    {

        int arr[] = {4, 2, 4, 5, 2, 5, 1};
        int arr_size = arr.length;
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < arr_size; i++)
        {
            for (j = i + 1; j < arr_size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }

        Set<Integer> set=new HashSet<>();
        for (int m=0;m<arr.length;m++){
            if(set.add(arr[m])==false){
                System.out.println("Duplicate element found : " + arr[m]);
            }
        }
    }
}
