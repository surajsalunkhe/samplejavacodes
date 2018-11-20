class sampleTV implements Astar{
    public void show(){
        System.out.println("Show the TV");
    };
}
class sampleshow extends sampleTV{
    public void testsampleshow(){
      System.out.println("Hiii");
    };
}
public class InterfaceRefCheck {
    public static void main(String[] args)
    {
        Astar a= new sampleshow();
        a.show();
        //a.testsampleshow();
        a.hashCode();
    }
}
