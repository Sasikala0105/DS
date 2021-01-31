import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tariff extends JFrame {

	private JPanel contentPane;
	private JTable table;


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
		setBounds(100, 100, 606, 398);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ELECTRICITY TARIFF", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 179, 570, 103);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(new Color(255, 192, 203));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1-200", new Double(0.218), new Integer(200)},
				{"201-300", new Double(0.334), new Integer(100)},
				{"301-600", new Double(0.516), new Integer(300)},
				{"601-900", new Double(0.546), new Integer(300)},
				{"901 dan ke atas", "0.571", null},
			},
			new String[] {
				"Electricity Consumption(kWh)", "Tariff Rate(RM)", "Electricity Consumption Unit(kWh)"
			}
		));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\Tenaga-Portfolio-logo.jpg"));
		lblNewLabel.setBounds(121, 11, 356, 150);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("TNB BILLING SYSTEM");
		btnNewButton.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "You will be directed to our billing system.");
				BillGUI bg = new BillGUI();
				bg.setVisible(true);
		        }
		
			
		});
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(213, 311, 159, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Electricity Tariff Information");
		lblNewLabel_1.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(21, 164, 167, 14);
		contentPane.add(lblNewLabel_1);
	}
}
