interface Poet {
    default void write() {
        System.out.println("Poet's default method");
    } }
    interface Writer {
    default void write() {
        System.out.println("Writer's default method");
    } }
    public class DiamondProblem implements Poet, Writer {
        @Override
        public void write(){
            System.out.println("Writing stories now days");
        }
        public static void main(String args[]) {
            DiamondProblem john = new DiamondProblem();
            john.write(); // which write method to call, from Poet // or, from Writer } }
        }
}