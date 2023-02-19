package override_equals_and_compare_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
    * public boolean equals (Object o)
      this is a method exist in the class "Object" in java
      when we want to check two objects if they equals, then override
      this method in the class
      Note: in this example I create a class "Person" and override
            the "equals" methode

     * public int compare(Class1 o1, Class1 o2)
       this method exist in the interface "Comparator", so we
       have to implemnts this interface in the class
       The return value for this method:
        1- return 0 when the two object are equal
        2- return a positive result, when the object1 is greater than object2
        3- return a positive result, when the object1 is smaller than object2

     */
    public static void main(String[] args) {

        // here check the equals method

        Person p1 = new Person(20, 3200);
        Person p2 = new Person(20, 2200);

        // compare the object with primative value, the result is false
        System.out.println(p1.equals(3));

        // compare the object with null value, the result is false
        System.out.println(p1.equals(null));

        /*
         compare the object with another, the result is true, because I decide that
         when the two person have same age, then two person is equals
         */
        System.out.println(p1.equals(p2));

        System.out.println("****************************************");

        // here check the compare method

        Person compare = new Person();

        System.out.println(compare.compare(p1,p2));

        // now create the list of Person, then sort it (descending sorting)

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);

        Collections.sort(persons, compare);

        // print the list after sorting
        for(Person p : persons){
            System.out.println(p);
        }
    }
}
