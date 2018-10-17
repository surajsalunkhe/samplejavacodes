package com.samplecode;

import java.util.*;

class TreeMapDemo {
    public static void main(String args[]) {

        Map<String, String> treemap =
                new TreeMap<String, String>(Collections.reverseOrder());

        // Put elements to the map
        treemap.put("Key1", "Jack");
        treemap.put("Key2", "Rick");
        treemap.put("Key3", "Kate");
        treemap.put("Key4", "Tom");
        treemap.put("Key5", "Steve");

        //1.8v

        treemap.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        for(Map.Entry<String,String>entry:treemap.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Iterator<Map.Entry<String,String>>entryIterator=treemap.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,String>entry=entryIterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Set set = treemap.entrySet();
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
