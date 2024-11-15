import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        quanly manager = new quanly();
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1 . thêm sách ");
            System.out.println("2 . xóa sách ");
            System.out.println("3 . tìm sách ");
            System.out.println("4 . sửa sách ");
            System.out.println("5 . hiển thị danh sách ");
            System.out.println("0. thoát ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 :
                    System.out.println("nhập id sách thêm vào : ");
                    String idsach = scanner.nextLine();
                    System.out.println("nhập tên sách muốn thêm vào : ");
                    String tensach = scanner.nextLine();
                    System.out.println("nhập tên tác giả : ");
                    String tacgia = scanner.nextLine();
                    System.out.println("nhập tên nxb : ");
                    String nxb = scanner.nextLine();
                    manager.themsach(new sach( idsach, tensach, tacgia, nxb));
                    break;
                case 2 :
                    System.out.println("nhập id muốn xóa : ");
                    String idxoa = scanner.nextLine();
                    manager.removesach(idxoa);
                    break;
                case 3 :
                    System.out.println("nhập id cần tìm  : ");
                    String idsachtim = scanner.nextLine();
                    sach timsach = manager.timsach(idsachtim);
                    if (timsach != null ){
                        System.out.println("sách cần tìm " + timsach);
                    }else {
                        System.out.println("không tìm thấy sách ");
                    }
                    break;
                case 4 :
                    System.out.println("nhập id sách cần sửa : ");
                    String idsachsua = scanner.nextLine();
                    System.out.println("nhập tên sách mới : ");
                    String tenmoi = scanner.nextLine();
                    System.out.println("nhập nxb mới : ");
                    String nxbmoi = scanner.nextLine();
                    System.out.println("nhập tác giả mới : ");
                    String tacgiamoi = scanner.nextLine();
                    manager.update(idsachsua, tenmoi,nxbmoi,tacgiamoi);
                    break;
                case 5:
                    System.out.println("danh sách gồm có ");
                    manager.hienthi();
                    break;
                case 0 :
                    System.out.println("chương trình kết thúc ");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ");
            }
        } while (choice!=0);
    }
}