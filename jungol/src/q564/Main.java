package q564;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> alphabet = new ArrayList<>();
        
        while (sc.hasNext()) {
            char a = sc.next().charAt(0);
            if (a >= 'A' && a <= 'Z') {
                alphabet.add(a);
            } else {
                break;
            }
        }
        sc.close();

        Map<Character, Integer> asc = new TreeMap<>();
        
        for (char ch : alphabet) {
            asc.put(ch, asc.getOrDefault(ch, 0) + 1);
        }

        asc.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
