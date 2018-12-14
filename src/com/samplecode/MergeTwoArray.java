public class MergeTwoArray {
    public static void main(String[]args){

        int arr1[]={2,3,6,8};
        int arr2[]={3,5,1,5,7};
        int size=arr1.length+arr2.length;
        int arr3[]=new int[size];
        int count=0;

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            count++;
        }
        for (int j=0;j<arr2.length;j++){
            arr3[count++]=arr2[j];
        }
        for(int k=0;k<size;k++){
            System.out.println(arr3[k]);
        }

    }
}
