import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class QuizAttempt extends JFrame {
	
	String userName;
	
	int corTotal = 0;
	int incorTotal = 0;
	
	int buttonPress = 0;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizAttempt frame = new QuizAttempt();
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
	public QuizAttempt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JPanel firstQuestion = new JPanel();
		firstQuestion.setBounds(6, 6, 564, 151);
		contentPane.add(firstQuestion);
		firstQuestion.setLayout(null);
		
		JLabel question1 = new JLabel("#1. Which of the following is not a subatomic particle?");
		question1.setHorizontalAlignment(SwingConstants.CENTER);
		question1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		question1.setBounds(28, 39, 508, 35);
		firstQuestion.add(question1);
		
		
		
		
		
		JButton nucleus = new JButton("Nucleus");
		nucleus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				corTotal ++;
				buttonPress++;

				//firstQuestion.setVisible(false);
			}
		});
		nucleus.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		nucleus.setBounds(92, 86, 117, 29);
		firstQuestion.add(nucleus);
		
		JPanel secondQ = new JPanel();
		secondQ.setBounds(0, 169, 564, 151);
		contentPane.add(secondQ);
		secondQ.setLayout(null);
		
		JLabel lblWhoIsPrime = new JLabel("who is prime miniser");
		lblWhoIsPrime.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhoIsPrime.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblWhoIsPrime.setBounds(22, 18, 508, 35);
		secondQ.add(lblWhoIsPrime);
		
	
		
		JPanel thirdQ = new JPanel();
		thirdQ.setBounds(6, 332, 564, 141);
		contentPane.add(thirdQ);
		thirdQ.setLayout(null);
		
		JLabel lblWhatLangugeIs = new JLabel("what languge is this coded in");
		lblWhatLangugeIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatLangugeIs.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblWhatLangugeIs.setBounds(20, 6, 508, 35);
		thirdQ.add(lblWhatLangugeIs);
		
		
		JButton neutron = new JButton("Neutron");
		neutron.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				incorTotal ++;
				//firstQuestion.setVisible(false);
				//secondQ.setVisible(true);
			}
		});
		neutron.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		neutron.setBounds(372, 86, 117, 29);
		firstQuestion.add(neutron);
		
		JPanel result = new JPanel();
		result.setBounds(567, 165, 77, 155);
		contentPane.add(result);
		result.setLayout(null);
		
		JLabel correct = new JLabel("New label");
		correct.setBounds(6, 31, 61, 16);
		result.add(correct);
		
		JLabel notCorrect = new JLabel("New label");
		notCorrect.setBounds(0, 0, 61, 16);
		result.add(notCorrect);
		
		JLabel perc = new JLabel("New label");
		perc.setBounds(10, 99, 61, 16);
		result.add(perc);
		
		JButton btnFord = new JButton("ford");
		btnFord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				incorTotal++;
				//secondQ.setVisible(false);
				//thirdQ.setVisible(true);
			}
		});
		btnFord.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnFord.setBounds(54, 80, 117, 29);
		secondQ.add(btnFord);
		
		JButton trudeau = new JButton("trudeau");
		trudeau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				corTotal++;
				//secondQ.setVisible(false);
				//thirdQ.setVisible(true);
			}
		});
		trudeau.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		trudeau.setBounds(369, 81, 117, 29);
		secondQ.add(trudeau);
		
		JButton btnJava = new JButton("java");
		btnJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				corTotal++;
			}
		});
		btnJava.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnJava.setBounds(42, 53, 117, 29);
		thirdQ.add(btnJava);
		
		JButton btnPython = new JButton("python");
		btnPython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				incorTotal++;
			}
		});
		btnPython.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnPython.setBounds(347, 54, 117, 29);
		thirdQ.add(btnPython);
		
		correct.setText(String.valueOf(corTotal));
		notCorrect.setText(String.valueOf(incorTotal));
	
		}
	}

