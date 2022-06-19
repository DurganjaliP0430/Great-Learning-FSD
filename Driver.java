package com.lab;

import java.util.Scanner;

import com.lab.models.Employee;
import com.lab.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Durganjali","Pottabathula");
		
		System.out.println(
				"\n Enter your department: \n"
		   		+ "1. Technical\n"
		   		+ "2. Admin\n"
		   		+ "3. Human Resource \n"
		   		+ "4. Legal");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		String dept;
		
		switch(input) {
		   case 1:
			   dept="tech";
			   break;
		   case 2: 
			   dept="admin";
			   break;
		   case 3: 
			   dept="hr";
			   break;
		   case 4: 
			   dept="legal";
			   break;
		 
			 default:
				 throw new IllegalArgumentException("Illegal Input" + input);
		} 
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp, dept);
		String pwd = cs.generatePassword();
		cs.showCredentails(emp.getFname(), pwd, email);
	}
}