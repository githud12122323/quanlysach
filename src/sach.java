public class sach {
    private String idsach;
    private String tensach;
    private String tagia;
    private String nxb;

    public sach(String idsach, String tensach, String tagia, String nxb) {
        this.idsach = idsach;
        this.tensach = tensach;
        this.tagia = tagia;
        this.nxb = nxb;
    }



    public String getIdsach() {
        return idsach;
    }

    public void setIdsach(String idsach) {
        this.idsach = idsach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTagia() {
        return tagia;
    }

    public void setTagia(String tagia) {
        this.tagia = tagia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        return "sach{" + "idsach : '" + idsach + '\'' + ", tensach : '" + tensach + '\'' + ", tagia:'" + tagia + '\'' + ", tên nxb : " + nxb + '}';
    }
}

