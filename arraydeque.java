import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);        
        ad1.add(6);
        ad1.add(57);
        ad1.addFirst(4);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
