package collection.sec05;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        if(age<other.age) return -1;
        else if(age>other.age) return 1;
        else return 0;
    }
}
