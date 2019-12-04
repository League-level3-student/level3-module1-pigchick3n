package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
void start() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	frame.add(panel);
	panel.add(label);
	int numOfWords = Integer.parseInt(JOptionPane.showInputDialog("Yeety"));
	Stack<String> words = new Stack<String>();
	for (int i = 0; i < numOfWords;) {
		String ran = Utilities.readRandomLineFromFile("dictionary.txt");
		if (words.contains(ran)==false) {
			words.push(ran);
			i++;
		}
	}
	
	for (int i = 0; i < numOfWords; i++) {
		System.out.println(words.pop());
	}
	
}
	
	
}
