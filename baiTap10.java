package DoanVanThienHoang_6528;
    import java.util.Scanner;
public class baiTap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int chan = 0, le = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }

        System.out.println("So Chan:  " + chan);
        System.out.println("So le: " + le);
    }
}

