package ra.bussiness;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
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

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "-----------------\n"
                + "BookId:" + bookId + "|BookName:" + bookName + "|Author" + author
                + "|ImportPrice" + importPrice + "|ExportPrice" + exportPrice;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sách ");
        bookName = scanner.nextLine();
        System.out.println("Nhập tên tác giả");
        author = scanner.nextLine();
        System.out.println("nhập mô tả về sách , ít nhất 10 kí tự");
        descriptions = scanner.nextLine();
        System.out.println("nhập giá nhập , phải lớn hơn 0");
        importPrice = scanner.nextDouble();
        System.out.println("nhập giá xuất ,phải lớn hơn 1.2 lần giá nhập ");
        exportPrice = scanner.nextDouble();
        if (descriptions.length() < 10) {
            System.out.println("phải nhập ít nhất 10 kí tự ");
        }
        if (importPrice < 0) {
            System.out.println("giá nhập phải lơn hơn 0");
        }
        if (exportPrice < 1.2 * importPrice) {
            System.out.println("giá xuất phải lớn hơn 1.2 lần giá nhập");
        }
    }
    public void displayData(){
        System.out.println("------------Thông tin sách-----------");
        System.out.println("Mã sách "+ bookId);
        System.out.println("Tên sách"+bookName);
        System.out.println("Tác giá"+author);
        System.out.println("Mô tả"+descriptions);
        System.out.println("Giá nhập"+importPrice);
        System.out.println("Giá xuất"+exportPrice);
        System.out.println("Lợi nhuận"+interest);
        System.out.println("Trạng thái"+bookStatus);
    }
}


