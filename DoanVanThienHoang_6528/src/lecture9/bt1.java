
package lecture9;
    import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
   private ArrayList<Student> studentList = new ArrayList<>();
   public void enterStudents(int n){
       Scanner scanner = new Scanner (System.in);
       for(int i=0;i<n;i++){
           System.out.println("Nhap thong tin  sinh vien thu "+(i+1));
           System.out.println("ID: ");
           String id = scanner.nextLine();
           System.out.println("Full Name: ");
           String name = scanner.nextLine();
           System.out.println("Major: ");
           String major = scanner.nextLine();
           System.out.println("Gpa: " );
           float gpa = scanner.nextFloat();
           scanner.nextLine();
           Student student = new Student (id,name,null,major,gpa);
           studentList.add(student);
       }
   }
   public void displayAllStudents(){
       if(studentList.isEmpty()){
           System.out.println("Danh sach sinh vien trong.");
           return;
       }
       for(Student student : studentList){
           student.displayStudentInfo();
           System.out.println("---------------");
       }
   }
   public Student findStudentById(String idToFind){
       for(Student student : studentList){
           if(student.getStudentID().equals(idToFind)){
               return student;
           }
       }
       return null;
   }
   public boolean deleteStudentById(String idToDelete){
       Student student = findStudentById(idToDelete);
       if(student != null){
           studentList.remove(student);
           return true;
       }
       return false;
   }
   public void editStudentById(String idToEdit){
       Student student = findStudentById(idToEdit);
       if(student != null){
           System.out.println("Khong tim thay sinh vien co ID: " + idToEdit);
           return;
       }
       Scanner scanner = new Scanner (System.in);
       System.out.println("Nhap ten moi: ");
       student.setStudentID(scanner.nextLine());
       System.out.println("Nhap chuyen nghanh moi: ");
       student.setmajor(scanner.nextLine());
       System.out.println("Nhap Gpa moi: ");
       student.setgpa(scanner.nextFloat());
       System.out.println("Thong tin sinh vien sau khi chinh sua: ");
       student.displayStudentInfo();
   }
}
