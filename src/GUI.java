import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI {

	private JFrame frmCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNumber_1;
	private JTextField textField_2;

	int num1;
	int num2;

	int result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10.0, 2.0));
		System.out.println(calculator.subtract(10.0, 2.0));
		System.out.println(calculator.multiply(10.0, 2.0));
		System.out.println(calculator.divide(10.0, 2.0));
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(154, 53, 114, 19);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(154, 84, 114, 19);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNumber = new JLabel("number 1");
		lblNumber.setBounds(55, 53, 70, 15);
		frmCalculator.getContentPane().add(lblNumber);

		lblNumber_1 = new JLabel("number 2");
		lblNumber_1.setBounds(55, 87, 70, 15);
		frmCalculator.getContentPane().add(lblNumber_1);

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				int result = num1 + num2;
				textField_2.setText(String.valueOf(result));
			
			}
		});
		button.setBounds(109, 188, 44, 19);
		frmCalculator.getContentPane().add(button);

		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				int result = num1 - num2;
				textField_2.setText(String.valueOf(result));
			}
		});
		button_1.setBounds(165, 188, 44, 19);
		frmCalculator.getContentPane().add(button_1);

		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				int result = num1 * num2;
				textField_2.setText(String.valueOf(result));
			}
		});
		button_2.setBounds(224, 188, 44, 19);
		frmCalculator.getContentPane().add(button_2);

		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText());
				num2 = Integer.parseInt(textField_1.getText());
				int result = num1 / num2;
				textField_2.setText(String.valueOf(result));
			}
		});
		button_3.setBounds(286, 188, 44, 19);
		frmCalculator.getContentPane().add(button_3);

		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(55, 124, 70, 15);
		frmCalculator.getContentPane().add(lblResult);

		textField_2 = new JTextField();
		textField_2.setBounds(154, 122, 114, 19);
		frmCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
