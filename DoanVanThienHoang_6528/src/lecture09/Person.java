
package lecture09;

import java.util.Date;

public class Person {
    protected String id;
    protected String hometown;
    protected Date dateOfBirth;
    public Person (String id,String hometown,Date dateOfBirth){
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.hometown = hometown;
    }
    public void displayInfo(){
        System.out.println("ID: " + id + ",Hometown: " + "DOB: "+dateOfBirth);
    }
    public void addPerson(){
        
    }
    public boolean editPerson(){
        return true;
    }
}
