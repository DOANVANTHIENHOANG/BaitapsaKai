
package bt1;

import java.util.Date;

public class Student {
    
    private String studentID;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;
    public Student(){}
    public Student(String studentID,String fullName,Date dateOfBirth,String major,float gpa){
        this.studentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID=studentID;
    }
    public String getfullName(){
        return fullName;
    }
    public void setfullName(String fullName){
        this.fullName = fullName;
    }
    public Date getdateOfBirth(){
        return dateOfBirth; 
    }
    public void setdateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getmajor () {
        return major;
    }
    public void setmajor(String major){
        this.major = major;
    }
    public float getgpa(){
        return gpa;
    }
    public void setgpa(float gpa){
        this.gpa = gpa;
    }
    public void enterStudentInfo(){
        System.out.println("Nhap thong tin sinh vien: ");
    }
    public void displayStudentInfo(){
        System.out.println("Studen ID: " + studentID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth" + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("gpa: " + gpa);
    }
    @Override
    public String toString(){
        return "Student(ID=" + studentID + ",Name= " + fullName + ",Date of Birth= "+ dateOfBirth + ",Major= "+ major + ",gpa= "+ gpa + "}";
    }
}

