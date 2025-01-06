package q508;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Item> i = new ArrayList<>();
		
		i.add(new Item("item","count","price"));	
		i.add(new Item("pen","20","100"));	
		i.add(new Item("note","5","95"));	
		i.add(new Item("eraser","110","97"));	
		
		for (Item I1:i) {
			for (int j=0;j<10-I1.getItem().length();j++) {
				System.out.print(" ");
			}
			System.out.print(I1.getItem());
			for (int j=0;j<10-I1.getCount().length();j++) {
				System.out.print(" ");
			}
			System.out.print(I1.getCount());
			for (int j=0;j<10-I1.getPrice().length();j++) {
				System.out.print(" ");
			}
			System.out.println(I1.getPrice());
		}
		
		
	}

}
