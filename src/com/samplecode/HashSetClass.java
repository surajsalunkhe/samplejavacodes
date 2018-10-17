package com.samplecode;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String args[]) {
            // HashSetClass declaration
            HashSet<String> hset= new HashSet<String>();
            // Adding elements to the HashSetClass
            hset.add("Apple");
            hset.add("Mango");
            hset.add("Grapes");
            hset.add("Orange");
            hset.add("Fig");
            //Addition of duplicate elements
            hset.add("Apple");
            hset.add("Mango");
            //Addition of null values
            hset.add(null);
            hset.add(null);

            for (String s:hset) {
                    System.out.println(s);
            }

            Iterator<String> it = hset.iterator();
            while(it.hasNext()){
                    System.out.println(it.next());
            }
            //hset.remove(null);
            //Displaying HashSetClass elements
            System.out.println(hset);
        }
}
