import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class druginform extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					druginform frame = new druginform();
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
	public druginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 755);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(242, 40, 270, 54);
		getContentPane().add(panel);
		
		JLabel lblDrugInformation = new JLabel("Drug information");
		lblDrugInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblDrugInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(55, 144, 270, 54);
		getContentPane().add(panel_1);
		
		JLabel lblAvailableDrugs = new JLabel("Available drugs");
		lblAvailableDrugs.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblAvailableDrugs);
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(55, 225, 270, 71);
		getContentPane().add(panel_2);
		
		JLabel lblListOfAvailable = new JLabel("List of available drugs");
		lblListOfAvailable.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblListOfAvailable);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(55, 323, 270, 71);
		getContentPane().add(panel_2_1);
		
		JLabel lblListOfUnavailable = new JLabel("List of unavailable drugs");
		lblListOfUnavailable.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_1.add(lblListOfUnavailable);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_2_1.add(textField_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.LIGHT_GRAY);
		panel_2_2.setBounds(55, 421, 270, 71);
		getContentPane().add(panel_2_2);
		
		JLabel lblUpdateInformation = new JLabel("Update information");
		lblUpdateInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_2.add(lblUpdateInformation);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2_2.add(textField_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.LIGHT_GRAY);
		panel_2_3.setBounds(65, 515, 270, 71);
		getContentPane().add(panel_2_3);
		
		JLabel lblExpiredDrugs = new JLabel("Expired drugs");
		lblExpiredDrugs.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_3.add(lblExpiredDrugs);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_2_3.add(textField_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(Color.LIGHT_GRAY);
		panel_2_4.setBounds(472, 290, 270, 71);
		getContentPane().add(panel_2_4);
		
		JLabel lblListOfDrugs = new JLabel("List of drugs");
		lblListOfDrugs.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_4.add(lblListOfDrugs);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_2_4.add(textField_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBackground(Color.LIGHT_GRAY);
		panel_2_5.setBounds(472, 402, 270, 71);
		getContentPane().add(panel_2_5);
		
		JLabel lblPurchasingDrugs = new JLabel("Purchasing drugs");
		lblPurchasingDrugs.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2_5.add(lblPurchasingDrugs);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_2_5.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(131, 623, 96, 51);
		getContentPane().add(panel_3);
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(lblAdd);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.LIGHT_GRAY);
		panel_3_1.setBounds(277, 623, 96, 51);
		getContentPane().add(panel_3_1);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3_1.add(lblEdit);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.LIGHT_GRAY);
		panel_3_2.setBounds(422, 623, 96, 51);
		getContentPane().add(panel_3_2);
		
		JLabel lblSave = new JLabel("Save");
		lblSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3_2.add(lblSave);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.LIGHT_GRAY);
		panel_3_3.setBounds(566, 623, 96, 51);
		getContentPane().add(panel_3_3);
		
		JLabel lblExit = new JLabel("Exit");
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3_3.add(lblExit);
		
		
	}
}