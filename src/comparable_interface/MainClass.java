package comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainClass {

    /**
     * in java compare operations just for primitive Data structure (int, float, ..)
     * when we want compare between two object, we have to implements "Comparable" interface in the class
     * the function "compareTo()" we define our compare method, and return int (1 greater, -1 less, 0 equal)
     */
    public static void main(String[] args) {

        Tier t1 = new Tier("Tiger", 2);
        Tier t2 = new Tier("Cat", 5);
        Tier t3 = new Tier("Dog", 4);

        List<Tier> l = new ArrayList<Tier>();
        l.add(t1);
        l.add(t2);
        l.add(t3);

        // user "sort" method to sort our list (according "compareTo" method)
        Collections.sort(l);

        // print the result after sorting operation
        for(Tier t : l){
            System.out.println(t);
        }
    }
}
