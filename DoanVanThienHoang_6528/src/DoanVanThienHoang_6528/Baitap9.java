package DoanVanThienHoang_6528;
  import java.util.Scanner;
public class Baitap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cau mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cau mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Khong co phan tu lon thu hai.");
        } else {
            System.out.println("Phan tu lon thu hai: " + secondMin);
        }
    }
}
