package onthi;

import java.util.Scanner;

public class QuanLiSach {
    private String maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public QuanLiSach(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public QuanLiSach() {
    }
    public void input(Scanner sc){
        try{
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu=sc.nextLine();
        System.out.println("nhap ten nha xuat ban: ");
        tenNXB=sc.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPhatHanh=Integer.parseInt(sc.nextLine());
        }catch(Exception e){
            System.out.println("Nhap hop le: ");
        }
       
    }
    public void output(){
        System.out.println("ma tai lieu: "+maTaiLieu+"Ten nha xuat ban: "+tenNXB
        +"so ban phat hanh: "+soBanPhatHanh);
    }
}
