package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String ans="";

		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i)<91) {
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
