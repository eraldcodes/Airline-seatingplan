import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;

public class NumberofPassangers extends JFrame {
/////////////////////////////		Declaration of different type of variables and components in the code      /////////////////////////////

	private JPanel contentPane;
	public JTextField txtPleaseSelectNumber;
	public static int Delay,depFlightDuration = 537,arrFlightDuration = 921, depAvelablebooking,arrAvelablebooking,a;
	double DistanceTravelled;
	String departureplane,arrivaleplane,DepartureTime,ArrivalTime,dateofFlight,Airline,DepartureAirport,DepartureCity,ArrivalAirport,ArrivalCity,FlightNumber;
	public static int impNOticketsSelected;
	public static int b;

 static JComboBox ticketSelectionComboBox = new JComboBox();
 private JTextField txtPleaseSelectNumber_1;
 private JTextField txtAftterSelectingNumber;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					NumberofPassangers frame = new NumberofPassangers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	public static int getseat() {
		return impNOticketsSelected;
	}
	/**
	 * Create the frame.
	 */
	public NumberofPassangers() {
		
/////////////////////////////		Declaration of 2 objects and their data  of the flights      /////////////////////////////

		SeatingPlan DepartureFlight = new SeatingPlan();  // Object 1 for method

		DepartureFlight.dateofFlight = "08/03/2022";
		DepartureFlight.DepartureTime = "06:20";
		DepartureFlight.ArrivalTime = "11:57";
		DepartureFlight.FlightDuration = 0537;
		DepartureFlight.DistanceTravelled = 7021.04;
		DepartureFlight.Delay = 179;
		DepartureFlight.DepartureAirport = "HND";
		DepartureFlight.DepartureCity = "Tokyo";
		DepartureFlight.ArrivalAirport = "SYD";
		DepartureFlight.ArrivalCity = "Sydney";
		DepartureFlight.FlightNumber = "TS4977";
		DepartureFlight.Airline = "Easyplane";
		DepartureFlight.departureplane= "";





		SeatingPlan ArrivalFlight = new SeatingPlan();  // Object 2

		ArrivalFlight.dateofFlight = "27/03/2022";
		ArrivalFlight.DepartureTime = "18:23";
		ArrivalFlight.ArrivalTime = "03:44";

		ArrivalFlight.DistanceTravelled =11687.85;
		ArrivalFlight.Delay =1;
		ArrivalFlight.DepartureAirport ="SYD";
		ArrivalFlight.DepartureCity ="Sydney";
		ArrivalFlight.ArrivalAirport ="HND";
		ArrivalFlight.ArrivalCity ="Tokyo";
		ArrivalFlight.FlightNumber ="ST4138";
		ArrivalFlight.Airline ="Eastair";
		ArrivalFlight.departureplane= "";

/////////////////////////////		Source code for different GUI components which explains how it would look and shows how it would interact     /////////////////////////////

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1277, 494);
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
		btnSeatingPlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		lblNewLabel.setBounds(-20, 11, 307, 120);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SLL727\\Desktop\\CS1701 Group Project Lectures and Tutorials (A 20212)\\Seat planing Project\\Images\\unnamed.png"));
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 121, 1178, 2);
		contentPane.add(separator);

		txtPleaseSelectNumber = new JTextField();
		txtPleaseSelectNumber.setBounds(97, 162, 1027, 25);
		txtPleaseSelectNumber.setText("Seating Plan / Number Of Tickets ");
		txtPleaseSelectNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseSelectNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPleaseSelectNumber.setColumns(10);
		txtPleaseSelectNumber.setBackground(new Color(255, 127, 80));
		contentPane.add(txtPleaseSelectNumber);
/////////////////////////////		i created a ComboBox which allows user to select number of seats       /////////////////////////////

		ticketSelectionComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64"}));
		ticketSelectionComboBox.setSelectedIndex(0);
		ticketSelectionComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ticketSelectionComboBox.setBounds(673, 239, 43, 28);
		contentPane.add(ticketSelectionComboBox);

		
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int impNOticketsSelected=ticketSelectionComboBox.getSelectedIndex()+1;
			
				JOptionPane.showMessageDialog(null,"You have selected "+ impNOticketsSelected + " Tickets" );	
			
			
			
			}
		});
		btnNewButton_1.setBounds(599, 305, 171, 39);
		contentPane.add(btnNewButton_1);

		
		
		
/////////////////////////////		i Created  if else statement which decides what plane to get for departure flight       /////////////////////////////

		
		
		
		JButton bookdepartureButton = new JButton("Book the departure seat");
		bookdepartureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if (ticketSelectionComboBox.getSelectedIndex() < 64) {
					
					
					 if(depFlightDuration <= 200){ 
							departureplane = "We will be using airbus short holl";
							depAvelablebooking=64;
							Airbus1 a1= new Airbus1();
							a1.setVisible(true);
							setVisible(false);
						}
						else {
							departureplane = "We will be using boing long holl";
							depAvelablebooking=84;
							Boing b1= new Boing();
							b1.setVisible(true);
							setVisible(false);
							}
					        } else 
					        {
                            }
			}
		});
		bookdepartureButton.setBounds(399, 365, 149, 54);
		contentPane.add(bookdepartureButton);

		
/////////////////////////////		i Created  if else statement which decides what plane to get for arrival flight       /////////////////////////////

		
		
		JButton bookArrivalButton = new JButton("Book the arrival seat");
		bookArrivalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (arrFlightDuration <= 200) {
					arrivaleplane = "We will be using airbus short holl";
					depAvelablebooking = 64;
					Airbus1 a1 = new Airbus1();
					a1.setVisible(true);
					setVisible(false);
				} else {
					arrivaleplane = "We will be using boing long holl";
					depAvelablebooking = 84;
					Boing b1 = new Boing();
					b1.setVisible(true);
					setVisible(false);
				}
			}  
				        {
                     
					
				
				
				
				
				
			}

		});
		bookArrivalButton.setBounds(845, 365, 149, 54);
		contentPane.add(bookArrivalButton);
		
		txtPleaseSelectNumber_1 = new JTextField();
		txtPleaseSelectNumber_1.setForeground(Color.BLACK);
		txtPleaseSelectNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPleaseSelectNumber_1.setText("Please Select Number of Tickets and press submit");
		txtPleaseSelectNumber_1.setBounds(134, 223, 407, 54);
		contentPane.add(txtPleaseSelectNumber_1);
		txtPleaseSelectNumber_1.setColumns(10);
		
		txtAftterSelectingNumber = new JTextField();
		txtAftterSelectingNumber.setText("After Selecting number of tickets please book the departure and arrival seat");
		txtAftterSelectingNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtAftterSelectingNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAftterSelectingNumber.setColumns(10);
		txtAftterSelectingNumber.setBackground(new Color(255, 127, 80));
		txtAftterSelectingNumber.setBounds(97, 430, 1027, 25);
		contentPane.add(txtAftterSelectingNumber);
		
		
		
		
		
		
	

	}
}
