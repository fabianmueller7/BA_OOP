package compareable;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo( Person o) {
        return Long.compare(this.age, o.age);
    }

    public int compare(Person p1, Person p2) {
        int compare = p1.getName().compareTo(p2.getName());
        if (compare == 0) {
            compare = p1.getAge() - p2.getAge();
        }
        return compare;
    }
}
