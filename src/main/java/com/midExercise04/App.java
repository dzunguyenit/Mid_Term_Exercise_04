package com.midExercise04;

import java.util.Scanner;

public class App {
//	Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím). Hiển thị danh sách
//	hành khách và số tiền phải trả tương ứng của mỗi khách hàng. Sắp xếp danh
//	sách hành khách theo chiều giảm dần của Tổng tiền. Hiển thị lại danh sách
//	hành khách và số tiền phải trả tương ứng của mỗi khách hàng.

	public static Passenger[] inputPassengers(int n) {// Nhập danh sách khách hàng
		Passenger[] passengers = new Passenger[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Passenger number %d: \n", (i + 1));
			passengers[i] = new Passenger();
			passengers[i].input();
		}
		return passengers;
	}

	public static void printPasssengers(Passenger[] passengers) {
		for (int i = 0; i < passengers.length; i++) {
			System.out.println(passengers[i].toString());
			System.out.println("Total bill: " + passengers[i].tinhTongTien());
		}
	}

	public static void sortPassengerByAmmountDescending(Passenger[] passengers) {
		Passenger[] passengerSort = passengers;
		Passenger temp = passengerSort[0];

		for (int i = 0; i < passengers.length - 1; i++) {
			for (int j = i + 1; j < passengers.length; j++) {
				if (passengerSort[i].tinhTongTien() < passengerSort[j].tinhTongTien()) {
					temp = passengerSort[j];
					passengerSort[j] = passengerSort[i];
					passengerSort[i] = temp;
				}
			}
		}
		System.out.println("Order by passenger descending");
		for (int i = 0; i < passengerSort.length; i++) {
			System.out.println("Passenger " + (i + 1) + ":");
			System.out.println(passengerSort[i].toString());
		}
	}

	public static void main(String[] args) {
		System.out.println("Input quantity of passengers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Input information passengers: ");
		Passenger[] passengers = inputPassengers(n);
		Passenger[] passengersClone = passengers.clone();

//		Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
		System.out.println("====================================");
		printPasssengers(passengers);

//		Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
		System.out.println("=====================================");
		sortPassengerByAmmountDescending(passengers);

//		Hiển thị lại danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
		System.out.println("=======================================================");
		printPasssengers(passengersClone);

	}
}