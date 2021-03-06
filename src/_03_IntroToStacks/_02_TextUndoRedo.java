package _03_IntroToStacks;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	Stack<Character> labelName = new Stack<Character>();
	ArrayList<Character> ar;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String str = "";

	void start(char labelName) {

		frame.add(panel);
		panel.add(label);
		panel.setPreferredSize(new Dimension(600, 600));

		label.setText(String.valueOf(labelName));
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e1) {
		// TODO Auto-generated method stub

		int keyCode = e1.getKeyCode();
		char keyChar = e1.getKeyChar();
		System.out.println(keyChar);
		System.out.println(keyCode);
		if (keyCode == 8) {
			labelName.push(str.charAt(str.length() - 1));
			str = str.substring(0, str.length() - 1);
		}else if (keyCode == 127) {

			str+=labelName.pop();
		
		}else {
			str += keyChar;	
		}
		
		System.out.println(str);
		label.setText(str);
		frame.pack();
		// labelName.push(keyChar);
		// int sc = labelName.size();
		// for(int i = 0; i < sc; i++){
		// label.setText(String.valueOf(labelName.pop()));
		// }

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
