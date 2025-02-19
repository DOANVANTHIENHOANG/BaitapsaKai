package DoanVanThienHoang_6528;
   import java.util.ArrayList;
import java.util.Random;
public class baisaKai7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
            sum += randomNumber; 
        }
        System.out.println("Danh sach so: " + numbers);
        System.out.println("Tong cac so: " + sum);
    }
}

