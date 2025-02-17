package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] classavg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);

		int classnum1 = sc.nextInt();
		int classnum2 = sc.nextInt();

		sc.close();

		System.out.printf("%.1f", (classavg[classnum1 - 1] + classavg[classnum2 - 1]));

	}

}
