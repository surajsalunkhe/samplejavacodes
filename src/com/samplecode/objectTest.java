package com.samplecode;

public class objectTest {
    static int count=0;
    {
        count++;
    }
    objectTest(){};
    objectTest(int i){};
    objectTest(double d){};
    public static void main(String...arg){
            //objectTest t1=new objectTest();
            //objectTest t2=new objectTest(10);
            //objectTest t3=new objectTest(10.6);
            System.out.println("The object created:"+count);
    }
}
