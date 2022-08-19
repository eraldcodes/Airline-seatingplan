import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Boing extends JFrame {
/////////////////////////////		Declaration of different type of variables and components in the code      /////////////////////////////

	private JPanel E_10;
	private JTextField txtFirstclassSeats;
	private JTextField textField_1;
	private JTextField txtBusinessClassSeats;
	private JTextField txtBoeingSeatingplan;
	public int BoingAvelablebooking = 84,impNOticketsSelected,ticketno,seating=NumberofPassangers.getseat(),a;
	private JTextField txtDuration;

	

///////////////////////////// SeatSelect() is a method that gets number of tickets and runs untill there is no tickets left /////////////////////////////

	
///////////////////////////// SeatSelect() is a method that gets number of tickets and runs untill there is no tickets left /////////////////////////////
private void SeatSelect() {
String NOticketsSelectedstring = (String) NumberofPassangers.ticketSelectionComboBox.getItemAt(NumberofPassangers.ticketSelectionComboBox.getSelectedIndex());
NumberofPassangers.impNOticketsSelected = Integer.parseInt(NOticketsSelectedstring);


if (NumberofPassangers.ticketSelectionComboBox.getSelectedIndex() > 0) {

NumberofPassangers.impNOticketsSelected = NumberofPassangers.impNOticketsSelected - 1;

BoingAvelablebooking = BoingAvelablebooking - 1;

JOptionPane.showMessageDialog(null, "You succesfully selected the seat");
setEnabled(false);

} else {
JOptionPane.showMessageDialog(null, " You Have booked all your tickets");
}

}

	/**
	 * Launch the application .
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boing frame = new Boing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
/////////////////////////////		Source code for different GUI components which explains how it would look and shows how it would interact     /////////////////////////////

	public Boing() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1274, 1155);
		E_10 = new JPanel();
		E_10.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(E_10);
		E_10.setLayout(null);

		JPanel Menu = new JPanel();
		Menu.setBounds(301, 11, 904, 99);
		E_10.add(Menu);
		Menu.setLayout(null);

		JButton btnNewButton = new JButton("Felights");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setBounds(0, 24, 89, 56);
		Menu.add(btnNewButton);

		JButton btnSeatingPlan = new JButton("Seating Plan");
		btnSeatingPlan.setBackground(new Color(255, 160, 122));
		btnSeatingPlan.setBounds(88, 24, 115, 56);
		Menu.add(btnSeatingPlan);

		JButton btnPassengers = new JButton("Passengers");
		btnPassengers.setBackground(new Color(255, 160, 122));
		btnPassengers.setBounds(201, 24, 113, 56);
		Menu.add(btnPassengers);

		JButton btnShop = new JButton("Shop");
		btnShop.setBackground(new Color(255, 160, 122));
		btnShop.setBounds(313, 24, 75, 56);
		Menu.add(btnShop);

		JButton btnRestorant = new JButton("Restorant");
		btnRestorant.setBackground(new Color(255, 160, 122));
		btnRestorant.setBounds(387, 24, 98, 56);
		Menu.add(btnRestorant);

		JButton btnFinance = new JButton("einances");
		btnFinance.setBackground(new Color(255, 160, 122));
		btnFinance.setBounds(483, 24, 95, 56);
		Menu.add(btnFinance);

		JButton btnFlightArrivals = new JButton("elight Arrival Map");
		btnFlightArrivals.setBackground(new Color(255, 160, 122));
		btnFlightArrivals.setBounds(576, 24, 140, 56);
		Menu.add(btnFlightArrivals);

		JButton btnFlightDepartureMap = new JButton("elight Departure Map");
		btnFlightDepartureMap.setBackground(new Color(255, 160, 122));
		btnFlightDepartureMap.setBounds(716, 24, 165, 56);
		Menu.add(btnFlightDepartureMap);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SLL727\\Desktop\\CS1701 Group Project Lectures and Tutorials (A 20212)\\Seat planing Project\\Images\\unnamed.png"));
		lblNewLabel.setBounds(-20, 11, 307, 120);
		E_10.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 121, 1178, 2);
		E_10.add(separator);

		txtFirstclassSeats = new JTextField();
		txtFirstclassSeats.setText("First-class Seats");
		txtFirstclassSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstclassSeats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFirstclassSeats.setColumns(10);
		txtFirstclassSeats.setBackground(new Color(255, 127, 80));
		txtFirstclassSeats.setBounds(114, 311, 1027, 25);
		E_10.add(txtFirstclassSeats);

		textField_1 = new JTextField();
		textField_1.setText("Economy Class Seats");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 127, 80));
		textField_1.setBounds(114, 597, 1027, 25);
		E_10.add(textField_1);

		txtBusinessClassSeats = new JTextField();
		txtBusinessClassSeats.setText("Business Class Seats");
		txtBusinessClassSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtBusinessClassSeats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBusinessClassSeats.setColumns(10);
		txtBusinessClassSeats.setBackground(new Color(255, 127, 80));
		txtBusinessClassSeats.setBounds(114, 415, 1027, 25);
		E_10.add(txtBusinessClassSeats);

		txtBoeingSeatingplan = new JTextField();
		txtBoeingSeatingplan.setText("Boeing 747 Seating Plan");
		txtBoeingSeatingplan.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoeingSeatingplan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBoeingSeatingplan.setColumns(10);
		txtBoeingSeatingplan.setBackground(Color.RED);
		txtBoeingSeatingplan.setBounds(114, 175, 1027, 31);
		E_10.add(txtBoeingSeatingplan);

		JButton A_17 = new JButton("b1");
		A_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket b1");
				A_17.setEnabled(false);
			}
		});
		A_17.setBounds(337, 347, 89, 23);
		E_10.add(A_17);

		JButton A_1_1 = new JButton("b2");
		A_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket b2");
				 A_1_1.setEnabled(false);
			}
		});
		A_1_1.setBounds(337, 381, 89, 23);
		E_10.add(A_1_1);

		JButton A_2_1 = new JButton("b3");
		A_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket b3");
				A_2_1.setEnabled(false);
			}
		});
		A_2_1.setBounds(337, 451, 89, 23);
		E_10.add(A_2_1);

		JButton A_3_1 = new JButton("b4");
		A_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_1.setBounds(337, 485, 89, 23);
		E_10.add(A_3_1);

		JButton A_4_1 = new JButton("b5");
		A_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_1.setBounds(337, 519, 89, 23);
		E_10.add(A_4_1);

		JButton A_5_1 = new JButton("b6");
		A_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_1.setBounds(337, 553, 89, 23);
		E_10.add(A_5_1);

		JButton A_6_1 = new JButton("b7");
		A_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_1.setBounds(337, 633, 89, 23);
		E_10.add(A_6_1);

		JButton A_7_1 = new JButton("b8");
		A_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_1.setBounds(337, 667, 89, 23);
		E_10.add(A_7_1);

		JButton A_8_1 = new JButton("b9");
		A_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_1.setBounds(337, 701, 89, 23);
		E_10.add(A_8_1);

		JButton A_9_1 = new JButton("b10");
		A_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_1.setBounds(337, 735, 89, 23);
		E_10.add(A_9_1);

		JButton A_10_1 = new JButton("b11");
		A_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_1.setBounds(337, 769, 89, 23);
		E_10.add(A_10_1);

		JButton A_11_1 = new JButton("b12");
		A_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_1.setBounds(337, 803, 89, 23);
		E_10.add(A_11_1);

		JButton A_12_1 = new JButton("b13");
		A_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_1.setBounds(337, 837, 89, 23);
		E_10.add(A_12_1);

		JButton A_13_1 = new JButton("b14");
		A_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_13_1.setBounds(337, 871, 89, 23);
		E_10.add(A_13_1);

		JButton A_14_1 = new JButton("b15");
		A_14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_14_1.setBounds(337, 905, 89, 23);
		E_10.add(A_14_1);

		JButton A_15_1 = new JButton("b16");
		A_15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_15_1.setBounds(337, 939, 89, 23);
		E_10.add(A_15_1);

		JButton A_16_1 = new JButton("b17");
		A_16_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_16_1.setBounds(337, 973, 89, 23);
		E_10.add(A_16_1);

		JButton A_18_1 = new JButton("a1");
		A_18_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket a1");
				A_18_1.setEnabled(false);
			}
		});
		A_18_1.setBounds(135, 347, 89, 23);
		E_10.add(A_18_1);

		JButton A_1_2_1 = new JButton("a2");
		A_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket a2");
				A_1_2_1.setEnabled(false);
			}
		});
		A_1_2_1.setBounds(135, 381, 89, 23);
		E_10.add(A_1_2_1);

		JButton A_2_2_1 = new JButton("a3");
		A_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have selected  ticket a3");
				A_2_2_1.setEnabled(false);
			}
		});
		A_2_2_1.setBounds(135, 451, 89, 23);
		E_10.add(A_2_2_1);

		JButton A_3_2_1 = new JButton("a4");
		A_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeatSelect();
				A_3_2_1.setEnabled(false);
			}
		});
		A_3_2_1.setBounds(135, 485, 89, 23);
		E_10.add(A_3_2_1);

		JButton A_4_2_1 = new JButton("a5");
		A_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2_1.setBounds(135, 519, 89, 23);
		E_10.add(A_4_2_1);

		JButton A_5_2_1 = new JButton("a6");
		A_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2_1.setBounds(135, 553, 89, 23);
		E_10.add(A_5_2_1);

		JButton A_6_2_1 = new JButton("a7");
		A_6_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2_1.setBounds(135, 633, 89, 23);
		E_10.add(A_6_2_1);

		JButton A_7_2_1 = new JButton("a8");
		A_7_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2_1.setBounds(135, 667, 89, 23);
		E_10.add(A_7_2_1);

		JButton A_8_2_1 = new JButton("a9");
		A_8_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2_1.setBounds(135, 701, 89, 23);
		E_10.add(A_8_2_1);

		JButton A_9_2_1 = new JButton("a10");
		A_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_2_1.setBounds(135, 735, 89, 23);
		E_10.add(A_9_2_1);

		JButton A_10_2_1 = new JButton("a11");
		A_10_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2_1.setBounds(135, 769, 89, 23);
		E_10.add(A_10_2_1);

		JButton A_11_2_1 = new JButton("a12");
		A_11_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2_1.setBounds(135, 803, 89, 23);
		E_10.add(A_11_2_1);

		JButton A_12_2_1 = new JButton("a13");
		A_12_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2_1.setBounds(135, 837, 89, 23);
		E_10.add(A_12_2_1);

		JButton A_13_2_1 = new JButton("a14");
		A_13_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_13_2_1.setBounds(135, 871, 89, 23);
		E_10.add(A_13_2_1);

		JButton A_14_2_1 = new JButton("a15");
		A_14_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_14_2_1.setBounds(135, 905, 89, 23);
		E_10.add(A_14_2_1);

		JButton A_15_2_1 = new JButton("a16");
		A_15_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_15_2_1.setBounds(135, 939, 89, 23);
		E_10.add(A_15_2_1);

		JButton A_16_2_1 = new JButton("a17");
		A_16_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_16_2_1.setBounds(135, 973, 89, 23);
		E_10.add(A_16_2_1);

		JButton A = new JButton("e1");
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A.setBounds(1034, 347, 89, 23);
		E_10.add(A);

		JButton A_1 = new JButton("e2");
		A_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1.setBounds(1034, 381, 89, 23);
		E_10.add(A_1);

		JButton A_2 = new JButton("e3");
		A_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2.setBounds(1034, 451, 89, 23);
		E_10.add(A_2);

		JButton A_3 = new JButton("e4");
		A_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3.setBounds(1034, 485, 89, 23);
		E_10.add(A_3);

		JButton A_4 = new JButton("e5");
		A_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4.setBounds(1034, 519, 89, 23);
		E_10.add(A_4);

		JButton A_5 = new JButton("e6");
		A_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5.setBounds(1034, 553, 89, 23);
		E_10.add(A_5);

		JButton A_6 = new JButton("e7");
		A_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6.setBounds(1034, 633, 89, 23);
		E_10.add(A_6);

		JButton A_7 = new JButton("e8");
		A_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7.setBounds(1034, 667, 89, 23);
		E_10.add(A_7);

		JButton A_8 = new JButton("e9");
		A_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8.setBounds(1034, 701, 89, 23);
		E_10.add(A_8);

		JButton A_9 = new JButton("e10");
		A_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9.setBounds(1034, 735, 89, 23);
		E_10.add(A_9);

		JButton A_10 = new JButton("e11");
		A_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10.setBounds(1034, 769, 89, 23);
		E_10.add(A_10);

		JButton A_11 = new JButton("e12");
		A_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11.setBounds(1034, 803, 89, 23);
		E_10.add(A_11);

		JButton A_12 = new JButton("e13");
		A_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12.setBounds(1034, 837, 89, 23);
		E_10.add(A_12);

		JButton A_13 = new JButton("e14");
		A_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_13.setBounds(1034, 871, 89, 23);
		E_10.add(A_13);

		JButton A_14 = new JButton("e15");
		A_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_14.setBounds(1034, 905, 89, 23);
		E_10.add(A_14);

		JButton A_15 = new JButton("e16");
		A_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_15.setBounds(1034, 939, 89, 23);
		E_10.add(A_15);

		JButton A_16_2 = new JButton("d17");
		A_16_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_16_2.setBounds(850, 973, 89, 23);
		E_10.add(A_16_2);

		JButton A_15_2 = new JButton("d16");
		A_15_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_15_2.setBounds(850, 939, 89, 23);
		E_10.add(A_15_2);

		JButton A_14_2 = new JButton("d15");
		A_14_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_14_2.setBounds(850, 905, 89, 23);
		E_10.add(A_14_2);

		JButton A_13_2 = new JButton("d14");
		A_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_13_2.setBounds(850, 871, 89, 23);
		E_10.add(A_13_2);

		JButton A_12_2 = new JButton("d13");
		A_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2.setBounds(850, 837, 89, 23);
		E_10.add(A_12_2);

		JButton A_11_2 = new JButton("d12");
		A_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2.setBounds(850, 803, 89, 23);
		E_10.add(A_11_2);

		JButton A_10_2 = new JButton("d11");
		A_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2.setBounds(850, 769, 89, 23);
		E_10.add(A_10_2);

		JButton A_9_2 = new JButton("d10");
		A_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_2.setBounds(850, 735, 89, 23);
		E_10.add(A_9_2);

		JButton A_8_2 = new JButton("d9");
		A_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2.setBounds(850, 701, 89, 23);
		E_10.add(A_8_2);

		JButton A_7_2 = new JButton("d8");
		A_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2.setBounds(850, 667, 89, 23);
		E_10.add(A_7_2);

		JButton A_6_2 = new JButton("d7");
		A_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2.setBounds(850, 633, 89, 23);
		E_10.add(A_6_2);

		JButton A_5_2 = new JButton("d6");
		A_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2.setBounds(850, 553, 89, 23);
		E_10.add(A_5_2);

		JButton A_4_2 = new JButton("d5");
		A_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2.setBounds(850, 519, 89, 23);
		E_10.add(A_4_2);

		JButton A_3_2 = new JButton("d4");
		A_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_2.setBounds(850, 485, 89, 23);
		E_10.add(A_3_2);

		JButton A_2_2 = new JButton("d3");
		A_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_2.setBounds(850, 451, 89, 23);
		E_10.add(A_2_2);

		JButton A_1_2 = new JButton("d2");
		A_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_2.setBounds(850, 381, 89, 23);
		E_10.add(A_1_2);

		JButton A_18 = new JButton("d1");
		A_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_18.setBounds(850, 347, 89, 23);
		E_10.add(A_18);

		JButton A_18_1_1 = new JButton("c1");
		A_18_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_18_1_1.setBounds(587, 347, 89, 23);
		E_10.add(A_18_1_1);

		JButton A_1_2_1_1 = new JButton("c2");
		A_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_2_1_1.setBounds(587, 381, 89, 23);
		E_10.add(A_1_2_1_1);

		JButton A_2_2_1_1 = new JButton("c3");
		A_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_2_1_1.setBounds(587, 451, 89, 23);
		E_10.add(A_2_2_1_1);

		JButton A_3_2_1_1 = new JButton("c4");
		A_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_2_1_1.setBounds(587, 485, 89, 23);
		E_10.add(A_3_2_1_1);

		JButton A_4_2_1_1 = new JButton("c5");
		A_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2_1_1.setBounds(587, 519, 89, 23);
		E_10.add(A_4_2_1_1);

		JButton A_5_2_1_1 = new JButton("c6");
		A_5_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2_1_1.setBounds(587, 553, 89, 23);
		E_10.add(A_5_2_1_1);

		JButton A_6_2_1_1 = new JButton("c7");
		A_6_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2_1_1.setBounds(587, 633, 89, 23);
		E_10.add(A_6_2_1_1);

		JButton A_7_2_1_1 = new JButton("c8");
		A_7_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2_1_1.setBounds(587, 667, 89, 23);
		E_10.add(A_7_2_1_1);

		JButton A_8_2_1_1 = new JButton("c9");
		A_8_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2_1_1.setBounds(587, 701, 89, 23);
		E_10.add(A_8_2_1_1);

		JButton A_9_2_1_1 = new JButton("c10");
		A_9_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_2_1_1.setBounds(587, 735, 89, 23);
		E_10.add(A_9_2_1_1);

		JButton A_10_2_1_1 = new JButton("c11");
		A_10_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2_1_1.setBounds(587, 769, 89, 23);
		E_10.add(A_10_2_1_1);

		JButton A_11_2_1_1 = new JButton("c12");
		A_11_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2_1_1.setBounds(587, 803, 89, 23);
		E_10.add(A_11_2_1_1);

		JButton A_12_2_1_1 = new JButton("c13");
		A_12_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2_1_1.setBounds(587, 837, 89, 23);
		E_10.add(A_12_2_1_1);

		JButton A_13_2_1_1 = new JButton("c14");
		A_13_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_13_2_1_1.setBounds(587, 871, 89, 23);
		E_10.add(A_13_2_1_1);

		JButton A_14_2_1_1 = new JButton("c15");
		A_14_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_14_2_1_1.setBounds(587, 905, 89, 23);
		E_10.add(A_14_2_1_1);

		JButton A_15_2_1_1 = new JButton("c16");
		A_15_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_15_2_1_1.setBounds(587, 939, 89, 23);
		E_10.add(A_15_2_1_1);

		JButton A_16_2_1_1 = new JButton("c17");
		A_16_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_16_2_1_1.setBounds(587, 973, 89, 23);
		E_10.add(A_16_2_1_1);

		JButton btnSeatingplanMainPage = new JButton("MAIN PAGE");
		btnSeatingplanMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NumberofPassangers a1 = new NumberofPassangers();
				a1.setVisible(true);
				setVisible(false);

			}
		});
		btnSeatingplanMainPage.setForeground(Color.RED);
		btnSeatingplanMainPage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeatingplanMainPage.setBackground(Color.DARK_GRAY);
		btnSeatingplanMainPage.setBounds(541, 121, 149, 54);
		E_10.add(btnSeatingplanMainPage);
		
		txtDuration = new JTextField();
		txtDuration.setText("Duration: 9:21");
		txtDuration.setHorizontalAlignment(SwingConstants.CENTER);
		txtDuration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDuration.setColumns(10);
		txtDuration.setBackground(new Color(255, 127, 80));
		txtDuration.setBounds(114, 204, 1027, 25);
		E_10.add(txtDuration);
	}
}