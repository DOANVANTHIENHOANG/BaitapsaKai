package DoanVanThienHoang_6528;
  import java.util.Scanner;
public class baiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cau mang ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        System.out.println("Tong cac phan tu cua mang: " + tong);
    }
}

    

