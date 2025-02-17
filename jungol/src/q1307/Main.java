package q1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// 65~90
		int alpha = 65;

		char[][] square = new char[n][n];

		for (int i = n-1; i >-1 ; i--) {
			for (int j = n-1; j >-1 ; j--) {
				square[j][i] = (char)alpha;
				alpha++;
				if (alpha ==91)
					alpha = 65;
			}
		}
		
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j< n ; j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}
	}

}
