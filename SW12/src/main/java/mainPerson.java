import java.util.ArrayList;

public class mainPerson {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person(2,"Müller","Hans"));
        persons.add(new Person(6, "Meredit", "Smith"));
        persons.add(new Person(1,"Forster","Peter"));
        persons.add(new Person(5, "Brown", "Michael"));
        persons.add(new Person(3, "Doe", "Jane"));
        persons.add(new Person(4, "Johnson", "Emily"));
        persons.add(new Person(6, "Johnson", "Smith"));

        persons.sort((p1, p2) -> {
            return p1.getID()>=p2.getID()?1:-1;
        });

        /*
        persons.sort((p1, p2) -> {
            return p1.getLastname().compareTo(p2.getLastname());
        }); */

        persons.forEach(System.out::println);
    }
}
