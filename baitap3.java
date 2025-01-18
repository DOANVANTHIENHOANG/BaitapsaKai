package DoanVanThienHoang_6528;
 import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean doiXung = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                doiXung = false;
                break;
            }
        }

        if (doiXung) {
            System.out.println("Mang doi xung.");
        } else {
            System.out.println("Mang khong doi xung.");
        }
    }
}