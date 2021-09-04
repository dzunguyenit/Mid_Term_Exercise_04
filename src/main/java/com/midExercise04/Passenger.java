package com.midExercise04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Passenger {

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
		System.out.println("Input passenger information: ");
		System.out.println("Input name: ");
		String name = sc.nextLine();

		System.out.println("Input gender: ");
		boolean gender = sc.nextBoolean();

		System.out.println("Input age: ");
		int age = sc.nextInt();
		System.out.println("Input day: ");
		int day = sc.nextInt();

	}

	@Override
	public String toString() {
		return "Name: " + this.hoTen + ", Gender: " + this.gioiTinh + ", Age: " + this.tuoi + danhSachVe.toString();
	}

	public int tinhTongTien() {
		return tuoi;

	}

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		Ticket danhSachVe01 = new Ticket("HCM", now, 150000);
		Ticket danhSachVe02 = new Ticket("HaNoi", now, 200000);
		Ticket danhSachVe03 = new Ticket("DaNang", now, 250000);

		Ticket[] ticket = new Ticket[] { danhSachVe01, danhSachVe02, danhSachVe03 };

		Passenger passenger = new Passenger("Vu", false, 20, ticket);
		System.out.println(passenger);
	}
}
