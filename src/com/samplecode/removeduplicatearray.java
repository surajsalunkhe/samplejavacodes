import java.util.Arrays;
import java.util.Scanner;

public class removeduplicatearray {

    public static int removeDuplicateElements(int arr[],int n){
        int []temp= new int[arr.length];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];

        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;

    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created ::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");
        for(int i=0; i<size; i++){
            myArray[i] = sc.nextInt();
        }
       System.out.println("The array created is :: "+ Arrays.toString(myArray));
       Arrays.sort(myArray);
        System.out.println("The sorted array is :: "+ Arrays.toString(myArray));
        int length=myArray.length;
        length = removeDuplicateElements(myArray, length);

        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(myArray[i]+" ");
    }
}
