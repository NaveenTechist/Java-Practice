import java.util.HashMap;

public class Main{
    public static void main(String a[]){
        HashMap<Integer, String> hm = new HashMap<>(); // Unique no duplicates
        
        hm.put(1,"Naveen");
        hm.put(2,"A1");
        hm.put(3,"A2");
        hm.put(4,"A3");
        hm.put(5,"A4");
        
        // System.out.println(hm.get(3));
        
        // System.out.println(hm.keySet()); coming all keySet
        
        for(int key : hm.keySet()){
            System.out.println(key + " : " + hm.get(key));
        }
        
    // put()
    // get()
    // remove()
    // replace()
    // containsKey()
    // containsValue()
    // size()
    // isEmpty()
    // clear()
    // keySet()
    // values()
    // entrySet()
    // putIfAbsent()
    // getOrDefault()
    // forEach()
    }
     
}
