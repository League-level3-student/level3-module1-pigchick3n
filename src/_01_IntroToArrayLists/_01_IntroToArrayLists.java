package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<>();
		//2. Add five Strings to your list
		names.add("Sarah");
		names.add("Spongebob");
		names.add("Bob");
		names.add("Robert");
		names.add("Patrick");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String s : names) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i++) {
			if(i%2 == 0) {
				System.out.println(names.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i > -1; i--) {
			System.out.println(names.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			for (int j = 0; j < names.get(i).length(); j++) {
				if (names.get(i).substring(j,j+1) .equals("e")){
					System.out.println(names.get(i));
					break;
				}
			}
		
		}
	}
}
