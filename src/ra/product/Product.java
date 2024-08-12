package ra.product;

import java.util.Scanner;

public class Product {
    // khai báo các trường
    private String id;
    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // phương thức nhập thông tin
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sản phẩm ");
        this.id = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm ");
        this.price = scanner.nextInt();
        System.out.println("Nhập vào số lượng ");
        this.quantity = scanner.nextInt();
    }

    // phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("====Thông tin sản phẩm====");
        System.out.println("Mã sản phẩm : "+this.id);
        System.out.println("Tên sản phẩm : "+this.name);
        System.out.println("Giá sản phẩm : "+this.price);
        System.out.println("Số lượng sản phẩm : "+this.quantity);
    }

}
