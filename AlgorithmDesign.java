/**
 * 
 * returns factorial, whether a number is prime, and/or the Fibbonacci number at a given position in the sequence
 * 
 * due date     05/20/2022
 * @filename    AlgorithmDesign.java
 * @author      Sadiksha Dahal
 *
 **/

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlgorithmDesign extends JFrame {

	private JPanel contentPane;
	private JTextField factNum;
	private JTextField primeNum;
	private JTextField fibboNum;

	
	public static int factOf(int num) {
		

		for(int i = num - 1; i >= 1; i--) {
			
			num = num*i;	
		}
		return num;
	}
	
	
	public static String isPrime(int num) {
		
		String result = "";
		int temp;
		boolean isPrime = true;
		
		for(int i = 2; i <= num; i++) {
			temp = num % i;
			
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true) {
			result = "prime";
		} else {
			result = "not prime";
		}
		return result;
	}
	
	
	public static int fibboOf(int num) {
		
		int start = 2;
		int fibboSeq[] = new int[num + 2];
		fibboSeq[0] = 0;
		fibboSeq[1] = 1;
		
		for(int i = start; i <= num; i ++) {
			
	        fibboSeq[i] = fibboSeq[i-1] + fibboSeq[i-2];
		}
		return fibboSeq[num];
	}

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
		setBounds(100, 100, 700, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel title = new JLabel("N U M B E R S");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Calibri", Font.BOLD, 25));
		title.setBounds(180, 29, 246, 48);
		contentPane.add(title);
		
		JLabel instr1 = new JLabel("Enter a number and click the button to find the factorial:");
		instr1.setFont(new Font("Dialog", Font.PLAIN, 14));
		instr1.setBounds(58, 88, 498, 53);
		contentPane.add(instr1);
		
		JLabel instr2 = new JLabel("Enter a number and click the button to determine whether or not it is a prime number:");
		instr2.setFont(new Font("Dialog", Font.PLAIN, 14));
		instr2.setBounds(58, 201, 612, 53);
		contentPane.add(instr2);
		
		JLabel instr3 = new JLabel("Enter a number and click the button to see the corresponding Fibonacci Number:");
		instr3.setFont(new Font("Dialog", Font.PLAIN, 14));
		instr3.setBounds(58, 316, 612, 53);
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
		
		
		JLabel result1 = new JLabel("--");
		result1.setBounds(524, 153, 61, 16);
		contentPane.add(result1);
		
		JLabel result2 = new JLabel("--");
		result2.setBounds(524, 277, 61, 16);
		contentPane.add(result2);
		
		JLabel result3 = new JLabel("--");
		result3.setBounds(524, 381, 61, 16);
		contentPane.add(result3);
		
		
		JButton factorialOf = new JButton("Factorial");
		factorialOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userNum = Integer.parseInt(factNum.getText());
				int result = factOf(userNum);
				result1.setText(Integer.toString(result));
				
			}
		});
		factorialOf.setBounds(314, 151, 89, 23);
		contentPane.add(factorialOf);
		
		
		JButton primeOf = new JButton("Prime");
		primeOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userNum = Integer.parseInt(primeNum.getText());
				String result = isPrime(userNum);
				result2.setText(result);
				
			}
		});
		primeOf.setBounds(314, 275, 89, 23);
		contentPane.add(primeOf);
		
		
		JButton fibonacciOf = new JButton("Fibonacci");
		fibonacciOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userNum = Integer.parseInt(fibboNum.getText());
				int result = fibboOf(userNum);
				result3.setText(Integer.toString(result));
				
			}
		});
		fibonacciOf.setBounds(314, 380, 89, 23);
		contentPane.add(fibonacciOf);
		
	}
}

