package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialService implements ICredentialService{
	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String number = "0123456789";
	private String splChar = "@#$!%^&*()_=+?:";
	private String passwordChars = upper + lower + number + splChar;
	private Random random = new Random();



	@Override
	public void generateEmail(Employee employee) {
		String emailAdrress = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment()+".gl.in";
		employee.setEmailAdress(emailAdrress);
		
	}

	@Override
	public void generatePassword(Employee employee) {
		String password = "";
		for(int i=0;i<8;i++) {
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		employee.setPassword(password);
		
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName() +", your generated credentials are as follows:- ");
		System.out.println("Email\t\t: "+ employee.getEmailAdress());
		System.out.println("Password\t: "+employee.getPassword());
	}

}
