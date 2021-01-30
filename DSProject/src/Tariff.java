import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tariff extends JFrame {

	private JPanel contentPane;
	private JTextField tfcurrentcharge;
	protected Object tc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tariff frame = new Tariff();
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
	public Tariff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfcurrentcharge = new JTextField();
		tfcurrentcharge.setBounds(150, 27, 86, 20);
		contentPane.add(tfcurrentcharge);
		tfcurrentcharge.setColumns(10);
		
		JLabel lblcc = new JLabel("Current charge");
		lblcc.setBounds(58, 30, 82, 14);
		contentPane.add(lblcc);
		
		JButton btncalc = new JButton("calculate");
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double currentcharge = Double.parseDouble(tfcurrentcharge.getText());
			}
		});
		btncalc.setBounds(104, 100, 89, 23);
		contentPane.add(btncalc);
		
		JButton btnNewButton = new JButton("Billing system");
		btnNewButton.setBounds(147, 203, 89, 23);
		contentPane.add(btnNewButton);
	}
}
