
package lecture09;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> people = new ArrayList<>();
    public void addPerson(Person p){
        people.add(p);
    }
    public boolean deletePersonById(String id){
        return people.removeIf(person -> person.id.equals(id));
    }
    public boolean editPersonById(String id){
        for(Person p : people){
            if(p.id.equals(id)){
                return p.editPerson();
            }
        }
        return false;
    }
    public void displayAll(){
        for(Person p : people){
            p.displayInfo();
        }
    }
}
