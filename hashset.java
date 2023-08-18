import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1= new HashSet<>(6, 0.5f);
        h1.add(6);        
        h1.add(9);
        h1.add(5);
        h1.add(3);

        System.out.println(h1);
    }
}
