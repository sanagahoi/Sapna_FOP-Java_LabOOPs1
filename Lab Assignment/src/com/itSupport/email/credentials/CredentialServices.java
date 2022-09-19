package com.itSupport.email.credentials;

import com.itSupport.email.modal.Employee;

public class CredentialServices {

	// generate password

	public String generatePassword() {

		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String number = " 0123456789";
		String chars = "#@*%!+";

		String bigString = caps + lowercase + number + chars;

		// using random method

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			int random = (int) (Math.random() * bigString.length());
			password[i] = bigString.charAt(random);

		}
		return new String(password);
	}

	// generate email address

	public String generateEmail(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + "gl.com";

	}

	// show credentials

	public void showCredential(Employee employee, String email, String Password) {

		System.out.println("Dear " + employee.getfirstName() + " your generated credentials are as follows: ");
		System.out.println("Email --> " + email);
		System.out.println("Password --> " + Password);
		System.out.println("------------");
		System.out.println("Thank You");
	}
}
