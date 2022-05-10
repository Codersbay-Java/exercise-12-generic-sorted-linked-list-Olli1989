package model;

public class Person implements Comparable<Person>{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return Integer.toString(age);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(getAge(),o.getAge());
    }
}
