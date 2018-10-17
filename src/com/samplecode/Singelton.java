package com.samplecode;

public class Singelton {
    private static Singelton obj;
    static {
        obj=new Singelton();
    }
    private Singelton(){
    }
    public static Singelton myinstance(){
        return obj;
    }
    public void testme(){
        System.out.println("In singleton"+obj);
    }
    public static void main(String[] args){
        Singelton obj=myinstance();
        obj.testme();
    }
}
