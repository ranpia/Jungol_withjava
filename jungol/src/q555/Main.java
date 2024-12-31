package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = "";
		for (int i=0;i<10;i++) {
			n=n+sc.next();
		}
		System.out.print(n);
		
		/*
		// 배열 사용예제
		char[] ar = new char[10];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.next().charAt(0);
		}
        for (int i=0;i<ar.length;i++) {
        	System.out.print(ar[i]);
		}
		
		//buffered 사용예쩨
		throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input[] = br.readLine().split(" "); // 스페이스 기준으로 나누기
        for(int i=0;i<10;i++){
            bw.write(String.valueOf(input[i]));
        }
        bw.flush();
		
		*/
        sc.close();
	}

}
