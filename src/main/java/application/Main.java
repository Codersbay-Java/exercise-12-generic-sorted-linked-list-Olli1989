package application;

import list.SortedLinkedList;
import model.Animal;
import model.Gender;
import model.Person;

public class Main {
    public static void main(String[] args) {

        SortedLinkedList<Animal> animalList  = new SortedLinkedList<>();
        SortedLinkedList<Gender> genderList  = new SortedLinkedList<>();
        SortedLinkedList<Person> personList  = new SortedLinkedList<>();

        Animal animal1 = new Animal("Dog");
        Animal animal2 = new Animal("Ant");
        Animal animal3 = new Animal("Sheep");
        Animal animal4 = new Animal("Cat");

        animalList.insert(animal1);
        animalList.insert(animal2);
        animalList.insert(animal3);
        animalList.insert(animal4);

        animalList.delete(3);
        System.out.println(animalList);

        Gender gender1 = new Gender(true);
        Gender gender2 = new Gender(true);
        Gender gender3 = new Gender(false);
        Gender gender4 = new Gender(true);

        genderList.insert(gender1);
        genderList.insert(gender2);
        genderList.insert(gender3);
        genderList.insert(gender4);

        genderList.delete(2);
        System.out.println(genderList);

        Person person1 = new Person(23);
        Person person2 = new Person(18);
        Person person3 = new Person(20);

        personList.insert(person1);
        personList.insert(person2);
        personList.insert(person3);

        personList.delete(2);
        System.out.println(personList);











    }
}

