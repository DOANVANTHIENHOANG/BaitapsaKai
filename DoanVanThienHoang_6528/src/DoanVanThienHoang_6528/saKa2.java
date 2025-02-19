package DoanVanThienHoang_6528;

import java.util.ArrayList;

public class saKa2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
       colors.add("do");
       colors.add("xanh");
       colors.add("tim");
       colors.add("cam");
       colors.add("den");
       colors.set(1,"vang");
        System.out.println("Vay danh sach da duoc cap nhat: " + colors);
       
    }
}
