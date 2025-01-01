package exceptionhandling;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setGender(boolean gender) {
        if(gender) {
            throw new SecurityException("Gender cannot be 'Male'");
        }
        this.gender = gender ? "Male" : "Female";
    }

    public void setAge(int age) {

        try {
            if (age < 0 || age > 100) {
                throw new IllegalArgumentException("Age must be between 0 and 100");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            age = -1;
        }
        finally {
            this.age = age;
        }
    }
}
