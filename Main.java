package com.blz.day19;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problem--");
		switch(sc.nextInt()) {
		case 1 :
			System.out.println("Enter first name: ");
			String fName = sc.next();
			UserRegistration.isValidName(fName);
			
		case 2 :
			System.out.println("Enter Last name: ");
			String lName = sc.next();
			UserRegistration.isValidName(lName);
			
		case 3:
			System.out.println("Enter an email: ");
			String email = sc.next();
			UserRegistration.isValidEmail(email);
		
		case 4 :
			System.out.println("Enter a phone number: ");
			sc.nextLine();
			String phNum = sc.nextLine();
			UserRegistration.isValidEmail(phNum);
			
		case 5:
			System.out.println("Enter an password: ");
			String password = sc.next();
			UserRegistration.isValidEmail(password);
		}
	}
}
