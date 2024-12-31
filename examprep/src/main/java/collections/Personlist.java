package collections;

import java.util.ArrayList;
import java.util.List;

public class Personlist {

    final List<Person> persons = new ArrayList<>();

    Personlist() {}

    Personlist(List<Person> persons) {
        this.persons.addAll(persons);
    }

    public void add(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void removeByIndex(int i) {
        persons.remove(i);
    }

    public int size() {
        return persons.size();
    }

    public int getIndexOf(Person person) {
        return persons.indexOf(person);
    }

    public int getIndexOf(String name) {
        for(int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void setByIndex(int i, Person person) {
        persons.set(i, person);
    }

    public void clearList() {
        persons.clear();
    }

    public List<Person> getPersons() {
        return persons;
    }
}
