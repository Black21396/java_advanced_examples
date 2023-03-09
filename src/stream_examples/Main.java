package stream_examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stream: we use it with a collection of data to manpulate each item in collection
 * There is alot of function we can use it with stream(map, filter, limit, collect, etc..)
 */
public class Main {

    public static void main(String[] args) {
        List<Person> persons = Person.getPeoples();

        //Filter
        // get All female persons
        List<Person> females = persons
                .stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);
        System.out.println("********************************************");

        // Sort
        // sort peoples according age and name descending
        List<Person> sort = persons
                .stream()
                .sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName))
                .collect(Collectors.toList());
        sort.forEach(System.out::println);
        System.out.println("********************************************");

        // allMatch:  (return true if all elements achieve the condition
        // check if all persons age rather than 10
        System.out.println(persons
                .stream()
                .allMatch(person -> person.getAge()>10));
        System.out.println("********************************************");

        // anyMatch: (return true if any elements achieve the condition
        // check if any person age rather than 10
        System.out.println(persons
                .stream()
                .anyMatch(person -> person.getAge()>10));
        System.out.println("********************************************");

        // noneMatch: (return true if all elements don't achieve the condition
        // check if all persons age lower than 10
        System.out.println(persons
                .stream()
                .noneMatch(person -> person.getAge()>10));
        System.out.println("********************************************");

        // max: return the max element according the condition
        // return the oldest person from persons
        System.out.println(persons
                .stream()
                .max(Comparator.comparing(Person::getAge)).get());
        System.out.println("********************************************");

        //min: return the minimum element according the condition
        // returns the youngest person of Persons
        System.out.println(persons
                .stream()
                .min(Comparator.comparing(Person::getAge)).get());
        System.out.println("********************************************");

        // Group: return the collection as a group (hash) according the condition
        // return the person als two groups (male and female)
        Map<Gender, List<Person>> personGroup = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));
        //print the result
        personGroup.forEach((g,p)->{
            System.out.println(g);
            p.forEach(System.out::println);

        });


    }

}
