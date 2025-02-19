package sodo4;
    import java.util.ArrayList;
public class PersonList {
    private ArrayList<Person> people;

    public PersonList() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
        System.out.println("Person added successfully.");
    }

    public boolean deletePersonById(String id) {
        return people.removeIf(p -> p.id.equals(id));
    }

    public void editPersonById(String id) {
        for (Person p : people) {
            if (p.id.equals(id)) {
                p.editPerson();
                System.out.println("Person with ID " + id + " has been edited.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void displayAll() {
        for (Person p : people) {
            p.displayInfo();
            System.out.println("----------------------");
        }
    }
}


