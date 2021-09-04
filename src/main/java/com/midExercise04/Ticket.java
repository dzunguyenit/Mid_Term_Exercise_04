package com.midExercise04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ticket {
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

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input ticket information: ");
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input day: ");
		int day = sc.nextInt();

		LocalDateTime now = LocalDateTime.now();

		Ticket ticket = new Ticket(name, now, 10000);

		System.out.println(ticket.toString());

	}

	@Override
	public String toString() {
		return "Name: " + this.tenChuyen + ", Date: " + this.ngayBay + ", Price: " + this.giaVe + ")" + "";
	}

	public int getGiaVe() {
		return giaVe;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input ticket information: ");
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input day: ");
		int day = sc.nextInt();

		LocalDateTime now = LocalDateTime.now();

		Ticket ticket = new Ticket(name, now, 10000);

		System.out.println(ticket.toString());

	}

}
