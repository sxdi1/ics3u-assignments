/**
 * multiple choice quiz about random things
 * due date    20220225
 * filename    MultipleChoiceQuiz.java
 * author      Sadiksha Dahal
 */


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MultipleChoiceQuiz extends JFrame {

	String userName;

	int totalCorrect;
	int totalIncorrect;
	double percCorrect;

	final int TOTAL = 5;
	final String barelyPassed = "Wow! You have some knowledge";
	final String aboveAverage = "Yassss!! You little genius!";
	final String failed = "Somebody doesn't know a lot...";

	private JPanel contentPane;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleChoiceQuiz frame = new MultipleChoiceQuiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MultipleChoiceQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel startPanel = new JPanel();
		startPanel.setBounds(45, 46, 634, 166);
		contentPane.add(startPanel);
		startPanel.setLayout(null);

		JLabel quizTitle = new JLabel("Random Quiz!");
		quizTitle.setFont(new Font("Calibri", Font.PLAIN, 25));
		quizTitle.setBounds(227, 11, 188, 31);
		startPanel.add(quizTitle);

		JLabel quizIntro = new JLabel("Are you ready to be quizzed about random things? If so, enter your name and click start!");
		quizIntro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		quizIntro.setBounds(15, 50, 590, 24);
		startPanel.add(quizIntro);

		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(205, 85, 200, 31);
		startPanel.add(username);
		username.setColumns(10);

		JPanel firstQuestion = new JPanel();
		firstQuestion.setBounds(45, 46, 634, 166);
		contentPane.add(firstQuestion);
		firstQuestion.setLayout(null);

		JLabel question_1 = new JLabel("How many letters are in the alphabet?");
		question_1.setHorizontalAlignment(SwingConstants.CENTER);
		question_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		question_1.setBounds(10, 22, 604, 31);
		firstQuestion.add(question_1);

		JPanel secondQuestion = new JPanel();
		secondQuestion.setBounds(45, 46, 634, 180);
		contentPane.add(secondQuestion);
		secondQuestion.setLayout(null);

		JLabel question_2 = new JLabel("Which of the following is not a subatomic particle?");
		question_2.setHorizontalAlignment(SwingConstants.CENTER);
		question_2.setFont(new Font("Calibri", Font.PLAIN, 23));
		question_2.setBounds(10, 11, 604, 31);
		secondQuestion.add(question_2);

		JPanel thirdQuestion = new JPanel();
		thirdQuestion.setBounds(45, 46, 634, 191);
		contentPane.add(thirdQuestion);
		thirdQuestion.setLayout(null);

		JLabel question_3 = new JLabel("What is the name of Avatar Aang's bison?");
		question_3.setHorizontalAlignment(SwingConstants.CENTER);
		question_3.setFont(new Font("Calibri", Font.PLAIN, 25));
		question_3.setBounds(10, 11, 604, 31);
		thirdQuestion.add(question_3);

		JPanel fourthQuestion = new JPanel();
		fourthQuestion.setBounds(45, 46, 634, 191);
		contentPane.add(fourthQuestion);
		fourthQuestion.setLayout(null);

		JLabel question_4 = new JLabel("Fill in the blanks: \"nice guys finish ___ , that's why I'll treat you like ____\"");
		question_4.setHorizontalAlignment(SwingConstants.CENTER);
		question_4.setFont(new Font("Calibri", Font.PLAIN, 16));
		question_4.setBounds(10, 11, 614, 31);
		fourthQuestion.add(question_4);

		JPanel fifthQuestion = new JPanel();
		fifthQuestion.setBounds(45, 46, 634, 171);
		contentPane.add(fifthQuestion);
		fifthQuestion.setLayout(null);

		JLabel question_5 = new JLabel("What question is this?");
		question_5.setHorizontalAlignment(SwingConstants.CENTER);
		question_5.setFont(new Font("Calibri", Font.PLAIN, 25));
		question_5.setBounds(10, 11, 604, 31);
		fifthQuestion.add(question_5);

		JPanel result = new JPanel();
		result.setBounds(96, 46, 523, 267);
		contentPane.add(result);
		result.setLayout(null);

		JLabel numCor = new JLabel("");
		numCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numCor.setBounds(45, 155, 500, 25);
		result.add(numCor);

		JLabel numIncor = new JLabel("");
		numIncor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		numIncor.setBounds(45, 191, 500, 25);
		result.add(numIncor);

		JButton start = new JButton("Start Quiz");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startPanel.setVisible(false);
				firstQuestion.setVisible(true);
				userName = username.getText();
			}
		});
		start.setBounds(250, 127, 100, 28);
		startPanel.add(start);

		JButton twentyOne = new JButton("21");
		twentyOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		twentyOne.setBounds(155, 64, 89, 23);
		firstQuestion.add(twentyOne);

		JButton twentyNine = new JButton("29");
		twentyNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		twentyNine.setBounds(363, 64, 89, 23);
		firstQuestion.add(twentyNine);

		JButton yes = new JButton("Yes");
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
			}
		});
		yes.setBounds(155, 114, 89, 23);
		firstQuestion.add(yes);

		JButton eleven = new JButton("11");
		eleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstQuestion.setVisible(false);
				secondQuestion.setVisible(true);
				totalCorrect++;
			}
		});
		eleven.setBounds(363, 114, 89, 23);
		firstQuestion.add(eleven);

		JButton electron = new JButton("Electron");
		electron.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		electron.setBounds(156, 61, 89, 23);
		secondQuestion.add(electron);

		JButton nucleus = new JButton("Nucleus");
		nucleus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
				totalCorrect++;
			}
		});
		nucleus.setBounds(367, 61, 89, 23);
		secondQuestion.add(nucleus);

		JButton proton = new JButton("Proton");
		proton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		proton.setBounds(156, 116, 89, 23);
		secondQuestion.add(proton);

		JButton neutron = new JButton("Neutron");
		neutron.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondQuestion.setVisible(false);
				thirdQuestion.setVisible(true);
			}
		});
		neutron.setBounds(367, 116, 89, 23);
		secondQuestion.add(neutron);

		JButton momo = new JButton("Momo");
		momo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		momo.setBounds(155, 67, 89, 23);
		thirdQuestion.add(momo);

		JButton appa = new JButton("Appa");
		appa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
				totalCorrect++;
			}
		});
		appa.setBounds(368, 67, 89, 23);
		thirdQuestion.add(appa);

		JButton yipyip = new JButton("YipYip");
		yipyip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		yipyip.setBounds(155, 125, 89, 23);
		thirdQuestion.add(yipyip);

		JButton stinky = new JButton("Stinky");
		stinky.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thirdQuestion.setVisible(false);
				fourthQuestion.setVisible(true);
			}
		});
		stinky.setBounds(368, 125, 89, 23);
		thirdQuestion.add(stinky);

		JButton fastGarbage = new JButton("fast, garbage");
		fastGarbage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		fastGarbage.setBounds(140, 69, 123, 23);
		fourthQuestion.add(fastGarbage);

		JButton lastTrash = new JButton("last, trash");
		lastTrash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
				totalCorrect++;
			}
		});
		lastTrash.setBounds(140, 119, 123, 23);
		fourthQuestion.add(lastTrash);

		JButton firstHer = new JButton("first, her");
		firstHer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		firstHer.setBounds(353, 69, 123, 23);
		fourthQuestion.add(firstHer);

		JButton firstThat = new JButton("first, that");
		firstThat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourthQuestion.setVisible(false);
				fifthQuestion.setVisible(true);
			}
		});
		firstThat.setBounds(353, 119, 123, 23);
		fourthQuestion.add(firstThat);

		JLabel resultTitle = new JLabel("");
		resultTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultTitle.setBounds(82, 11, 334, 31);
		result.add(resultTitle);

		JButton theFifth = new JButton("The fifth");
		theFifth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				result.setVisible(true);
				resultTitle.setText("Okay, " + userName + "!");
				totalCorrect++;
			}
		});
		theFifth.setBounds(137, 53, 123, 23);
		fifthQuestion.add(theFifth);

		JButton theFourth = new JButton("The fourth");
		theFourth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				result.setVisible(true);
				resultTitle.setText("Okay, " + userName + "!");
			}
		});
		theFourth.setBounds(383, 53, 123, 23);
		fifthQuestion.add(theFourth);

		JButton theSixth = new JButton("The sixth");
		theSixth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				result.setVisible(true);
				resultTitle.setText("Okay, " + userName);
			}
		});
		theSixth.setBounds(137, 117, 123, 23);
		fifthQuestion.add(theSixth);

		JButton no = new JButton("No");
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fifthQuestion.setVisible(false);
				result.setVisible(true);
				resultTitle.setText("Okay, " + userName);
			}
		});
		no.setBounds(383, 117, 123, 23);
		fifthQuestion.add(no);

		JLabel comment = new JLabel("");
		comment.setHorizontalAlignment(SwingConstants.CENTER);
		comment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comment.setBounds(10, 227, 503, 29);
		result.add(comment);

		JLabel percent = new JLabel("");
		percent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		percent.setBounds(45, 116, 417, 25);
		result.add(percent);

		JButton getResult = new JButton("Click to see how you did!");
		getResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numCor.setText("Number of questions answered correctly: " + String.valueOf(totalCorrect));
				numIncor.setText("Number of questions answered incorrectly: " + String.valueOf(TOTAL - totalCorrect));

				percCorrect = ((double) totalCorrect / (double) TOTAL) * 100;

				DecimalFormat df = new DecimalFormat("###.##");
				percent.setText("Result: " + df.format(percCorrect) + "%");
				
				if(percCorrect < 50) {
					comment.setText(failed);
				} else if(percCorrect > 50 && percCorrect < 70) {
					comment.setText(barelyPassed);
				} else {
					comment.setText(aboveAverage);
				}

			}
		});
		getResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getResult.setBounds(143, 66, 220, 25);
		result.add(getResult);
		
	
		firstQuestion.setVisible(false);
		secondQuestion.setVisible(false);
		thirdQuestion.setVisible(false);
		fourthQuestion.setVisible(false);
		fifthQuestion.setVisible(false);
		result.setVisible(false);

	}
}