
package lecture09;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        while (true){
            System.out.println("\n--- Menu ---");
            System.out.println("1. Them Person");
            System.out.println("2. Them Student");
            System.out.println("3. Them Teacher");
            System.out.println("4. Hien thi tat ca");
            System.out.println("5. Thoat");
            System.out.println("Chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Nhap ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Nhap que quan: ");
                    String homeTown = scanner.nextLine();
                    System.out.println("Nhap ngay thang sinh: ");
                    String date = scanner.nextLine();
                    Date dateOfBirth = new Date();
                    Person p = new Person (id,homeTown,dateOfBirth);
                    personList.addPerson(p);
                    System.out.println("Da them Person.");
                    break;
                case 2:
                     System.out.println("Nhap ID: ");
                    id = scanner.nextLine();
                    System.out.println("Nhap que quan: ");
                   homeTown = scanner.nextLine();
                    System.out.println("Nhap ngay thang sinh: ");
                  date = scanner.nextLine();
                   dateOfBirth = new Date();
                    System.out.println("Nhap nghanh hoc: ");
                    String major = scanner.nextLine();
                     Person studentPerson = new Person(id ,homeTown,dateOfBirth);
                   Student s = new Student (studentPerson,major);
                   personList.addPerson(studentPerson); 
                     System.out.println("Da them student ");
                case 3:
                     System.out.println("Nhap ID: ");
                   id = scanner.nextLine();
                    System.out.println("Nhap que quan: ");
                  homeTown = scanner.nextLine();
                    System.out.println("Nhap ngay thang sinh: ");
                   date = scanner.nextLine();
                   dateOfBirth = new Date();
                    System.out.println("Nhap khoa: ");
                    String department = scanner.nextLine();
                    Teacher t =  new Teacher(id,homeTown,dateOfBirth,department);
                    personList.addPerson(t);
                    System.out.println("Da them Teacher.");
                    break;
                case 4: 
                    System.out.println("\n---Danh sach---");
                    personList.displayAll();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
  
}
