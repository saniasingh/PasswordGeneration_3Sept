package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.ICredentialService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ICredentialService service = new CredentialService();
		
		System.out.println("Enter the Employee first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the Employee last name");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(firstName,lastName);
		
		System.out.println("Please select the employee department option");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			employee.setDepartment("techical");
			break;
		case 2:
			employee.setDepartment("Admin");
			break;
		case 3:
			employee.setDepartment("Human Resource");
			break;
		case 4:
			employee.setDepartment("Legal");
			break;
			
			default:
			  System.out.println("Please select the valid option");
			break;
		}
		
		if(employee.getFirstName() != null && employee.getLastName() != null && employee.getDepartment() != null) {
			service.generateEmail(employee);
			service.generatePassword(employee);
			service.showCredentials(employee);
			
		} else {
			System.out.println("Invalid Employee Details");
		}
		
		sc.close();
		
		
	}

}
