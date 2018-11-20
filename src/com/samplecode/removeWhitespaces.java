public class removeWhitespaces {
    public static void main(String[] args){
        String str="Hi this is test match";
        String strwithoutspace=str.replaceAll("\\s","");
        System.out.println(""+strwithoutspace);

        StringBuffer sb=new StringBuffer();
        char [] strArray=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if((strArray[i]!=' ')&& (strArray[i]!='\t') ){
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb);

    }
}
