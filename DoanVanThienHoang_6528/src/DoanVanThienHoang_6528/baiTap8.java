package DoanVanThienHoang_6528;
 import java.util.Scanner;
public class baiTap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] daKiemTra = new boolean[n]; 

        System.out.println("Nhap cac phan tu  cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            daKiemTra[i] = false; 
        }
        System.out.println("Tan suat phan tu:");
        for (int i = 0; i < n; i++) {
            if (!daKiemTra[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        daKiemTra[j] = true;
                    }
                }
                System.out.println(arr[i] + ": " + count + " lần");
            }
        }
    }
}
