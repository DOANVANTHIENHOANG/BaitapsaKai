
package lecture09;
public class Student {
    private String major;
    private Person person;
    public Student(Person person,String major){
        this.person = person;
        this.major = major;
    }
    public void displayInfo(){
        person.displayInfo();
        System.out.println("Major: " + major);
    }
    public void addPerson(){
        person.addPerson();
    }
    public boolean editPerson(){
        return person.editPerson();
    }
}
