import java.util.HashSet; // NO INDEX ACCESS

public class Main{
    public static void main(String a[]){
        HashSet<Integer> set = new HashSet<>(); // Unique no duplicates
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        
        System.out.println(set.size());
        
        // System.out.println(set.contains(4));  true
        
        // set.remove(4);
        
        
        //  System.out.println(set.size());
        
        // for(int i : set) System.out.println(i);
        
        // se.clear();
         
       
    }
     
}
