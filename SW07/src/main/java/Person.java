public class Person {

    private long ID;
    private String Lastname;
    private String Firstname;

    Person(long ID, String Lastname, String Firstname) {
        this.setID(ID);
        this.setLastname(Lastname);
        this.setFirstname(Firstname);
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Lastname: " + Lastname + ", Firstname: " + Firstname;
    }
}
