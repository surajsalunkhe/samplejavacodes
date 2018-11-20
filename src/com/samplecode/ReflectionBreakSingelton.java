import java.lang.reflect.Constructor;

public class ReflectionBreakSingelton {
    public static void main(String[] args){
        Singelton singelton1= Singelton.getInstance();
        Singelton singelton2=null;
        try {
            Constructor[] constructors=Singelton.class.getDeclaredConstructors();
            for (Constructor constructor:constructors){
                constructor.setAccessible(true);
                singelton2=(Singelton)constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- "
                + singelton1.hashCode());
        System.out.println("instance2.hashCode():- "
                + singelton2.hashCode());
    }
}
