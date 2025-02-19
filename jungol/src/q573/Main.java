package q573;

import java.util.Scanner;

public class Main {
	public static void sqaure(int n) {
		for (int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				System.out.print((i+j*n+1) +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sqaure(n);

	}

}
