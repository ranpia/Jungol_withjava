package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int bmi = weight + 100 - height;
		
		sc.close();
		
		
		System.out.println(bmi);
		
		if (bmi>0) {
			System.out.println("Obesity");
		}
	}

}
