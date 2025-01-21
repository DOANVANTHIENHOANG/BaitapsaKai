package DoanVanThienHoang_6528;
import java.util.ArrayList;
public class baisaKai3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Tao");
        fruits.add("Chuoi");
        fruits.add("Cam");
        fruits.add("Dưa hau");
        fruits.add("Xoai");

        System.out.println("Danh sach trai cay goc: " + fruits);

        ArrayList<String> fruitsCopy = new ArrayList<>(fruits);

        System.out.println("Danh sách trái cây đã sao chép: " + fruitsCopy);
    }
}
