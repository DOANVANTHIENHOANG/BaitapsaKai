package sodo4;
    import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList list = new PersonList();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Thêm Giáo viên");
            System.out.println("3. Hiển thị tất cả");
            System.out.println("4. Xóa người theo ID");
            System.out.println("5. Sửa thông tin người theo ID");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Nhập quê quán: ");
                    String studentHomeTown = scanner.nextLine();
                    System.out.print("Nhập ngành học: ");
                    String major = scanner.nextLine();
                    list.addPerson(new Student(studentId, studentHomeTown, new Date(), major));
                    break;

                case 2:
                    System.out.print("Nhập ID: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Nhập quê quán: ");
                    String teacherHomeTown = scanner.nextLine();
                    System.out.print("Nhập bộ môn: ");
                    String department = scanner.nextLine();
                    list.addPerson(new Teacher(teacherId, teacherHomeTown, new Date(), department));
                    break;

                case 3:
                    list.displayAll();
                    break;

                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    String deleteId = scanner.nextLine();
                    if (list.deletePersonById(deleteId)) {
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Không tìm thấy ID.");
                    }
                    break;

                case 5:
                    System.out.print("Nhập ID cần sửa: ");
                    String editId = scanner.nextLine();
                    list.editPersonById(editId);
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
