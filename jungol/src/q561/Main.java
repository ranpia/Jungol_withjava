package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int under100=-1;
		int upto100 = 100000;
		
		for (int i=0 ;i<10; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]<100 && arr[i]>under100) {
				under100 = arr[i];
			}
			else if (arr[i]>100 && arr[i]<upto100) {
				upto100 = arr[i];
			}
		}
		
		if (under100 == -1)
			under100 = 100;
		
		if (upto100 == 100000)
			upto100 = 100;
		
		System.out.print(under100 +" "+ upto100);
		

	}

}
