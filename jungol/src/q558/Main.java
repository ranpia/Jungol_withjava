package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] array=new int[100];
		int i=0;
		
		for (int j=0;j<100;j++) {
			array[j]=-1;
		}
		
		Scanner sc=new Scanner(System.in);
		while (true) {
			array[i]=sc.nextInt();
			if (array[i++]==0) {
				sc.close();
				break;
			}
		}
		for (int k=i-2;k>=0;k--) {
			System.out.print(array[k]+" ");
		}
	}

}
