
package bt1;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StudentList studentList = new StudentList();
        while(true){
            System.out.println("\n---MENU---");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi danh sach sinh vien");
            System.out.println("3.Tim kiem sinh vien theo ID");
            System.out.println("4.Xoa sinh vien theo ID");
            System.out.println("5.Chinh sua thong tin sinh vien");
            System.out.println("6.Thoat");
            System.out.println("Chon chuc nang");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Nhap so luong sinh vien: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    studentList.enterStudents(n);
                    break;
                case 2:
                studentList.displayAllStudents();
                break;
                case 3:
                    System.out.println("Nhap Id sinh vien can tim: ");
                    String idtoFind=scanner.nextLine();
                    Student student = studentList.findStudentById(idtoFind);
                    if(student != null){
                        student.displayStudentInfo();
                    }else{
                        System.out.println("Khong tim thay sinh vien.");
            }
                    break;
                case 4:
                    System.out.println("Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    scanner.nextLine();

                          if

(studentList.deleteStudentById(idToDelete)) {

System.out.println("Xóa thành công.");

} else {

System.out.println("Không tìm thấy sinh

viên.");

}

break;

case 5:

System.out.print("Nhập ID

sinh vien can chinh sua: ");

String idToEdit

scanner.nextLine();

studentList.editStudentById(idToEdit);

break;

case 6:

System.out.println("Thoát

chương trình.");

scanner.close();

return;

default:

System.out.println("Lua

chon khong hop le.Hay thu nhap tu 1-6 ");
    }
}
}
}