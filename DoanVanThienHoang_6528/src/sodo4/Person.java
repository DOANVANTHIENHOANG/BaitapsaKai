package sodo4;
  import java.util.Date;
public class Person {
    protected String id;
    protected String homeTown;
    protected Date dateOfBirth;

    public Person(String id, String homeTown, Date dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Hometown: " + homeTown);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public void addPerson() {
        System.out.println("Adding person...");
    }

    public boolean editPerson() {
        System.out.println("Editing person...");
        return true;
    }
}


