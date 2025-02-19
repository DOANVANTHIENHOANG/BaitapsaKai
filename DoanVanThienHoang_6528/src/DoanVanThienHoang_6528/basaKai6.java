package DoanVanThienHoang_6528;
   import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class basaKai6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        System.out.println("Danh sach so: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }
}
        
    
