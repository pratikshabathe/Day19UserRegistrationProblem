package com.blz.day19;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problem--");
		checkFirstName();
		checkLastName();
	}
		public static void checkFirstName() {
			System.out.println("Enter first name: ");
			String fName = sc.next();
			UserRegistration.userRegistration(fName);
			}
		public static void checkLastName() {
			System.out.println("Enter Last name: ");
			String lName = sc.next();
			UserRegistration.userRegistration(lName);
			}
}
