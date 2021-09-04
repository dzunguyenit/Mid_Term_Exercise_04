package com.midExercise04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ticket {
//	Lớp Ticket:
//	Thuộc tính: tenChuyen, ngayBay, giaVe
//	Phương thức:
//	Khởi tạo rỗng & khởi tạo đầy đủ
//	Nhập thông tin vé từ console
//	Xuất thông tin vé thành chuỗi (toString)
//	getGiaVe(): hàm trả về giá vé

	String tenChuyen;
	LocalDateTime ngayBay;
	int giaVe;

	public Ticket() {

	}

	public Ticket(String tenChuyen, LocalDateTime ngayBay, int giaVe) {
		this.tenChuyen = tenChuyen;
		this.ngayBay = ngayBay;
		this.giaVe = giaVe;
	}

	public Ticket input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name:");
		this.tenChuyen = sc.nextLine();
		System.out.print("Day: ");
		int day = sc.nextInt();
		System.out.print("Month: ");
		int month = sc.nextInt();
		System.out.print("Year: ");
		int year = sc.nextInt();
		System.out.print("Hour: ");
		int hour = sc.nextInt();
		System.out.print("Minute: ");
		int minute = sc.nextInt();
		System.out.print("Second: ");
		int second = sc.nextInt();

		this.ngayBay = LocalDateTime.of(year, month, day, hour, minute, second);
		System.out.print("Price: ");
		this.giaVe = sc.nextInt();
		return new Ticket(this.tenChuyen, this.ngayBay, this.giaVe);

	}

	@Override
	public String toString() {
		return "Name: " + this.tenChuyen + ", Date: " + this.ngayBay + ", Price: " + this.giaVe + "";
	}

	public int getGiaVe() {
		return giaVe;

	}

}
