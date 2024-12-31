package q613;

import java.util.Scanner;

public class Main {
	private String name;
	private String school;
	private int grade;

	public static void main(String[] args) {

		// Person per = new Person();
		Main per = new Main();

		Scanner sc = new Scanner(System.in);
		per.name = sc.next();
		per.school = sc.next();
		per.grade = sc.nextInt();

		System.out.println("Name : " + per.name);
		System.out.println("School : " + per.school);
		System.out.println("Grade : " + per.grade);
	}

}
