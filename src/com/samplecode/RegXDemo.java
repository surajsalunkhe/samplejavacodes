package com.samplecode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegXDemo {
    public static void main(String args[]){
        String s = "sub53od73th";
        //int count = 0;
        Pattern p=Pattern.compile("[0-9]");
        Matcher m=p.matcher(s);
        while (m.find()){
            //count++;
            System.out.println(m.start());
        }

        s = s.replaceAll("[0-9]", "");
        System.out.println(s);
        //System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
    }
}
