package collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {

        /**
         * List: a data structure in java, we can add unlimited data to it (without sorting)
         */

        // define new list
        List<Object> l = new ArrayList<Object>();

        // add elements to the list
        l.add("Fadi");
        l.add("Noor");
        l.add(1);
        l.add(2.2);

        // add an elements in specific position
        l.add(0,"Nada");

        // add another list to list
        List<String> l2 = new ArrayList<>();
        l2.add("e1");
        l2.add("e2");
        for(int i=0;i<l2.size();i++)
            l.add(l2.get(i));


        // search specific item
        boolean b = l.contains(11);

        // delete item from list
        boolean b2 = l.remove("e2");

        //read list elements
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
}
