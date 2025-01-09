package q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];

		while (true) {
			for (int i = 0; i < 2; i++) {
				num[i] = sc.nextInt();

			}
			if (num[0] < 2 || num[0] > 9) {
				System.out.println("INPUT ERROR!");
			} else if (num[1] < 2 || num[1] > 9) {
				System.out.println("INPUT ERROR!");
			} else {
				if (num[0]<num[1]) {
					for (int j=1; j<=9; j++) {
						for (int i=num[0];i<=num[1];i++) {
							System.out.printf("%d * %d = %2s   ", i, j, Integer.toString(i*j));
						}
						System.out.println();
					}
					break;
				}
				else {
					for (int j=1; j<=9; j++) {
						for (int i=num[0];i>=num[1];i--) {
							System.out.printf("%d * %d = %2s   ", i, j, Integer.toString(i*j));
						}
						System.out.println();
					}
					break;
				}
			}

		}

	}
}
