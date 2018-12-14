import java.util.NoSuchElementException;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class smallElementArray {
    public static void main(String ...a){
        int[] arr={4,2,1,6,33};
        int length=arr.length;
        int min=arr[0];
        for(int i=0;i<length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Small element is :"+min);

    }
}
