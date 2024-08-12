package ra.demo.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        // Tạo danh sách chứa n tên của nyc
        //String[] nycs = new String[10];
        List<String> nycs = new ArrayList<>();
        
        // thêm phần tử vào list 
        nycs.add("Hoa");
        nycs.add("Mai");
        nycs.add("Hồng");
        nycs.add("Lan");
        ;
        // duyệt qua các phần tử trong List 
        for (String nyc : nycs) {
            System.out.println(nyc);
        }
    }
}
