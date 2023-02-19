package override_equals_and_compare_method;

import java.util.Comparator;

public class Person implements Comparator<Person> {

    private int age;
    private int salary;

    public Person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // compare between two Person( here we compare according the salary)
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSalary()-o2.getSalary();
    }

    // override the "equals" method
    @Override
    public boolean equals(Object p){
        // if the two object have the same reference
        if(this == p){
            return true;
        }

        // if the object isn't Person
        if(! (p instanceof Person)){
            return false;
        }

        // if the object is null
        if(p == null){
            return false;
        }

        // compare the age for the two Person
        return this.getAge() == ((Person) p).getAge();
    }

    @Override
    public String toString(){

        return "person age: "+ this.getAge() + " ,person salary: "+ this.getSalary();
    }
}
