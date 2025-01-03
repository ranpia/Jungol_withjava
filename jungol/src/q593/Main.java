package q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int k = sc.nextInt();
            System.out.print("ASCII code =? ");
			if(k<=33 || k>127) {
				break;
			}
			System.out.println((char)k);
		}
		sc.close();
		
	}

}

