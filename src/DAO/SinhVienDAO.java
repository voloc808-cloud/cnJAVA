package DAO;

import database.DBConnection;
import model.SinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {

    
    public static void themSinhVien(SinhVien sv) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO sinhvien(masv, hoten, ngaysinh, nganh, diemtb, lop) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sv.getMasv());
            ps.setString(2, sv.getHoten());
            ps.setDate(3, new java.sql.Date(sv.getNgaysinh().getTime()));
            ps.setString(4, sv.getNganh());
            ps.setDouble(5, sv.getDiemTB());
            ps.setString(6, sv.getLop());

            ps.executeUpdate();

            System.out.println("Them sinh vien thanh cong!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Xóa sinh viên
    public void xoaSinhVien(String masv) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM sinhvien WHERE masv=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, masv);

            ps.executeUpdate();

            System.out.println("Xoa sinh vien thanh cong!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Sửa sinh viên
    public void suaSinhVien(SinhVien sv) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE sinhvien SET hoten=?, ngaysinh=?, nganh=?, diemtb=?, lop=? WHERE masv=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sv.getHoten());
            ps.setDate(2, new java.sql.Date(sv.getNgaysinh().getTime()));
            ps.setString(3, sv.getNganh());
            ps.setDouble(4, sv.getDiemTB());
            ps.setString(5, sv.getLop());
            ps.setString(6, sv.getMasv());

            ps.executeUpdate();

            System.out.println("Cap nhat sinh vien thanh cong!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Lấy danh sách sinh viên
    public List<SinhVien> getAllSinhVien() {

        List<SinhVien> list = new ArrayList<>();

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM sinhvien";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                SinhVien sv = new SinhVien();

                sv.setMasv(rs.getString("masv"));
                sv.setHoten(rs.getString("hoten"));
                sv.setNgaysinh(rs.getDate("ngaysinh"));
                sv.setNganh(rs.getString("nganh"));
                sv.setDiemtb(rs.getDouble("diemtb"));
                sv.setLop(rs.getString("lop"));

                list.add(sv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}