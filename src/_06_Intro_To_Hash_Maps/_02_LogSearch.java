package _06_Intro_To_Hash_Maps;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> identification = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	void GUI() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		frame.setVisible(true);
		button1.setText("Add Entry");
		button2.setText("Search for ID");
		button3.setText("Display List");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

	}
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == button1) {
			
			String idnumber = JOptionPane.showInputDialog("Enter your ID number");
			String name = JOptionPane.showInputDialog("Enter your name");
			int id = Integer.parseInt(idnumber);
			identification.put(id, name);
		} else if (buttonPressed == button2) {
			String requestID = JOptionPane.showInputDialog("Enter a ID number");
			int requestedID = Integer.parseInt(requestID);
			for (int i : identification.keySet()) {
				if(i == requestedID) {
					String stuff = identification.get(requestedID);
					System.out.println(stuff);
				}else {
					System.out.println("oof");
				}
				
			}
		} else if (buttonPressed == button3) {
			for(Entry<Integer, String> entry : identification.entrySet()){
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
		}
	}

}
