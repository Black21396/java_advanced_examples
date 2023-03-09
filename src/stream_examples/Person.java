package stream_examples;

import java.util.List;

public class Person {

    private String name;
    private int age;

    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static List<Person> getPeoples(){
        return List.of(
                new Person("Fadi", 45, Gender.MALE),
                new Person("Mostafa", 24, Gender.MALE),
                new Person("Abdalbaset", 35, Gender.MALE),
                new Person("Nade", 31, Gender.FEMALE),
                new Person("Eman", 11, Gender.FEMALE),
                new Person("Noor", 9, Gender.FEMALE)
        );
    }

    @Override
    public String toString() {
        return "{ name: " +getName()+", age: "+getAge() +", gender: "+getGender()+" }";
    }
}
