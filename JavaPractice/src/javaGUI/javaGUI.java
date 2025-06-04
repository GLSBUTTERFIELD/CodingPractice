package javaGUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class javaGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // absolute positioning
		
		// text field
//		JTextField textField = new JTextField();
//		textField.setBounds(20, 20, 150, 25);

		// button
		JButton button = new JButton("Click Me");
		button.setBounds(180, 20, 90, 25);

		// label
		JLabel label = new JLabel("Hello!");
		label.setBounds(20, 60, 250, 25); 
		
		//combo box
		JComboBox <String> comboBox = new JComboBox(new String[]{"Dolly", "Mama", "Evie"});
		comboBox.setBounds(20, 20, 150, 25);
		
		// Add components to the frame
//		frame.add(textField);
		frame.add(button);
		frame.add(label);
		frame.add(comboBox);
		
		button.addActionListener(e -> {
//		    String name = textField.getText();
//			String name = "" + comboBox.getSelectedItem();
		    label.setText("Hello, " + comboBox.getSelectedItem() + "!");
		});
	
		
		
		frame.setVisible(true); 
		}
	
}
