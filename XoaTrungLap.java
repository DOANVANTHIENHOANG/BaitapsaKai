
package DoanVanThienHoang_6528;
  import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
public class baisaKai5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("An");
        names.add("Binh");
        names.add("An");
        names.add("Cuonng");
        names.add("Binh");
        names.add("Dung");
        System.out.println("Danh sach ban dau: " + names);
        Set<String> uniqueNames = new LinkedHashSet<>(names); 
        ArrayList<String> namesWithoutDuplicates = new ArrayList<>(uniqueNames);
        System.out.println("Danh sach ten bi xoa trung: " + namesWithoutDuplicates);
    }
}

