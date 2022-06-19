package com.lab.service;


import java.util.Random;

import com.lab.models.Employee;

public class CredentialService {

	public String generatePassword() {
		int first = (int) '!'; //33
		int last = (int) '~'; //126
		
		//int range = last - first;
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		//casting integer to character
		for(int i =0; i < 8; i++) {
			int randomNumber = random.nextInt(first,last);
			//int randomNumber = random.nextInt(last-first);
			char randomCharacter = (char) (randomNumber);
			sb.append(randomCharacter);
		}
		return sb.toString();
		
	}
	public String generateEmailAddress(Employee emp, String dept) {
		String email = String.format("%s%s@%s.company.com", emp.getFname(), emp.getLname(), dept);
		return email;
	}
	//to display the credentials - single responsibility principle
	public void showCredentails(String fname, String password, String email) {
		System.out.printf("Hi! %s, your credentials are: "
				+ "\n Email ---> %s"
				+ "\n Password ---> %s",fname,email,password);
	}
		
		
}
