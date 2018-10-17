import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        System.out.println("Tree Set Example!\n");
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(12);
        tree.add(0);
        tree.add(0);
        tree.add(null);
        System.out.println(tree);

    }
}