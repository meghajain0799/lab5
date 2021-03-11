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
		String firstName = "Megha ";
		String lastName = " ";

		boolean status = true;
		try {

			if (firstName.equals(" ") || lastName.equals(" ")) {

				status = false;
				throw new ValidName(firstName, lastName);
			}

		} catch (ValidName e) {
			System.out.println(e);
		}
		if (status)
			System.out.println("Your Name:" + firstName + " " + lastName);
		sc.close();

	}

}
