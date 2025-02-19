package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		for(int i=1; i<str.length()+1; i++) {
			String rotatestr1 = str.substring(str.length()-i, str.length());
			String rotatestr2 = str.substring(0, str.length()-i);
			System.out.println(rotatestr1+rotatestr2);
		}
	}

}
