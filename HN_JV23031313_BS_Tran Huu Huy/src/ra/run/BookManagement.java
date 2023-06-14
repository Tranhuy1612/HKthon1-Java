package ra.run;

import ra.bussiness.Book;
import ra.config.Config;

public class BookManagement {
    static Book[] listbook = new Book[100];
    static int size = 0;
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 7) {
            System.out.println("--------------BOOK-BASIC-MENU---------------");
            System.out.println("1.Nhập số sách (n)");
            System.out.println("2.Hiển thị tất cả sách đang lưu trữ");
            System.out.println("3.Sắp xếp theo lợi nhuận tăng dần ");
            System.out.println("4.xóa sách theo mã sách");
            System.out.println("5.Tìm kiếm tương đối sách theo tên hoặc mô tả");
            System.out.println("6.Thay đổi thông tin sách theo mã sách");
            System.out.println("7.thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Config.getScanner().nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
            }
        }
        // thêm mới sách
    }
    public static void hienthi() {
        if (size == 0) {
            System.err.println("Danh sách sản phẩm trống");
            return;
        }

        System.out.println("Danh sách Sản phẩm");
        for (Book book : listbook) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

}
