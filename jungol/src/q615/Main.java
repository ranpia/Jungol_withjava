package q615;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> ps = new ArrayList<>();
		int avgKor=0;
		int avgEng=0;
		int count=2;
//				new Person(sc.next(),sc.nextInt(), sc.nextInt()) };

		for (int i = 0; i < count; i++) {
			ps.add(new Person(sc.next(), sc.nextInt(), sc.nextInt()));
		}
		for (Person p : ps) {
			p.print();
			avgKor+= p.getKor();
			avgEng+= p.getEng();
		}
		avgKor=avgKor/count;
		avgEng=avgEng/count;
		System.out.print("avg " + avgKor + " " + avgEng);
	}

}
