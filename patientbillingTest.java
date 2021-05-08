import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.junit.Test;

public class patientbillingTest {

	@Test
	public void test() {
		@SuppressWarnings({ "unused", "serial" })
		class patientbilling extends JFrame {

			private JPanel contentPane;
			private JTextField textField;
			private JTextField textField_2;
			private JTextField textField_3;
			private JTextField textField_4;
			private JTextField textField_5;
			private JTextField textField_1;

			/**
			 * Launch the application.
			 */
			public void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							patientbilling frame = new patientbilling();
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
			public patientbilling() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(0, 0, 1273, 763);
				contentPane = new JPanel();
				contentPane.setForeground(Color.GRAY);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBackground(Color.LIGHT_GRAY);
				panel.setBounds(329, 26, 446, 59);
				contentPane.add(panel);
				
				JLabel lblPatientBillingForm = new JLabel("Patient Billing Form");
				lblPatientBillingForm.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel.add(lblPatientBillingForm);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.LIGHT_GRAY);
				panel_1.setBounds(59, 168, 446, 59);
				contentPane.add(panel_1);
				
				JLabel lblPatientId = new JLabel("Patient Id");
				lblPatientId.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1.add(lblPatientId);
				
				textField = new JTextField();
				panel_1.add(textField);
				textField.setColumns(10);
				
				JPanel panel_1_1 = new JPanel();
				panel_1_1.setBackground(Color.LIGHT_GRAY);
				panel_1_1.setBounds(59, 262, 446, 59);
				contentPane.add(panel_1_1);
				
				JLabel lblRoomCharges = new JLabel("Room Charges");
				lblRoomCharges.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1_1.add(lblRoomCharges);
				
				textField_1 = new JTextField();
				panel_1_1.add(textField_1);
				textField_1.setColumns(10);
				
				JPanel panel_1_2 = new JPanel();
				panel_1_2.setBackground(Color.LIGHT_GRAY);
				panel_1_2.setBounds(59, 360, 446, 59);
				contentPane.add(panel_1_2);
				
				JLabel lblTotal = new JLabel("Total");
				lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1_2.add(lblTotal);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				panel_1_2.add(textField_2);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(Color.LIGHT_GRAY);
				panel_2.setBounds(61, 508, 123, 59);
				contentPane.add(panel_2);
				
				JLabel lblNewLabel = new JLabel("Add");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2.add(lblNewLabel);
				
				JPanel panel_2_1 = new JPanel();
				panel_2_1.setBackground(Color.LIGHT_GRAY);
				panel_2_1.setBounds(236, 508, 123, 59);
				contentPane.add(panel_2_1);
				
				JLabel lblEdit = new JLabel("Edit");
				lblEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_1.add(lblEdit);
				
				JPanel panel_2_2 = new JPanel();
				panel_2_2.setBackground(Color.LIGHT_GRAY);
				panel_2_2.setBounds(404, 508, 123, 59);
				contentPane.add(panel_2_2);
				
				JLabel lblSave = new JLabel("Save");
				lblSave.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_2.add(lblSave);
				
				JPanel panel_1_3 = new JPanel();
				panel_1_3.setBackground(Color.LIGHT_GRAY);
				panel_1_3.setBounds(702, 168, 446, 59);
				contentPane.add(panel_1_3);
				
				JLabel lblPharmacyBill = new JLabel("Pharmacy Bill");
				lblPharmacyBill.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1_3.add(lblPharmacyBill);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				panel_1_3.add(textField_3);
				
				JPanel panel_1_4 = new JPanel();
				panel_1_4.setBackground(Color.LIGHT_GRAY);
				panel_1_4.setBounds(702, 274, 446, 59);
				contentPane.add(panel_1_4);
				
				JLabel lblCheckTheRecorded = new JLabel("Check the recorded bills");
				lblCheckTheRecorded.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1_4.add(lblCheckTheRecorded);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				panel_1_4.add(textField_4);
				
				JPanel panel_1_5 = new JPanel();
				panel_1_5.setBackground(Color.LIGHT_GRAY);
				panel_1_5.setBounds(713, 371, 446, 59);
				contentPane.add(panel_1_5);
				
				JLabel lblMonthlyStatementOf = new JLabel("Monthly statement of finance");
				lblMonthlyStatementOf.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_1_5.add(lblMonthlyStatementOf);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				panel_1_5.add(textField_5);
				
				JPanel panel_2_3 = new JPanel();
				panel_2_3.setBackground(Color.LIGHT_GRAY);
				panel_2_3.setBounds(667, 508, 123, 59);
				contentPane.add(panel_2_3);
				
				JLabel lblNewLabel_1 = new JLabel("Add");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_3.add(lblNewLabel_1);
				
				JPanel panel_2_1_1 = new JPanel();
				panel_2_1_1.setBackground(Color.LIGHT_GRAY);
				panel_2_1_1.setBounds(812, 508, 123, 59);
				contentPane.add(panel_2_1_1);
				
				JLabel lblEdit_1 = new JLabel("Edit");
				lblEdit_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_1_1.add(lblEdit_1);
				
				JPanel panel_2_2_1 = new JPanel();
				panel_2_2_1.setBackground(Color.LIGHT_GRAY);
				panel_2_2_1.setBounds(959, 508, 123, 59);
				contentPane.add(panel_2_2_1);
				
				JLabel lblSave_1 = new JLabel("Save");
				lblSave_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_2_1.add(lblSave_1);
				
				JPanel panel_2_2_2 = new JPanel();
				panel_2_2_2.setBackground(Color.LIGHT_GRAY);
				panel_2_2_2.setBounds(1101, 508, 123, 59);
				contentPane.add(panel_2_2_2);
				
				JLabel lblExit = new JLabel("Exit");
				lblExit.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel_2_2_2.add(lblExit);
			}
		}
	}

}
