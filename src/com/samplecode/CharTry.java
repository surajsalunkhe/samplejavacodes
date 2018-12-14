public class CharTry {
    public static void main(String [] args){
        String str="I am a good boy";
        String str1=str.replaceAll("\\s","");
        char[] chars=str1.toCharArray();

        Character[] characters=new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characters[i]=chars[i];
            System.out.println(chars[i]);
        }
        String str2=String.valueOf(chars);
        System.out.println(str2);

        String str3=new String(chars);
        System.out.println(str3);

        char[] myString = new char[] {'T', 'H', 'I', 'S', ' ',  'I', 'S', ' ', 'T', 'E', 'S', 'T'};

        String output1 = new String(myString);
        System.out.println("output1 : " + output1);

        String output2 = String.valueOf(myString);
        System.out.println("\noutput2 : " + output2);
    }
}
