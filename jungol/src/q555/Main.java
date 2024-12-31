package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = "";
		for (int i=0;i<10;i++) {
			n=n+sc.next();
		}
        sc.close();
		System.out.print(n);
	}

}
