package sodo4;

import java.util.Date;

public class Teacher extends Person{
    private String department;
    public Teacher(String id, String homeTown, Date dateOfBirth, String department) {
        super(id, homeTown, dateOfBirth);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}


