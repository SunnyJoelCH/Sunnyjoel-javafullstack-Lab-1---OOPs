package com.greatlearning.service;
import com.greatlearning.email.Employe;

import java.util.Random;



public class Credentialserviceimp implements Credentialservice{
	Random random = new Random();
	private final int password_len =8;
	
	public String  generateandSetemailaddress(Employe employe) {
		String emailAdd = employe.getFirstName() + "." + employe.getlastName() + "@" + employe.getdepartment()+ Company_Name ;
		employe.setemailAddress(emailAdd);
		return emailAdd;
			
	}
	
	
	public String generateandSetpassword(Employe employe) {
		
		
		String password = "";
		for ( int i =0 ; i<password_len ; i++) 
		{
			password = password + ALL_PASSWORD_CHARS.charAt(random.nextInt(ALL_PASSWORD_CHARS.length())); 
			
		}
		employe.setpassword(password);
		return password;
	}



	public void showCredentials(Employe employe) {
		System.out.println( "Dear" +employe.getFirstName() +  "your generated credentials are as follows");
		System.out.println("Email --->"+ employe.getemailAddress());
		System.out.println("Password --->" + employe.getpassword());
	}
	

}
