import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI implements ActionListener {

	Calculator calculator = new Calculator();

	private JFrame frmCalculator;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JLabel lblNumber1 = new JLabel("number 1");
	private JLabel lblNumber2 = new JLabel("number 2");
	private JLabel lblResult = new JLabel("result");

	int num1;
	int num2;
	int result;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {

	// Calculator calculator = new Calculator();

	// System.out.println(calculator.add(10.0, 2.0));
	// System.out.println(calculator.subtract(10.0, 2.0));
	// System.out.println(calculator.multiply(10.0, 2.0));
	// System.out.println(calculator.divide(10.0, 2.0));

	/**
	 * Create the application.
	 */

	public GUI() {
		createGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createGUI() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.getContentPane().setBackground(Color.PINK);

		btnAdd.setBounds(109, 188, 44, 19);
		btnSubtract.setBounds(165, 188, 44, 19);
		btnMultiply.setBounds(224, 188, 44, 19);
		btnDivide.setBounds(286, 188, 44, 19);
		lblNumber1.setBounds(55, 53, 70, 15);
		lblNumber2.setBounds(55, 87, 70, 15);
		lblResult.setBounds(55, 124, 70, 15);
		textField1.setBounds(154, 53, 114, 19);
		textField2.setBounds(154, 84, 114, 19);
		textField3.setBounds(154, 122, 114, 19);

		textField1 = new JTextField();

		textField2 = new JTextField();

		textField3 = new JTextField();
		
	}

	public void addComponentsToFrame() {
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);
		frmCalculator.getContentPane().add(lblNumber1);
		frmCalculator.getContentPane().add(lblNumber2);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(textField1);
		frmCalculator.getContentPane().add(textField2);
		frmCalculator.getContentPane().add(textField3);

	}

	public void addActionListeners() {

		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAdd) {

			num1 = Integer.parseInt(textField1.getText());
			num2 = Integer.parseInt(textField2.getText());
			int result = num1 + num2;
			textField3.setText(String.valueOf(result));

		}

		if (e.getSource() == btnSubtract) {

			num1 = Integer.parseInt(textField1.getText());
			num2 = Integer.parseInt(textField2.getText());
			int result = num1 - num2;
			textField3.setText(String.valueOf(result));

		}

		if (e.getSource() == btnMultiply) {

			num1 = Integer.parseInt(textField1.getText());
			num2 = Integer.parseInt(textField2.getText());
			int result = num1 * num2;
			textField3.setText(String.valueOf(result));

		}
		if (e.getSource() == btnDivide) {

			num1 = Integer.parseInt(textField1.getText());
			num2 = Integer.parseInt(textField2.getText());
			int result = num1 / num2;
			textField3.setText(String.valueOf(result));

		}
	}
}
