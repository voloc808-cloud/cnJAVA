package model;

import java.util.Date;

public class SinhVien {

    private String masv;
    private String hoten;
    private Date ngaysinh;
    private String nganh;
    private double diemTB;
    private String lop;

    public SinhVien(String masv, String hoten, Date ngaysinh, String nganh, double diemTB, String lop) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.nganh = nganh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMasv() { return masv; }
    public String getHoten() { return hoten; }
    public Date getNgaysinh() { return ngaysinh; }
    public String getNganh() { return nganh; }
    public double getDiemTB() { return diemTB; }
    public String getLop() { return lop; }

}