import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        
        // Insert elements
        map.put(1, "xtyry drd t dtuhguy tyt 8y ");
        map.put(2, "gk uyro6rtyogyut biu");
        map.put(3, "hfvy8yo f7yofuhgy7r");
        
        // Access elements
        System.out.println("Value for key 2: " +map.get(2));
        
        // Remove element
        map.remove(2);
        System.out.println(map.get(2));

        
        // Check if a key exists
        if (map.containsKey(4)) {
            System.out.println("Key 3 exists with value: " + map.get(4));
        }
        else{
            System.out.println("no key");
        }
    }
}
