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

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj == this) {
            return true;
        }
        return (obj instanceof Person p)
            && (p.Firstname.equals(this.Firstname))
            && (p.Lastname.equals(this.Lastname))
                && (p.ID == this.ID);
    }
}
