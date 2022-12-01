package com.blz.day19;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problems--");
		checkFirstName();
	}
		public static void checkFirstName() {
			System.out.println("Enter first number: ");
			String fName = sc.next();
			UserRegistration.userRegistration(fName);
			}
}
