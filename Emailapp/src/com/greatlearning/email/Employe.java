package com.greatlearning.email;



public class Employe {
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private String password;
	
	public Employe(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstName) {
			this.firstName = firstName;
		}
	
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
		
	public String getemailAddress() {
		return emailAddress;
		}
	public void setemailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
		public String getpassword() {
			return password;
			}
		public void setpassword(String password) {
			this.password = password;
	}
	
}