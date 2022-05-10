package model;

public class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal o) {

        return getName().compareTo(o.getName());

    }

    @Override
    public String toString() {
        return name;
    }
}
