import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {
        Employee emp1=new Employee(1);
        Employee emp2=new Employee(1);

        HashMap<Employee, String> mapj = new HashMap<Employee, String>();
        mapj.put(emp1,"jack");
        mapj.put(emp2,"jack");
        System.out.println("Size="+mapj.size());
        for(Map.Entry<Employee, String> entry:mapj.entrySet()){
            System.out.println("Key:"+entry.getKey()+"\t"+"Value:"+entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("sun",1);
        map.put("sun",2);
        System.out.println("Size="+map.size());
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key:"+entry.getKey()+"\t"+"Value:"+entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~");

        HashMap<Integer,String> tmap1 = new HashMap<Integer,String>();
        tmap1.put(1,"one");
        tmap1.put(1,"one");
        System.out.println("Size="+tmap1.size());
        for(Map.Entry<Integer,String> entry:tmap1.entrySet()){
            System.out.println("Key:"+entry.getKey()+"\t"+"Value:"+entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~");
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        tmap.put("sun",1);
        tmap.put("sun",1);
        System.out.println("Size="+tmap.size());
        for(Map.Entry<String,Integer> entry:tmap.entrySet()){
            System.out.println("Key:"+entry.getKey()+"\t"+"Value:"+entry.getValue());
        }

    }

}
class Employee{
    int id;
    public Employee(int id){
        this.id=id;
    }

}
