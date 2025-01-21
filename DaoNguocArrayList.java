package DoanVanThienHoang_6528;
import java.util.ArrayList;
import java.util.Collections;
public class baisaKai2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Danh sach ban dau: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Danh sach sau khi doa nguoc " + numbers);
    }
}
    

