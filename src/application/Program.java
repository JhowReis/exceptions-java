package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		try {
			System.out.println("Room Number: ");
			int number = sc.nextInt();
			System.out.println("Chek-in date (dd/mm/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Chek-out date (dd/mm/yyyy)");
			Date checkOut = sdf.parse(sc.next());
	
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation:" + reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.println("Chek-in date (dd/mm/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Chek-out date (dd/mm/yyyy)");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation:" + reservation);			
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}

		sc.close();
	}

}
