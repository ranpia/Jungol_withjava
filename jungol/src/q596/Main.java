package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();

		sc.close();
		String ans = "";

		if (num > str.length()) {
			for (int i = 0; i < str.length(); i++) {
				ans += str.charAt(str.length() - i - 1);
			}
			System.out.println(ans);
		} else {
			for (int i = 0; i < num; i++) {
				ans += str.charAt(str.length() - i - 1);
			}

			System.out.println(ans);
		}
	}

}
