package com.midExercise04;

import java.util.Scanner;

public class Passenger {

//	Thuộc tính: hoTen, gioiTinh, tuoi, danhSachVe
//	Phương thức:
//	Khởi tạo
//	Nhập thông tin hành khách từ console
//	Xuất thông tin
//	tinhTongTien(): trả về tổng số tiền phải trả của hành khách ứng với số vé đã mua
//	Chương trình chính
//	Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím).
//	Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
//	Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
//	Hiển thị lại danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.

	String hoTen;;
	boolean gioiTinh;
	int tuoi;
	Ticket[] danhSachVe;

	public Passenger() {
	}

	public Passenger(String hoTen, boolean gioiTinh, int tuoi, Ticket[] danhSachVe) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.danhSachVe = danhSachVe;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		this.hoTen = sc.nextLine();

		System.out.println("Input gender: ");
		this.gioiTinh = sc.nextBoolean();

		System.out.println("Input age: ");
		this.tuoi = sc.nextInt();

		System.out.println("Input quantity ticket: ");

		int numberOfTicket = sc.nextInt();
		Ticket[] ticket = new Ticket[numberOfTicket];
		System.out.println("Input ticket information: ");
		for (int i = 0; i < numberOfTicket; i++) {
			System.out.printf("Input ticket number %d\n", i + 1);
			ticket[i] = new Ticket();
			ticket[i].input();
		}
		this.danhSachVe = ticket;
	}

	@Override
	public String toString() {
		String passengerInfor = "\nPassenger Information\nName: " + this.hoTen + ", Gender: " + this.gioiTinh
				+ ", Age: " + this.tuoi + "\nTicket Information:\n";

		for (Ticket ticket : danhSachVe) {
			passengerInfor += ticket.toString() + "\n";
		}

		return passengerInfor;

	}

	public int tinhTongTien() {
		int sumPrice = 0;
		for (int i = 0; i < this.danhSachVe.length; i++) {
			sumPrice += this.danhSachVe[i].getGiaVe();
		}
		return sumPrice;

	}

}
