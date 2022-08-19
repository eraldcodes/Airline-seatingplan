import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;

public class Airbus1 extends JFrame {
/////////////////////////////		Declaration of different type of variables and components in the code      /////////////////////////////
	private JPanel contentPane;
	private JTextField txtBusinessClass;
	private JTextField txtEconomyClassSeats;
	private JTextField txtAirbusASeatingplan;
	int AirbusAvelablebooking = 64;

///////////////////////////// SeatSelect() is a method that gets number of tickets and runs untill there is no tickets left /////////////////////////////
	private void SeatSelect() {
		String NOticketsSelectedstring = (String) NumberofPassangers.ticketSelectionComboBox.getItemAt(NumberofPassangers.ticketSelectionComboBox.getSelectedIndex());
		NumberofPassangers.impNOticketsSelected = Integer.parseInt(NOticketsSelectedstring);
		
		
		if (NumberofPassangers.ticketSelectionComboBox.getSelectedIndex() > 0) {
			
			NumberofPassangers.impNOticketsSelected = NumberofPassangers.impNOticketsSelected - 1;
			
			AirbusAvelablebooking = AirbusAvelablebooking - 1;

			JOptionPane.showMessageDialog(null, "You succesfully selected the seat");
			setEnabled(false);
			
		} else {
			JOptionPane.showMessageDialog(null, " You Have booked all your tickets");
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Airbus1 frame = new Airbus1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Airbus1() {

/////////////////////////////		Source code for different GUI components which explains how it would look and shows how it would interact     /////////////////////////////

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 1091);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Menu = new JPanel();
		Menu.setBounds(301, 11, 904, 99);
		contentPane.add(Menu);
		Menu.setLayout(null);

		JButton btnNewButton = new JButton("Flights");
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

		JButton btnFinance = new JButton("Finances");
		btnFinance.setBackground(new Color(255, 160, 122));
		btnFinance.setBounds(483, 24, 95, 56);
		Menu.add(btnFinance);

		JButton btnFlightArrivals = new JButton("Flight Arrival Map");
		btnFlightArrivals.setBackground(new Color(255, 160, 122));
		btnFlightArrivals.setBounds(576, 24, 140, 56);
		Menu.add(btnFlightArrivals);

		JButton btnFlightDepartureMap = new JButton("Flight Departure Map");
		btnFlightDepartureMap.setBackground(new Color(255, 160, 122));
		btnFlightDepartureMap.setBounds(716, 24, 165, 56);
		Menu.add(btnFlightDepartureMap);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SLL727\\Desktop\\CS1701 Group Project Lectures and Tutorials (A 20212)\\Seat planing Project\\Images\\unnamed.png"));
		lblNewLabel.setBounds(-20, 11, 307, 120);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 121, 1178, 2);
		contentPane.add(separator);

		txtBusinessClass = new JTextField();
		txtBusinessClass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBusinessClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtBusinessClass.setText("Business Class Seats");
		txtBusinessClass.setBackground(new Color(255, 127, 80));
		txtBusinessClass.setBounds(121, 354, 1027, 25);
		contentPane.add(txtBusinessClass);
		txtBusinessClass.setColumns(10);

		txtEconomyClassSeats = new JTextField();
		txtEconomyClassSeats.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEconomyClassSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtEconomyClassSeats.setText("Economy Class Seats");
		txtEconomyClassSeats.setColumns(10);
		txtEconomyClassSeats.setBackground(new Color(255, 127, 80));
		txtEconomyClassSeats.setBounds(121, 452, 1027, 25);
		contentPane.add(txtEconomyClassSeats);

		txtAirbusASeatingplan = new JTextField();
		txtAirbusASeatingplan.setText("Airbus A318 Seating Plan");
		txtAirbusASeatingplan.setHorizontalAlignment(SwingConstants.CENTER);
		txtAirbusASeatingplan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAirbusASeatingplan.setColumns(10);
		txtAirbusASeatingplan.setBackground(new Color(255, 0, 0));
		txtAirbusASeatingplan.setBounds(121, 175, 1027, 31);
		contentPane.add(txtAirbusASeatingplan);

/////////////////////////////		Declaration of all buttons and the usage of Selectseat() method /////////////////////////////
		JButton A_18_1 = new JButton("c1");
		A_18_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_18_1.setBounds(578, 384, 89, 23);
		contentPane.add(A_18_1);

		JButton A_1_2_1 = new JButton("c2");
		A_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_2_1.setBounds(578, 418, 89, 23);
		contentPane.add(A_1_2_1);

		JButton A_2_2_1 = new JButton("c3");
		A_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_2_1.setBounds(578, 488, 89, 23);
		contentPane.add(A_2_2_1);

		JButton A_3_2_1 = new JButton("c4");
		A_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_2_1.setBounds(578, 522, 89, 23);
		contentPane.add(A_3_2_1);

		JButton A_4_2_1 = new JButton("c5");
		A_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2_1.setBounds(578, 556, 89, 23);
		contentPane.add(A_4_2_1);

		JButton A_5_2_1 = new JButton("c6");
		A_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2_1.setBounds(578, 590, 89, 23);
		contentPane.add(A_5_2_1);

		JButton A_6_2_1 = new JButton("c7");
		A_6_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2_1.setBounds(578, 624, 89, 23);
		contentPane.add(A_6_2_1);

		JButton A_7_2_1 = new JButton("c8");
		A_7_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2_1.setBounds(578, 658, 89, 23);
		contentPane.add(A_7_2_1);

		JButton A_8_2_1 = new JButton("c9");
		A_8_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2_1.setBounds(578, 692, 89, 23);
		contentPane.add(A_8_2_1);

		JButton A_9_2_1 = new JButton("c10");
		A_9_2_1.setBounds(578, 726, 89, 23);
		contentPane.add(A_9_2_1);

		JButton A_10_2_1 = new JButton("c11");
		A_10_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2_1.setBounds(578, 760, 89, 23);
		contentPane.add(A_10_2_1);

		JButton A_11_2_1 = new JButton("c12");
		A_11_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2_1.setBounds(578, 794, 89, 23);
		contentPane.add(A_11_2_1);

		JButton A_18_1_1 = new JButton("a1");
		A_18_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "You succesfully selected the seat");
				A_18_1_1.setEnabled(false);
			}
		});
		A_18_1_1.setBounds(121, 384, 89, 23);
		contentPane.add(A_18_1_1);

		JButton A_1_2_1_1 = new JButton("a2");
		A_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_2_1_1.setBounds(121, 418, 89, 23);
		contentPane.add(A_1_2_1_1);

		JButton A_2_2_1_1 = new JButton("a3");
		A_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_2_1_1.setBounds(121, 488, 89, 23);
		contentPane.add(A_2_2_1_1);

		JButton A_3_2_1_1 = new JButton("a4");
		A_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_2_1_1.setBounds(121, 522, 89, 23);
		contentPane.add(A_3_2_1_1);

		JButton A_4_2_1_1 = new JButton("a5");
		A_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2_1_1.setBounds(121, 556, 89, 23);
		contentPane.add(A_4_2_1_1);

		JButton A_5_2_1_1 = new JButton("a6");
		A_5_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2_1_1.setBounds(121, 590, 89, 23);
		contentPane.add(A_5_2_1_1);

		JButton A_6_2_1_1 = new JButton("a7");
		A_6_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2_1_1.setBounds(121, 624, 89, 23);
		contentPane.add(A_6_2_1_1);

		JButton A_7_2_1_1 = new JButton("a8");
		A_7_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2_1_1.setBounds(121, 658, 89, 23);
		contentPane.add(A_7_2_1_1);

		JButton A_8_2_1_1 = new JButton("a9");
		A_8_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2_1_1.setBounds(121, 692, 89, 23);
		contentPane.add(A_8_2_1_1);

		JButton A_9_2_1_1 = new JButton("a10");
		A_9_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_2_1_1.setBounds(121, 726, 89, 23);
		contentPane.add(A_9_2_1_1);

		JButton A_10_2_1_1 = new JButton("a11");
		A_10_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2_1_1.setBounds(121, 760, 89, 23);
		contentPane.add(A_10_2_1_1);

		JButton A_11_2_1_1 = new JButton("a12");
		A_11_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2_1_1.setBounds(121, 794, 89, 23);
		contentPane.add(A_11_2_1_1);

		JButton A_11_1 = new JButton("b12");
		A_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_1.setBounds(344, 794, 89, 23);
		contentPane.add(A_11_1);

		JButton A_10_1 = new JButton("b11");
		A_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_1.setBounds(344, 760, 89, 23);
		contentPane.add(A_10_1);

		JButton A_9_1 = new JButton("b10");
		A_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_1.setBounds(344, 726, 89, 23);
		contentPane.add(A_9_1);

		JButton A_8_1 = new JButton("b9");
		A_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_1.setBounds(344, 692, 89, 23);
		contentPane.add(A_8_1);

		JButton A_7_1 = new JButton("b8");
		A_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_1.setBounds(344, 658, 89, 23);
		contentPane.add(A_7_1);

		JButton A_6_1 = new JButton("b7");
		A_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_1.setBounds(344, 624, 89, 23);
		contentPane.add(A_6_1);

		JButton A_5_1 = new JButton("b6");
		A_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_1.setBounds(344, 590, 89, 23);
		contentPane.add(A_5_1);

		JButton A_4_1 = new JButton("b5");
		A_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_1.setBounds(344, 556, 89, 23);
		contentPane.add(A_4_1);

		JButton A_3_1 = new JButton("b4");
		A_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_1.setBounds(344, 522, 89, 23);
		contentPane.add(A_3_1);

		JButton A_2_1 = new JButton("b3");
		A_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_1.setBounds(344, 488, 89, 23);
		contentPane.add(A_2_1);

		JButton A_1_1 = new JButton("b2");
		A_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_1.setBounds(344, 418, 89, 23);
		contentPane.add(A_1_1);

		JButton A_17 = new JButton("b1");
		A_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_17.setBounds(344, 384, 89, 23);
		contentPane.add(A_17);

		JButton A_18 = new JButton("d1");
		A_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_18.setBounds(832, 384, 89, 23);
		contentPane.add(A_18);

		JButton A_1_2 = new JButton("d2");
		A_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1_2.setBounds(832, 418, 89, 23);
		contentPane.add(A_1_2);

		JButton A_2_2 = new JButton("d3");
		A_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2_2.setBounds(832, 488, 89, 23);
		contentPane.add(A_2_2);

		JButton A_3_2 = new JButton("d4");
		A_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3_2.setBounds(832, 522, 89, 23);
		contentPane.add(A_3_2);

		JButton A_4_2 = new JButton("d5");
		A_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4_2.setBounds(832, 556, 89, 23);
		contentPane.add(A_4_2);

		JButton A_5_2 = new JButton("d6");
		A_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5_2.setBounds(832, 590, 89, 23);
		contentPane.add(A_5_2);

		JButton A_6_2 = new JButton("d7");
		A_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6_2.setBounds(832, 624, 89, 23);
		contentPane.add(A_6_2);

		JButton A_7_2 = new JButton("d8");
		A_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7_2.setBounds(832, 658, 89, 23);
		contentPane.add(A_7_2);

		JButton A_8_2 = new JButton("d9");
		A_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8_2.setBounds(832, 692, 89, 23);
		contentPane.add(A_8_2);

		JButton A_9_2 = new JButton("d10");
		A_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9_2.setBounds(832, 726, 89, 23);
		contentPane.add(A_9_2);

		JButton A_10_2 = new JButton("d11");
		A_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10_2.setBounds(832, 760, 89, 23);
		contentPane.add(A_10_2);

		JButton A_11_2 = new JButton("d12");
		A_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11_2.setBounds(832, 794, 89, 23);
		contentPane.add(A_11_2);

		JButton A_11 = new JButton("e12");
		A_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_11.setBounds(1059, 794, 89, 23);
		contentPane.add(A_11);

		JButton A_10 = new JButton("e11");
		A_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_10.setBounds(1059, 760, 89, 23);
		contentPane.add(A_10);

		JButton A_9 = new JButton("e10");
		A_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_9.setBounds(1059, 726, 89, 23);
		contentPane.add(A_9);

		JButton A_8 = new JButton("e9");
		A_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_8.setBounds(1059, 692, 89, 23);
		contentPane.add(A_8);

		JButton A_7 = new JButton("e8");
		A_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_7.setBounds(1059, 658, 89, 23);
		contentPane.add(A_7);

		JButton A_6 = new JButton("e7");
		A_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_6.setBounds(1059, 624, 89, 23);
		contentPane.add(A_6);

		JButton A_5 = new JButton("e6");
		A_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_5.setBounds(1059, 590, 89, 23);
		contentPane.add(A_5);

		JButton A_4 = new JButton("e5");
		A_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_4.setBounds(1059, 556, 89, 23);
		contentPane.add(A_4);

		JButton A_3 = new JButton("e4");
		A_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_3.setBounds(1059, 522, 89, 23);
		contentPane.add(A_3);

		JButton A_2 = new JButton("e3");
		A_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_2.setBounds(1059, 488, 89, 23);
		contentPane.add(A_2);

		JButton A_1 = new JButton("e2");
		A_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_1.setBounds(1059, 418, 89, 23);
		contentPane.add(A_1);

		JButton A = new JButton("e1");
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A.setBounds(1059, 384, 89, 23);
		contentPane.add(A);

		JButton A_12_2_1 = new JButton("a13");
		A_12_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2_1.setBounds(121, 828, 89, 23);
		contentPane.add(A_12_2_1);

		JButton A_12_1 = new JButton("b13");
		A_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_1.setBounds(344, 828, 89, 23);
		contentPane.add(A_12_1);

		JButton A_12_2_1_1 = new JButton("c13");
		A_12_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2_1_1.setBounds(578, 828, 89, 23);
		contentPane.add(A_12_2_1_1);

		JButton A_12_2 = new JButton("d13");
		A_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		A_12_2.setBounds(832, 828, 89, 23);
		contentPane.add(A_12_2);
		
		JButton btnSeatingplanMainPage = new JButton("MAIN PAGE");
		btnSeatingplanMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NumberofPassangers a1= new NumberofPassangers();
				a1.setVisible(true);
				setVisible(false);
				
			}
		});
		btnSeatingplanMainPage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeatingplanMainPage.setBackground(Color.DARK_GRAY);
		btnSeatingplanMainPage.setForeground(Color.RED);
		btnSeatingplanMainPage.setBounds(553, 121, 149, 54);
		contentPane.add(btnSeatingplanMainPage);

	}
}
