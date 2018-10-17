package com.samplecode;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add(null);
        lhset.add("N");
        lhset.add("O");
        lhset.add("Z");
        lhset.add(null);
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(null);
        lhset2.add(0);
        lhset2.add(7);
        lhset2.add(89);
        lhset2.add(null);
        System.out.println(lhset2);
    }

}
