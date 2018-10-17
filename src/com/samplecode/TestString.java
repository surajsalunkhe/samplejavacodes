public class TestString {
    public static void main(String args[]) {
        String s1 = "suraj";
        String s2 = "suraj";
        String sn1 = new String("suraj");
        String sn2 = new String("suraj");
        StringBuffer sb1 = new StringBuffer("suraj");
        StringBuffer sb2 = new StringBuffer("suraj");
        StringBuilder sl1 = new StringBuilder("suraj");
        StringBuilder sl2 = new StringBuilder("suraj");
        //To test using .equal method
        boolean b1,b2,b3,b4,b5,b6,b7,b8;
        b1=(s1 == s2);
        b2=s1.equals(s2);
        b3=(sn1==sn2);
        b4=(sn1.equals(sn2));
        b5=(s1==sn1);
        b6=(s1.equals(sn1));
        //b7=(s1==sb1);
        b8=(s1.equals(sb1));
    }
}
