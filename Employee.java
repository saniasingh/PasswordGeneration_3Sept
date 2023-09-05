package com.greatlearning.email.model;

public class Employee {
          private String firstName;
          private String lastName;
          private String department;
          private String emailAdress;
          private String password;
          
       public Employee(String firstName, String lastName) {
    	   this.firstName = firstName;
    	   this.lastName = lastName;
       }

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
       
       
          
}
