package lab5.exer2;

import java.io.Console;
import java.util.Scanner;

import lab5.exer1.AgeExc;

public class ValidName extends Exception {
	String firstName;
	String lastName;

	@Override
	public String toString() {
		return "ValidName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public ValidName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		System.out.println("Enter last name");
		String lastName = sc.nextLine();

		boolean status = true;
		try {

			if (!(firstName.length()==0 || lastName.length()==0)) {

				status = true;
				System.out.println("Your Name:" + firstName + " " + lastName);
			} else {
				throw new ValidName(firstName, lastName);
			}

		} catch (ValidName e) {
			System.out.println(e);
		}

		sc.close();

	}

}
