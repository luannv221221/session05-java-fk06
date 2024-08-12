package ra.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        // khởi tạo đối tương Scanner
        Scanner scanner = new Scanner(System.in);
        // khai báo danh sách đối tượng sản phẩm
        List<Product> list = new ArrayList<>();

        // in menu
        do {
            System.out.println("==========MENU===========");
            System.out.println("1. Thêm mới sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Thoát chương trình ");
            System.out.println("Mời bạn chọn từ 1 - 3");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    // khởi tạo đối tượng sản phẩm
                    Product product = new Product();
                    // gọi đến phương thức inputData
                    product.inputData();
                    // add đối tượng vừa tạo vào danh sách List
                    list.add(product);
                    break;
                case 2:
                    System.out.println("=========Danh sách sản phẩm =========");
                    for (Product item : list) {
                        item.displayData();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai lựa chọn");
            }
        } while (true);
    }
}
