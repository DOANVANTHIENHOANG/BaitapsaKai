package DoanVanThienHoang_6528;
import java.util.Scanner; 
public class Baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cau mang:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cau mang");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

