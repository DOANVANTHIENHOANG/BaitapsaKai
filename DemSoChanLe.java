package DoanVanThienHoang_6528;

import java.util.ArrayList;
import java.util.Random;

public class baisaKai1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(50) + 1); 
        }
        int soChan = 0;
        int soLe = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                soChan++;
            } else {
                soLe++;
            }
        }
        System.out.println("Danh sach so : " + numbers);
        System.out.println("Số lượng số chẵn: " + soChan);
        System.out.println("Số lượng số lẻ: " + soLe);
    }
}
    
