package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	
	public static void main(String[] args) {
		double num=0;
		//1. Create a Stack of Doubles
		Stack<Double> numbers = new Stack<Double>();
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
		    double randomness = (new Random().nextDouble()*100);
		    numbers.push(randomness);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String low = JOptionPane.showInputDialog("GIVE ME A NUMBERs BTWN 1 - 100 :)");
		String high = JOptionPane.showInputDialog("GIVE ME A SMALLER NUMBERs BTWN 1 - 100 :)");
		double lowval = Double.parseDouble(low);
		double highval = Double.parseDouble(high);
		//4. Pop all the elements off of the Stack. Every time a double is popped that 
		while (!numbers.empty()){
			num = numbers.pop();
			if (num<highval && num>lowval ) {
				System.out.println(num);
			}
		}
		
		
		

		//   between the two numbers entered by the user, print it to the screen.
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
