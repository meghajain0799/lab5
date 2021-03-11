package lab5.exer1;

import java.util.Scanner;


public class AgeExc extends Exception {

	int age;

	public AgeExc(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeExc [Age=" + age + "]";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		boolean status = true;
		try {
			if (age < 15) {
                status = false;
				throw new AgeExc(age);
			}

		} catch (AgeExc e) {
			System.out.println(e);

		}
		if(status)
			System.out.println("Age entered successfully");
		sc.close();
	}

}
