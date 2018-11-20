interface A{
    void show();

}
interface B{
    void show();

}
class TestInterface implements A,B {
    public void show() {
        System.out.println("Hi this is print");
    }

}
public class printData
{
    public static void main(String[] args){
        TestInterface obj=new TestInterface();
        obj.show();
    }
}
