import java.util.ArrayList;

public class quanly {
    private ArrayList<sach> saches;

    public quanly(ArrayList<sach> saches) {

    }

    public quanly() {
        this.saches = new ArrayList<>();
    }

    public void themsach(sach sach) {
        saches.add(sach);
    }

    public void removesach(String sachid) {
        boolean found = false;
        for (int i = 0; i < saches.size(); i++) {
            sach s = saches.get(i);
            if (s.getIdsach().equals(sachid)) {
                saches.remove(i);
                found = true;
                System.out.println("đã xóa thành công ");
                break;
            }
        }
        if (!found)
            System.out.println("ko tìm thấy sách ");
    }

    public void update(String idmoi, String tenmoi, String tacgiamoi, String nxbmoi) {
        for (sach s : saches) {
            if (s.getIdsach().equals(idmoi)) {
                s.setTensach(tenmoi);
                s.setNxb(nxbmoi);
                s.setTagia(tacgiamoi);
            }
        }
    }

    public sach timsach(String masach) {
        for (sach s : saches) {
            if (s.getIdsach().equals(masach)) {
                return s;
            }
        }
        return null;
    }

    public void hienthi() {
        if (saches.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        } else {
            System.out.println("Danh sach sach:");
            for (sach sach : saches) {
                System.out.println(sach);
            }
        }
    }
}


