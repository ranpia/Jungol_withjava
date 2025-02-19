package q564;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> alphabet = new ArrayList<>();
		int i = 0;

		while (true) {
			char a = sc.next().charAt(0);
			if (a >= 'A' && a <= 'Z') {
				alphabet.add(a);
				i++;
			}
			else {
				break;
			}
		}
		
		sc.close();
		
		Map<Character, Integer> asc = new HashMap<>();
		
		for (i = 0; i < alphabet.size(); i++) {
			if (asc.containsKey(alphabet.get(i))) {
				int num = asc.get(alphabet.get(i));
				asc.put(alphabet.get(i), ++num);
			}
			else {
				asc.put(alphabet.get(i), 1);
			}
		}
		
		List<Character> tempSet = new ArrayList<>(asc.keySet());
		Collections.sort(tempSet);

		for (char a : tempSet) {
			System.out.println(a + " : " + asc.get(a));
		}
	}

}
