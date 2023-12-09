package com.greatlearning.service;
import com.greatlearning.email.Employe;


public interface Credentialservice {
	final String Company_Name  = "great.com";
	final String Lower = "abcdefghijklmnopqrstuvwxyz";
	final String Upper = Lower.toUpperCase();
	final String Num = "0123456789";
	final String Spl = "!@#$%^&*()";
	final String ALL_PASSWORD_CHARS = Lower + Upper + Num + Spl;
	String generateandSetemailaddress(Employe employe);
	String generateandSetpassword(Employe employe);
	void showCredentials(Employe employe);
}
