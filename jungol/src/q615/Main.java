package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = { new Person(sc.next(), sc.nextInt(), sc.nextInt()),
				new Person(sc.next(),sc.nextInt(), sc.nextInt()) };

		for (int i = 0; i < 2; i++) {
			p[i].print();
		}
		System.out.print("avg "+(p[0].korean+p[1].korean)/2+" "+(p[0].english+p[1].english)/2);

	}

}
