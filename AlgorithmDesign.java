import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AlgorithmDesign extends JFrame {

	private JPanel contentPane;
	private JTextField factNum;
	private JTextField primeNum;
	private JTextField fibboNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlgorithmDesign frame = new AlgorithmDesign();
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
	public AlgorithmDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("N U M B E R S");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Calibri", Font.BOLD, 25));
		title.setBounds(241, 29, 162, 48);
		contentPane.add(title);
		
		JLabel instr1 = new JLabel("Enter a number and click the button to find the factorial:");
		instr1.setFont(new Font("Calibri", Font.PLAIN, 16));
		instr1.setBounds(58, 88, 498, 53);
		contentPane.add(instr1);
		
		JLabel instr2 = new JLabel("Enter a number and click the button to determine whether or not it is a prime number:");
		instr2.setFont(new Font("Calibri", Font.PLAIN, 16));
		instr2.setBounds(58, 201, 573, 53);
		contentPane.add(instr2);
		
		JLabel instr3 = new JLabel("Enter a number and click the button to see the corresponding Fibonacci Number:");
		instr3.setFont(new Font("Calibri", Font.PLAIN, 16));
		instr3.setBounds(58, 316, 573, 53);
		contentPane.add(instr3);
		
		factNum = new JTextField();
		factNum.setBackground(new Color(255, 248, 220));
		factNum.setBounds(68, 152, 86, 20);
		contentPane.add(factNum);
		factNum.setColumns(10);
		
		primeNum = new JTextField();
		primeNum.setColumns(10);
		primeNum.setBackground(new Color(255, 248, 220));
		primeNum.setBounds(68, 275, 86, 20);
		contentPane.add(primeNum);
		
		fibboNum = new JTextField();
		fibboNum.setColumns(10);
		fibboNum.setBackground(new Color(255, 248, 220));
		fibboNum.setBounds(68, 380, 86, 20);
		contentPane.add(fibboNum);
		
		JButton factorialOf = new JButton("Factorial");
		factorialOf.setBounds(314, 151, 89, 23);
		contentPane.add(factorialOf);
		
		JButton primeOf = new JButton("Prime");
		primeOf.setBounds(314, 275, 89, 23);
		contentPane.add(primeOf);
		
		JButton fibonacciOf = new JButton("Fibonacci");
		fibonacciOf.setBounds(314, 380, 89, 23);
		contentPane.add(fibonacciOf);
	}
}
