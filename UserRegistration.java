package com.blz.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void isValidName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);		
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");	
	}
	public static void isValidEmail(String email) {
		String regex = "^[A-Za-z0-9.]+[@][a-z]{3,5}[.][a-z]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
}
