import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SeatingPlan {

	int Delay, FlightDuration;
	double DistanceTravelled;
	String departureplane, DepartureTime, ArrivalTime, dateofFlight, Airline, DepartureAirport, DepartureCity,
			ArrivalAirport, ArrivalCity, FlightNumber;

	public static void main(String[] args) {

		SeatingPlan DepartureFlight = new SeatingPlan(); // Object 1 for method

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
		DepartureFlight.departureplane = "";

		if (DepartureFlight.FlightDuration <= 200) {
			DepartureFlight.departureplane = "We will be using airbus short holl";
			System.out.println(DepartureFlight.departureplane);
		} else {
			DepartureFlight.departureplane = "We will be using boing long holl";
			System.out.println(DepartureFlight.departureplane);
		}

		SeatingPlan ArrivalFlight = new SeatingPlan(); // Object 2

		ArrivalFlight.dateofFlight = "27/03/2022";
		ArrivalFlight.DepartureTime = "18:23";
		ArrivalFlight.ArrivalTime = "03:44";
		ArrivalFlight.FlightDuration = 921;
		ArrivalFlight.DistanceTravelled = 11687.85;
		ArrivalFlight.Delay = 1;
		ArrivalFlight.DepartureAirport = "SYD";
		ArrivalFlight.DepartureCity = "Sydney";
		ArrivalFlight.ArrivalAirport = "HND";
		ArrivalFlight.ArrivalCity = "Tokyo";
		ArrivalFlight.FlightNumber = "ST4138";
		ArrivalFlight.Airline = "Eastair";
		ArrivalFlight.departureplane = "";

		if (ArrivalFlight.FlightDuration <= 200) {
			ArrivalFlight.departureplane = "We will be using airbus short holl";
			System.out.println(ArrivalFlight.departureplane);
		} else {
			ArrivalFlight.departureplane = "We will be using boeing long holl";
			System.out.println(ArrivalFlight.departureplane);
		}

		System.out.println(DepartureFlight);
		System.out.println(ArrivalFlight);
	}
}
