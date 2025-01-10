package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(), num2 = sc.nextInt();

		for (int i = 0; i < num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.print((i * num2 + j) + " ");
			}
			System.out.println();
		}

	}

}
