/**
 * performs different String methods
 * 
 * due date     20220414
 * @filename    SuperStringSoftware.java
 * @author      Sadiksha Dahal
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuperStringSoftware extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField lowercase;
	private JTextField fourthString;
	private JTextField checkOne;
	private JTextField checkTwo;
	private JTextField stringOne;
	private JTextField letter;
	private JTextField eightChars;
	private JTextField userReplace;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperStringSoftware frame = new SuperStringSoftware();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SuperStringSoftware() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("SUPER STRING SOFTWARE");
		title.setForeground(UIManager.getColor("Button.select"));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		title.setBounds(295, 29, 217, 29);
		contentPane.add(title);
		
		JLabel lengthMsg = new JLabel("Enter a String. The program will output the number of characters in the String: ");
		lengthMsg.setBounds(69, 87, 524, 16);
		contentPane.add(lengthMsg);
		
		JLabel toLowerMsg = new JLabel("Enter a String in lowercase letters. The program will output the String in all captial letters: ");
		toLowerMsg.setBounds(69, 180, 582, 16);
		contentPane.add(toLowerMsg);
		
		JLabel fourthCharMsg = new JLabel("Enter a String. The program will output the character at the 4th spot: ");
		fourthCharMsg.setBounds(69, 270, 451, 16);
		contentPane.add(fourthCharMsg);
		
		JLabel equalsMsg = new JLabel("Enter two Strings. The program will output whether or not they are identical:");
		equalsMsg.setBounds(69, 369, 524, 16);
		contentPane.add(equalsMsg);
		
		JLabel indexMsg = new JLabel("Enter a String and a letter. The program will output whether or not the letter is found in the String:");
		indexMsg.setBounds(69, 468, 626, 16);
		contentPane.add(indexMsg);
		
		JLabel substringMsg = new JLabel("Enter a String that is at least 8 characters long. The program will output characters 4 - 6:");
		substringMsg.setBounds(69, 560, 569, 16);
		contentPane.add(substringMsg);
		
		JLabel replaceMsg = new JLabel("Enter a String that contains at least one \"a\". The program will replace all occurences of letter \"a\" with \"x\".");
		replaceMsg.setBounds(69, 665, 727, 16);
		contentPane.add(replaceMsg);
		
		
		length = new JTextField();
		length.setBounds(69, 128, 182, 26);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lengthOut = new JLabel("--");
		lengthOut.setBounds(602, 133, 61, 16);
		contentPane.add(lengthOut);
		
		JButton getLength = new JButton("length");
		getLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = length.getText();
				lengthOut.setText(Integer.toString(userInput.length()));
			}
		});
		getLength.setBounds(318, 128, 117, 29);
		contentPane.add(getLength);
		
		
		lowercase = new JTextField();
		lowercase.setColumns(10);
		lowercase.setBounds(69, 220, 182, 26);
		contentPane.add(lowercase);
			
		JLabel capitalOut = new JLabel("--");
		capitalOut.setBounds(491, 225, 377, 16);
		contentPane.add(capitalOut);
		
		JButton capital = new JButton("capitalize");
		capital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = lowercase.getText();
				capitalOut.setText(userInput.toUpperCase());
			}
		});
		capital.setBounds(318, 220, 117, 29);
		contentPane.add(capital);

		
		fourthString = new JTextField();
		fourthString.setColumns(10);
		fourthString.setBounds(69, 315, 182, 26);
		contentPane.add(fourthString);
		
		JLabel outputFourth = new JLabel("--");
		outputFourth.setBounds(602, 320, 61, 16);
		contentPane.add(outputFourth);
		
		JButton fourthSpot = new JButton("4th spot");
		fourthSpot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = fourthString.getText();
				outputFourth.setText(String.valueOf(userInput.charAt(3)));
			}
		});
		fourthSpot.setBounds(318, 315, 117, 29);
		contentPane.add(fourthSpot);
		
		
		checkOne = new JTextField();
		checkOne.setColumns(10);
		checkOne.setBounds(69, 417, 182, 26);
		contentPane.add(checkOne);
		
		checkTwo = new JTextField();
		checkTwo.setColumns(10);
		checkTwo.setBounds(295, 417, 182, 26);
		contentPane.add(checkTwo);
		
		JLabel outputIdentical = new JLabel("--");
		outputIdentical.setBounds(661, 422, 233, 16);
		contentPane.add(outputIdentical);
		
		JButton check = new JButton("identical?");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstString = checkOne.getText();
				String secondString = checkTwo.getText();
				
				if(firstString.equals(secondString)) {
					outputIdentical.setText("They are identical!");
				} else {
					outputIdentical.setText("They are not identical!");
				}
			}
		});
		check.setBounds(521, 414, 117, 29);
		contentPane.add(check);
		
		
		stringOne = new JTextField();
		stringOne.setBounds(69, 511, 182, 26);
		contentPane.add(stringOne);
		stringOne.setColumns(10);
		
		letter = new JTextField();
		letter.setColumns(10);
		letter.setBounds(295, 511, 47, 26);
		contentPane.add(letter);
		
		JLabel outputFound = new JLabel("--");
		outputFound.setBounds(572, 516, 271, 16);
		contentPane.add(outputFound);
		
		JButton findLetter = new JButton("letter found?");
		findLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userString = stringOne.getText();
				String userLetter = letter.getText();
				
				if(userString.indexOf(userLetter) > 0) {
					outputFound.setText("The letter is found.");
				} else {
					outputFound.setText("The letter is not found.");
				}
			}
		});
		findLetter.setBounds(424, 511, 117, 29);
		contentPane.add(findLetter);
		
		
		eightChars = new JTextField();
		eightChars.setColumns(10);
		eightChars.setBounds(69, 611, 182, 26);
		contentPane.add(eightChars);
		
		JLabel outputChars = new JLabel("--");
		outputChars.setBounds(649, 616, 110, 16);
		contentPane.add(outputChars);
		
		JButton charIndex = new JButton("characters 4 - 6");
		charIndex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = eightChars.getText().substring(3, 6);
				outputChars.setText(userInput);
			}
		});
		charIndex.setBounds(318, 611, 173, 29);
		contentPane.add(charIndex);
		
		JLabel outputReplaced = new JLabel("--");
		outputReplaced.setBounds(521, 717, 304, 16);
		contentPane.add(outputReplaced);
		
		userReplace = new JTextField();
		userReplace.setColumns(10);
		userReplace.setBounds(69, 712, 182, 26);
		contentPane.add(userReplace);
		
		JButton replaceA = new JButton("replaces a");
		replaceA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userInput = userReplace.getText();
				outputReplaced.setText(userInput.replace("a", "x"));
			}
		});
		replaceA.setBounds(318, 712, 173, 29);
		contentPane.add(replaceA);
		
	
		
	}
}
