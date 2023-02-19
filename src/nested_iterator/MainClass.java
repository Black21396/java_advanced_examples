package nested_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {

    /**
     * Iterator: this is like a pointer, we use it to access to all
                 element in a data stucture (list, map, hash, etc..)
     */
    public static void main(String[] args) {
        // create a list of lists (nested list)
        List<List> nestedList = new ArrayList<>();

        // create normal list and add some value
        List<String> list1 = new ArrayList<>();
        list1.add("fadi");
        list1.add("noor");

        // create normal list and add some value
        List<String> list2 = new ArrayList<>();
        list2.add("mama");
        list2.add("baba");

        // add some list to nested list
        nestedList.add(list1);
        nestedList.add(list2);

        // create an iterator of nested list
        Iterator<List> outerIterator = nestedList.iterator();

        // iterator loop for nested list
        while (outerIterator.hasNext()){
            // create iterator for each elemnt in nested list (because every element is a list)
            Iterator<String> innerIterator = outerIterator.next().iterator();
            // iterator loop for each list in nested list, and print value
            while (innerIterator.hasNext()){
                System.out.print(innerIterator.next()+", ");
            }
            System.out.println("\b\b");
        }

    }
}
