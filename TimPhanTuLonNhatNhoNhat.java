package DoanVanThienHoang_6528;
import java.util.ArrayList;
import java.util.Collections;
public class baisaKai4 { 
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(5);
        numbers.add(25);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Danh sach so: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Phan tu lon nhat: " + max);
        System.out.println("Phan tu nho nhat: " + min);
    }
}
    


