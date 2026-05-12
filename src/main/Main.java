package main;

import DAO.SinhVienDAO;
import database.DBConnection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import model.SinhVien;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){

            System.out.println("1. Them sinh vien");
            System.out.println("0. Thoat");

            int chon = sc.nextInt();
            sc.nextLine();

            if(chon == 1){

                try{

                    System.out.print("Ma SV: ");
                    String masv = sc.nextLine();

                    System.out.print("Ho ten: ");
                    String hoten = sc.nextLine();

                    System.out.print("Ngay sinh (yyyy-MM-dd): ");
                    String ns = sc.nextLine();

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date ngaysinh = sdf.parse(ns);

                    System.out.print("Nganh (CNTT/KTPM): ");
                    String nganh = sc.nextLine();

                    System.out.print("Diem TB: ");
                    double diem = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Lop: ");
                    String lop = sc.nextLine();

                    SinhVien sv = new SinhVien(masv,hoten,ngaysinh,nganh,diem,lop);

                    ;

                }catch(Exception e){
                    e.printStackTrace();
                }

            }

            if(chon == 0){
                break;
            }

        }

    }

}