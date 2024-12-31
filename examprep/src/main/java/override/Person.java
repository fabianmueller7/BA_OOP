package override;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if(!(object instanceof Person)) {
            return false;
        }
        return  (((Person) object).age == this.age) && (((Person) object).name == this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
