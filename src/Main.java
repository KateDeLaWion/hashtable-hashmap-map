import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map is the interface from which the class HashMap implements to form object
        // Map/HashMap/HashTable  work almost the same.
        // They are like an array.
        // Key: Value are stored in an array
        // Key: Value are not necessarily ordered in the order that you put in
        // Key should be unique other it will be overwritten.
        // Value can be duplicate



          Map<String, String>fruits = new HashMap<>();
        // or
//        HashMap<String, String>fruits = new HashMap<>();
        // or
//        Hashtable<String, String> fruits = new Hashtable<>();

        fruits.put("red", "apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");
//        fruits.put("green", "pear"); // this will overwrite the green apple
        fruits.put("blue", "berries");

        // First way to print the Map/HashMap/HashTable
        System.out.println("1st way to print------------------:");
        System.out.println("Initial Table: " + fruits);

        // Second way to print the Map/HashMap/HashTable
        System.out.println("2nd way to print------------------");
        for(Map.Entry pairEntry: fruits.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

        System.out.println("some methods------------------");
        System.out.println("get value by key : " + fruits.get("red") );
        System.out.println("get value by non-existent key : " + fruits.get("purple") );

        System.out.println( "containsKey : " + fruits.containsKey("red"));

        System.out.println( "containsValue : " + fruits.containsValue("apple"));
//        System.out.println(fruits.contains("apple")); // same as containsValue in HashTable, not used in Map or HashMap

        System.out.println("size : " + fruits.size());


        fruits.remove("blue");
        System.out.println("3------------------ after remove ");
        for(Map.Entry pairEntry: fruits.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

        fruits.clear(); // clear the entire hashmap or hashtable
        for(Map.Entry pairEntry: fruits.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
        System.out.println("clear() is just used");

    }
}

