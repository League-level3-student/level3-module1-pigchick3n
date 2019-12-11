package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
	String current;
	int chars;
void start() {
	
	frame.add(panel);
	panel.add(label);
	frame.setVisible(true);
	int numOfWords = Integer.parseInt(JOptionPane.showInputDialog("Yeety"));
	
	for (int i = 0; i < numOfWords;) {
		String ran = Utilities.readRandomLineFromFile("dictionary.txt");
		if (words.contains(ran)==false) {
			words.push(ran);
			i++;
		}	 
	}

		
	
	for (int i = 0; i < current.length(); i++) {
		label.setText(current);
	}
	

	
}
	
public void getNextWord() {
		if(!words.isEmpty()) {
			current = words.pop();
		}

	}
}
