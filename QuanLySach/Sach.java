package onthi;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach extends QuanLiSach{
    private String tenTacGia;
    private String tenSach;
    private int soTrang;

    public Sach(String tenTacGia, String tenSach, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach() {
    }
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap ten tac gia: ");
        tenTacGia=sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach=sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang=Integer.parseInt(sc.nextLine());
    }
    public void output(){
        super.output();
        System.out.println("Ten tac gia: "+tenTacGia+" "+"Ten sach: "+tenSach+" "+"so trang: "+soTrang);
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Sach>ds=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin sach thu: "+(i+1));
            Sach s =new Sach();
            s.input(sc);
            ds.add(s);
        }
        for(int i=0;i<n;i++){
            Sach s=new Sach();
            if(s.getSoTrang()<100){
                s.output();
            }
        }
    }
}
