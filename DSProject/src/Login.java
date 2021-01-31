import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 536, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 40, 500, 272);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(27, 59, 69, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(27, 111, 69, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(134, 57, 200, 20);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(134, 176, 89, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtusername.getText();
				String pass = txtpassword.getText();
				
				if(username.equals("Sasikala") && pass.equals("Sasikala98"))
				{
					Tariff t = new Tariff();
						t.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Username and password doesn't match correctly! Try again please");
				}
					
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setBounds(293, 176, 89, 38);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.GRAY);
		panel.add(btnNewButton_1);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(134, 109, 200, 20);
		panel.add(txtpassword);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\tnb(1)_0.jpg"));
		lblNewLabel_3.setBounds(10, 21, 480, 240);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBounds(125, 11, 282, 25);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel);
	}
}
