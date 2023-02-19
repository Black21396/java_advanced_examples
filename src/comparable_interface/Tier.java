package comparable_interface;

public class Tier implements Comparable<Tier>{

    public String name;
    public int age;

    public Tier(String name, int age) {
        this.name = name;
        this.age = age;
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

    // implements compare method (hier we compare by animals name)
    @Override
    public int compareTo(Tier o) {
        int res = this.getName().compareTo(o.getName());
        return res;
    }

    @Override
    public String toString() {
        return "("+this.getName()+", "+this.getAge()+")";
    }
}
