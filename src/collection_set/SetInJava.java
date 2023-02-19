package collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {

    public static void main(String[] args) {
        /**
         * Set: like List, but here we cant add duplicated data
         * there ist two type of Set:
         1- HashSet: data without sorting
         2- TreeSet: data with sorting
         */

        // define new HashSet
        Set<Integer> s = new HashSet<Integer>();
        
       //Add new elements
        s.add(1);
        s.add(31);
        s.add(5);

        //search element
        boolean b = s.contains(3);

        //delete element
        boolean b2 = s.remove(3);

        //read the data (in Set there is no "get" method, so we have to use foreach loop
        for(Integer i : s){
            System.out.println(i);
        }


    }

}
