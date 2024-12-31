package generics;

public class Personlist {

    Personlist() {
        StoreGeneric<Person> tempPerson = new StoreGeneric<>(new Person());
    }

}
