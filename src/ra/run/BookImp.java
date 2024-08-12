package ra.run;

import ra.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // in menu
        do {
            System.out.println("*********************MENU******************\n" +
                    "1. Nhập thông tin n sách (n nhập từ bàn phím)\n" +
                    "2. Tính lợi nhuận các sách\n" +
                    "3. Hiển thị thông tin sách\n" +
                    "4. Sắp xếp sách theo giá bán tăng dần\n" +
                    "5. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                    "6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)\n" +
                    "7. Thống kê số lượng sách theo năm xuất bản\n" +
                    "8. Thống kê số lượng sách theo tác giả\n" +
                    "9. Thoát");
            System.out.println("Moi ban chon 1  - 9");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Moi nhap vao so luonh muon them ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        // khowir tao doi tuong sach
                        Book book = new Book();
                        // gooi den phuong thuc nhap thong tin cua moi sach
                        book.inputData();
                        // add book vao list
                        list.add(book);
                    }
                    break;
                case 2:
                    // tinhs loi nhuan cho tung sach
                    for (Book book : list) {
                        book.prosesInterest();
                    }
                    break;
                case 3:
                    System.out.println("Danh sach");
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 4:
                    // buoc 1 nhap vao tu khoa can tim

                    // buoc 2 chay vong lap kiem tra xem cos ten trung khong neu trung thi hien thi thong tin

                    break;
                case 5:
                    // thong ke theo nam xuat ban
                    // buoc1 khai bao tong = 0
                    // buoc2 nhap vao nam san xuat tu ban phim
                    // buoc 3 chay for duyet qua tat ca cac sach
                            //3.1 trong vong for
                            // neu nam nhap vao tu ban phim == nam cua sach thi tang tong += 1
                    break;
                default:
                    System.out.println("Chon sai");
            }
        } while (true);
    }
}
