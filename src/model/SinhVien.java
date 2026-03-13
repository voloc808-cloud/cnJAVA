package model;

import java.util.Date;

public class SinhVien {

    private String masv;
    private String hoten;
    private Date ngaysinh;
    private String nganh;
    private double diemTB;
    private String lop;
    public SinhVien() {}
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
    
    public void setMasv(String masv) {
    	this.masv=masv;
    }
    
    public void setHoten(String hoten) {
    	this.hoten=hoten;
    }
    
    public void setNgaysinh(Date ngaysinh) {
    	this.ngaysinh=ngaysinh;
    }
    
    public void setNganh(String nganh) {
    	this.nganh=nganh;
    }
    
    public void setDiemtb(Double diemTB) {
    	this.diemTB=diemTB;
    }
    
    public void setLop(String lop) {
    	this.lop=lop;
    }

}