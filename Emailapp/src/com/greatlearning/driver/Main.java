package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.Credentialserviceimp;
import com.greatlearning.email.Employe;
import com.greatlearning.service.Credentialservice;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Credentialservice credservice = new Credentialserviceimp();
		
		System.out.println("Enter employe first name");
		String firstname = sc.nextLine();
		
		System.out.println("Enter employe last name");
		String lastname = sc.nextLine();
		
		Employe employe = new Employe(firstname,lastname);
		
		System.out.println("Select name of the Department");
		System.out.println("1. Technical");
		System.out.println("2 Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int dept = sc.nextInt();
		switch(dept) {
			case 1 :
				employe.setdepartment("Technical.");
				break;
			case 2 :
				employe.setdepartment("Admin.");
				break;
			case 3:
				employe.setdepartment("HumanResource.");
				break;
			case 4:
				employe.setdepartment("Legal.");
				break;
			default:
				System.out.println("Invalid Input");
		}
		
		if(employe.getFirstName() != null && employe.getlastName() != null && employe.getdepartment() != null )
			credservice.generateandSetemailaddress(employe);
			credservice.generateandSetpassword(employe);
			credservice.showCredentials(employe);
			
		
		sc.close();
		
	}

}
