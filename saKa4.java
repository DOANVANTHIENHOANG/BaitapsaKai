package DoanVanThienHoang_6528;

import java.util.ArrayList;

public class saKa4 {
    public static void main(String[] args) {
        ArrayList<String>place=new ArrayList<>();
        place.add("Ha Noi");
        place.add("Sai Gon");
        place.add("Lon Don");
        place.add("Quang Tri");
        place.add("Nhat Ban");
        boolean kiemTra = place.contains("Lon Don");
        System.out.println("Vay danh sach co chua Lon don: " + kiemTra);
    }
 
}
