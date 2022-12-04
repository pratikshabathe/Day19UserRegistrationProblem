package com.blz.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private static boolean validate(String regex, String pattern) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pattern);
		return m.matches();
	}
	
	public static void isValidName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";	
		if(validate(regex, name))
			System.out.println("valid");
		else
			System.out.println("Invalid");	
	}
	
	public static void isValidEmail(String email) {
		String regex = "^[A-Za-z0-9.]+[@][a-z]{3,5}[.][a-z]{2,5}$";
		if(validate(regex, email))
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	
	public static void isValidPhoneNumber(String phNum) {
		System.out.println(phNum);
		//String regex = "^[+]\\d{2}?\\d{10}$";
		String regex = "^[+][0-9]{1,3}(-[0-9]{1,3})?\\s{0,3}[6-9]{1}[0-9]{9}$";	
		if(validate(regex, phNum))
			System.out.println("valid");
		else
			System.out.println("Invalid");	
	}
}
