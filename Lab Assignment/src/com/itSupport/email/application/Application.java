package com.itSupport.email.application;

import java.util.Scanner;

import com.itSupport.email.credentials.CredentialServices;
import com.itSupport.email.modal.Employee;

public class Application {
	public static void main(String args[]) {

		Employee emp = new Employee("Sapna", "Gupta");
		CredentialServices cs = new CredentialServices();

		String generatedEmail;
		String generatedPassword;

		System.out.println("Please enter the department");

		System.out.println("1- Technical");
		System.out.println("2- Admin");
		System.out.println("3- Human Resource");
		System.out.println("4- Legal");
		Scanner sc = new Scanner(System.in);

		int givenInfo = sc.nextInt();

		switch (givenInfo) {
		case 1:
			generatedEmail = cs.generateEmail(emp.getfirstName().toLowerCase(), emp.getlastName().toLowerCase(),
					"tech.");
			generatedPassword = cs.generatePassword();
			cs.showCredential(emp, generatedEmail, generatedPassword);
			break;

		case 2:
			generatedEmail = cs.generateEmail(emp.getfirstName().toLowerCase(), emp.getlastName().toLowerCase(),
					"adm.");
			generatedPassword = cs.generatePassword();
			cs.showCredential(emp, generatedEmail, generatedPassword);
			break;

		case 3:
			generatedEmail = cs.generateEmail(emp.getfirstName().toLowerCase(), emp.getlastName().toLowerCase(), "hr.");
			generatedPassword = cs.generatePassword();
			cs.showCredential(emp, generatedEmail, generatedPassword);
			break;

		case 4:
			generatedEmail = cs.generateEmail(emp.getfirstName().toLowerCase(), emp.getlastName().toLowerCase(),
					"legal.");
			generatedPassword = cs.generatePassword();
			cs.showCredential(emp, generatedEmail, generatedPassword);
			break;

		default:
			System.out.println("choose the right option");

		}
		sc.close();
	}

}
