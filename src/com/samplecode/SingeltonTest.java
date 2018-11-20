class Singelton extends CloneSingelton {
    private static Singelton instance;
    private Singelton(){
    }
    public static synchronized Singelton getInstance()
    {
        if(instance==null){
            synchronized (Singelton.class) {
                instance = new Singelton();
            }
        }
        return instance;
    }
    public void display(){
        System.out.println("I am display of Singelton");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}

class CloneSingelton implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class SingeltonTest{
    public static void main(String [] args) throws CloneNotSupportedException {
        //Singleton object = new Singleton();
        Singelton obj=Singelton.getInstance();
        Singelton obj1= (Singelton) obj.clone();
        obj.display();
        System.out.println("Creating object of singelton class"+"first obj="+obj.hashCode()+"\tsecond obj"+obj1.hashCode());
    }

}
