
package lecture09;

import java.util.Date;

public class Teacher extends Person {
    private String department;
    public Teacher(String id, String hometown,Date dateOfBirth,String deparment){
        super(id,hometown,dateOfBirth);
        this.department = department;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
            System.out.println("Deparment: " + department);
    }
}
