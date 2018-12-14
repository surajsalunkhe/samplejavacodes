import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String [] args){
        String [] s1={"sun","gun","tun"};
        List<String> l1=new ArrayList<String>(Arrays.asList(s1));
        for(String sl:l1){
            System.out.println(""+sl);
        }

        System.out.println("********");
        String[] s2=new String[l1.size()];
        s2=l1.toArray(s2);
        for(String str:s2){
            System.out.println(""+str);
        }

    }

}
