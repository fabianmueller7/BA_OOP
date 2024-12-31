package overloading;

public class Person {

    String name;
    int age;

    public Person() {
        this.name = "unnamed";
        this.age = -1;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void SitDow() {
        System.out.println("SitDow");
    }

    public void SitDow(String sittingPosition) {
        System.out.println("SitDow : " + sittingPosition);
    }
}
