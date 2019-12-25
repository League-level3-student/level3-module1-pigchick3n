package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
	String current;
	char[] guessWord;
	char[] letters; 
	int chars;
	int lives;

	void start() {

		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		int numOfWords = Integer.parseInt(JOptionPane.showInputDialog("Yeety"));

		for (int i = 0; i < numOfWords;) {
			String ran = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(ran)) {
				words.push(ran);
				i++;
			}
		}

		getNextWord();
		
		letters = current.toCharArray();
		
			guessWord = new char[current.length()];
		for (int i = 0; i < current.length(); i++) {
			guessWord[i]= '_';
			label.setText(new String(guessWord));
		}
		frame.pack();

	}

	public void getNextWord() {
		if (!words.isEmpty()) {
			current = words.pop();
		}

	}
	public void keyPressed(KeyEvent e1) {

	
		char keyChar = e1.getKeyChar();
		System.out.println(keyChar);

	
		for (int i = 0; i < current.length(); i++) {
			if(keyChar == letters[i]) {
				guessWord[i] = keyChar ;
				
			}else {
				lives--;
			}
			
		}
		label.setText(new String(guessWord));
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
