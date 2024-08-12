package ra.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String author;
    private double interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, double importPrice, double exportPrice, String author, double interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void  inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sach ");
        this.bookId = scanner.nextLine();
        System.out.println("Nhap vao ten sach ");
        this.bookName = scanner.nextLine();
        System.out.println("Gia nhap ");
        this.importPrice = scanner.nextDouble();
        System.out.println("Nhap vao gia xuat");
        this.exportPrice = scanner.nextDouble();
        System.out.println("Nhap nam san xuat");
        this.year = scanner.nextInt();
    }

    public  void  displayData(){
        System.out.println("Ma sach "+this.bookId);
        System.out.println("Ten sach "+this.bookName);
        System.out.println("Gia nhap "+this.importPrice);
        System.out.println("Gia ban "+this.exportPrice);
    }

    public void  prosesInterest(){
        this.interest = this.exportPrice - this.importPrice;
        this.displayData();
        System.out.println("Loi nhuan "+this.interest);
    }

}
