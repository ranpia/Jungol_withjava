package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School sch1 = new School( "Jejuelementary", 6);
		Scanner sc = new Scanner(System.in);
		School sch2 = new School(sc.next(), sc.nextInt());

		
		sch1.print();
		sch2.print();
	}

}
