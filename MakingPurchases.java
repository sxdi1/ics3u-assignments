/**
 * calculates the cost of purchasing pringles
 * due date    20220218
 * filename    MakingPurchases.java
 * author      Sadiksha Dahal
 */



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class MakingPurchases extends JFrame {

	private JPanel contentPane;
	private JTextField txtOriginal;
	private JTextField txtBBQ;
	private JTextField txtPizza;
	private JTextField txtJalapeno;
	private JTextField txtHonMustard;
	private JTextField txtCheeseburg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakingPurchases frame = new MakingPurchases();
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
	public MakingPurchases() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(176, 196, 222));
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(6, 6, 638, 566);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStoreName = new JLabel("Pringle Paradise");
		lblStoreName.setForeground(new Color(25, 25, 112));
		lblStoreName.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
		lblStoreName.setBounds(199, 6, 245, 54);
		panel.add(lblStoreName);
		
		JLabel lblInstructions = new JLabel("How many cans of each pringle flavor would you like to purchase?");
		lblInstructions.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblInstructions.setForeground(new Color(25, 25, 112));
		lblInstructions.setBounds(79, 47, 526, 60);
		panel.add(lblInstructions);
		
		JLabel lblOriginal = new JLabel("Original $2.00");
		lblOriginal.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblOriginal.setForeground(new Color(0, 100, 0));
		lblOriginal.setBounds(66, 95, 133, 35);
		panel.add(lblOriginal);
		
		JLabel lblBBQ = new JLabel("Barbecue $2.50");
		lblBBQ.setForeground(new Color(0, 100, 0));
		lblBBQ.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblBBQ.setBounds(66, 149, 144, 35);
		panel.add(lblBBQ);
		
		JLabel lblPizza = new JLabel("Pizza $2.99");
		lblPizza.setForeground(new Color(0, 100, 0));
		lblPizza.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPizza.setBounds(66, 208, 133, 35);
		panel.add(lblPizza);
		
		JLabel lblJalapeno = new JLabel("Jalapeno $2.50");
		lblJalapeno.setForeground(new Color(0, 100, 0));
		lblJalapeno.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblJalapeno.setBounds(292, 95, 181, 35);
		panel.add(lblJalapeno);
		
		JLabel lblHonMustard = new JLabel("Honey Mustard $2.60");
		lblHonMustard.setForeground(new Color(0, 100, 0));
		lblHonMustard.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblHonMustard.setBounds(292, 149, 197, 35);
		panel.add(lblHonMustard);
		
		JLabel lblCheeseburg = new JLabel("Cheeseburger $2.99");
		lblCheeseburg.setForeground(new Color(0, 100, 0));
		lblCheeseburg.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblCheeseburg.setBounds(292, 208, 197, 35);
		panel.add(lblCheeseburg);
		
		txtOriginal = new JTextField();
		txtOriginal.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtOriginal.setText("0");
		txtOriginal.setForeground(new Color(0, 0, 0));
		txtOriginal.setBackground(new Color(255, 255, 240));
		txtOriginal.setBounds(212, 95, 68, 26);
		panel.add(txtOriginal);
		txtOriginal.setColumns(10);
		
		txtBBQ = new JTextField();
		txtBBQ.setText("0");
		txtBBQ.setForeground(Color.BLACK);
		txtBBQ.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtBBQ.setColumns(10);
		txtBBQ.setBackground(new Color(255, 255, 240));
		txtBBQ.setBounds(212, 149, 68, 26);
		panel.add(txtBBQ);
		
		txtPizza = new JTextField();
		txtPizza.setText("0");
		txtPizza.setForeground(Color.BLACK);
		txtPizza.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtPizza.setColumns(10);
		txtPizza.setBackground(new Color(255, 255, 240));
		txtPizza.setBounds(212, 208, 68, 26);
		panel.add(txtPizza);
		
		txtJalapeno = new JTextField();
		txtJalapeno.setText("0");
		txtJalapeno.setForeground(Color.BLACK);
		txtJalapeno.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtJalapeno.setColumns(10);
		txtJalapeno.setBackground(new Color(255, 255, 240));
		txtJalapeno.setBounds(501, 95, 68, 26);
		panel.add(txtJalapeno);
		
		txtHonMustard = new JTextField();
		txtHonMustard.setText("0");
		txtHonMustard.setForeground(Color.BLACK);
		txtHonMustard.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtHonMustard.setColumns(10);
		txtHonMustard.setBackground(new Color(255, 255, 240));
		txtHonMustard.setBounds(501, 149, 68, 26);
		panel.add(txtHonMustard);
		
		txtCheeseburg = new JTextField();
		txtCheeseburg.setText("0");
		txtCheeseburg.setForeground(Color.BLACK);
		txtCheeseburg.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtCheeseburg.setColumns(10);
		txtCheeseburg.setBackground(new Color(255, 255, 240));
		txtCheeseburg.setBounds(501, 208, 68, 26);
		panel.add(txtCheeseburg);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setIcon(new ImageIcon("./pringles.jpg"));
		lblImage.setBounds(29, 267, 206, 145);
		panel.add(lblImage);
		
		JLabel lblTaxes = new JLabel("Taxes (13%): ");
		lblTaxes.setForeground(new Color(0, 0, 139));
		lblTaxes.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTaxes.setBounds(314, 267, 108, 16);
		panel.add(lblTaxes);
		
		JLabel lblSubtotal = new JLabel("Subtotal: ");
		lblSubtotal.setForeground(new Color(0, 0, 139));
		lblSubtotal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblSubtotal.setBounds(314, 312, 108, 16);
		panel.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setForeground(new Color(0, 0, 139));
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTotal.setBounds(314, 358, 108, 16);
		panel.add(lblTotal);
		
		JLabel lblTaxCost = new JLabel("$0.00");
		lblTaxCost.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTaxCost.setForeground(new Color(0, 0, 139));
		lblTaxCost.setBounds(460, 267, 84, 16);
		panel.add(lblTaxCost);
		
		JLabel lblSubtotalCost = new JLabel("$0.00");
		lblSubtotalCost.setForeground(new Color(0, 0, 139));
		lblSubtotalCost.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblSubtotalCost.setBounds(460, 312, 84, 16);
		panel.add(lblSubtotalCost);
		
		JLabel lblTotalCost = new JLabel("$0.00");
		lblTotalCost.setForeground(new Color(0, 0, 139));
		lblTotalCost.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTotalCost.setBounds(460, 359, 84, 16);
		panel.add(lblTotalCost);
		
		JLabel lblConfirmation = new JLabel("");
		lblConfirmation.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblConfirmation.setBounds(212, 483, 261, 35);
		panel.add(lblConfirmation);
		
		JButton btnCalculate = new JButton("calculate cost!");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				final double TAX_RATE = 0.13;
				final double ORIGINAL_COST = 2.00;
				final double BBQ_COST = 2.50;
				final double PIZZA_COST = 2.99;
				final double JALAPENO_COST = 2.50;
				final double HONMUSTARD_COST = 2.60;
				final double CHEESEBURG_COST = 2.99;
				
				double originalNum = Double.parseDouble(txtOriginal.getText());
				double bbqNum = Double.parseDouble(txtBBQ.getText());
				double pizzaNum = Double.parseDouble(txtPizza.getText());
				double jalapenoNum = Double.parseDouble(txtJalapeno.getText());
				double honMustardNum = Double.parseDouble(txtHonMustard.getText());
				double cheeseburgNum = Double.parseDouble(txtCheeseburg.getText());								
				
				double subtotal = (originalNum*ORIGINAL_COST)+(bbqNum*BBQ_COST)+(pizzaNum*PIZZA_COST)+(jalapenoNum*JALAPENO_COST)+(honMustardNum*HONMUSTARD_COST)+(cheeseburgNum*CHEESEBURG_COST);		
				double tax = subtotal*TAX_RATE;
				double total = subtotal + tax;
				
				DecimalFormat df = new DecimalFormat("###.##");
				
				lblTaxCost.setText("$"+df.format(tax));
				lblSubtotalCost.setText("$"+df.format(subtotal));
				lblTotalCost.setText("$"+df.format(total));
				lblConfirmation.setText("Enjoy your pringles!!");
				
			}
		});
		btnCalculate.setBounds(355, 401, 117, 29);
		panel.add(btnCalculate);
		
		
	}
}
