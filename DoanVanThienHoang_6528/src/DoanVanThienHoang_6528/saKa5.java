package DoanVanThienHoang_6528;

import java.util.ArrayList;
import java.util.Random;

public class saKa5 {
    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random xoa = new Random();
        for(int i=1;i<=10;i++){
            so.add(xoa.nextInt(100)+1);
        }
        System.out.println("Danh sach ban dau: " + so);
        if(!so.isEmpty()){
            int soNgau = xoa.nextInt(so.size());
            int xoaPhan = so.remove(2);
            System.out.println("So phan tu da xoa: " + xoaPhan);
            System.out.println("Danh sach sau khi xoa: " + so);
        }else{
            System.out.println("Danh sach rong,khong the xoa");
        }
    }
}
