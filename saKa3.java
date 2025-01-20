package DoanVanThienHoang_6528;

import java.util.ArrayList;

public class saKa3 {
    public static void main(String[] args) {
        ArrayList<Double> value=new ArrayList<>();
        value.add(10.9);
        value.add(2.6);
        value.add(13.4);
        value.add(12.6);
        value.add(4.8);
        System.out.println("Cac gia tri duoc cap nhat");
        for(int i=0;i<value.size();i++){
            System.out.println("Gia"+(i+1)+": "+ value.get(i));
        }
            
    }
}
