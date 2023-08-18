import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();        
        ArrayList<Integer> l2= new ArrayList<>(4);

        l1.add(3);        
        l1.add(4);
        l1.add(5);
        l1.add(7);

        l2.add(13);        
        l2.add(17);        
        l2.add(16);

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }


        System.out.println(" "); 
        l1.addAll(0, l2);

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }


        //System.out.println(" "); 
        //l1.clear();
        //for(int i=0; i<l1.size(); i++){
        //     System.out.println(l1.get(i));
        // }

        System.out.println(" ");
        System.out.println(l1.contains(12));         
        
        System.out.println(" ");
        System.out.println(l1.indexOf(4));        
        


    }
}
