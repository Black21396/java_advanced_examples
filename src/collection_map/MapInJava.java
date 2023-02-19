package collection_map;

import java.util.Map;
import java.util.TreeMap;

public class MapInJava {

    /**
     * Map: data structured in java, store data as (key,value)
     * ever key can have just one value
     * there is two type from map:
     1- HashMap: without sorting
     2- TreeMap: with sorting (according key)
     */
    public static void main(String[] args) {
        // define new Hashmap
        Map<Integer, String> m = new TreeMap<>();

        // add some values
        m.put(97082, "Würzburg");
        m.put(84394, "Berlin");
        m.put(34433, "Hamburg");

        // iterate the map
        for (int key : m.keySet()){
            System.out.println(m.get(key));
        }

        // remove from Map (just by key)
        m.remove(84394);

        // if we add the same key with different value, the old value converted to new value
        m.put(97082, "Syrien");

        // iterate the map again
        for (int key : m.keySet()){
            System.out.println(m.get(key));
        }
    }
}
