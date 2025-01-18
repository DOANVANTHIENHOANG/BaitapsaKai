package DoanVanThienHoang_6528;
import java.util.Scanner;
public class baiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Mang khong trùng lap: ");
        for (int i = 0; i < n; i++) {
            boolean trungLap = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    trungLap = true;
                    break;
                }
            }
            if (!trungLap) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


