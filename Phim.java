package Deploy_Movie;

import java.util.Scanner;

public class Phim {
	
	static Scanner sc = new Scanner(System.in);
	public String tenPhim;
	public int namSX;
	public String tenHangSx;
	public String tenQuocGia;
	public int ngay,thang,nam;
	public double giaVe;
	public int maGiamGia;
	
	public Phim() {
		
	}
	
//	Phương thức tính tiền
	
	public double thanhTien() {
		return this.giaVe - (this.giaVe * this.maGiamGia/100);
	}
	
//	Phương thức để nhập
	
	public void nhapThongTin() {
		System.out.println(" Nhập tên phim: ");
		this.tenPhim = sc.nextLine();
		System.out.println(" Nhập năm sản xuất: ");
		this.namSX = sc.nextInt();
		sc.nextLine();
		System.out.println(" Nhập hãng sản xuất: ");
		this.tenHangSx = sc.nextLine();
		System.out.println(" Nhập quốc gia : ");
		this.tenQuocGia = sc.nextLine();
		System.out.print(" Nhập ngày tháng năm khởi chiếu: ");
		this.ngay = sc.nextInt();
		this.thang = sc.nextInt();
		this.nam = sc.nextInt();
		System.out.println(" Nhập giá vé: ");
		this.giaVe = sc.nextDouble();
		System.out.println(" Nhập mã giảm giá: ");
		this.maGiamGia = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Phim [tenPhim  =" + tenPhim + ", namSX =" + namSX + ", "
				+ " tenHangSx = " + tenHangSx + ", tenQuocGia = "
				+ tenQuocGia + ", ngay khởi chiếu =" + ngay + " " + thang + " " + nam + ", giaVe=" + giaVe
				+ ", tong tiền để có vé =" + this.thanhTien() + " ]";
	}
	
	
}
