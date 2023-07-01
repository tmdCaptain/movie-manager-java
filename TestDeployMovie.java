package Deploy_Movie;

public class TestDeployMovie {

	public static void main(String[] args) {
		Phim x = new Phim();
		System.out.println("Nhập thông tin phim thứ nhất");
		x.nhapThongTin();
		System.out.println(" Thông tin của phim " + x);
		
		System.out.println("Nhập thông tin phim thứ 2");
		Phim x1 = new Phim();
		x1.nhapThongTin();
		System.out.println(" Thông tin của phim " + x1);
		
		System.out.println("Nhập thông tin phim thứ 3");
		Phim x2 = new Phim();
		x2.nhapThongTin();
		System.out.println(" Thông tin của phim " + x2);
		
		System.out.println("Nhập thông tin phim cuối cùng");
		Phim x3 = new Phim();
		x3.nhapThongTin();
		System.out.println(" Thông tin của phim " + x3);
	}

}
