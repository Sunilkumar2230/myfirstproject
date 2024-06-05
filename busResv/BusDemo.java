package busResv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("!!! Welcome to Bus Ticket Reservation System !!!");
			System.out.println("1. View Buses");
			System.out.println("2. View Booked Tickets");
			System.out.println("3. Reserve Ticket");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				viewBuses();
				break;
			case 2:
				viewTickets();
				break;
			case 3:
				reserveTicket(scanner);
				break;
			case 4:
				System.out.println("Exited Successfully...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);

		scanner.close();
	}

	private static void viewBuses() {
		String query = "SELECT * FROM buses";

		try (Connection conn = DbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery()) {

			System.out.println("Bus List:");
			while (rs.next()) {
				int busId = rs.getInt("bus_id");
				String busName = rs.getString("bus_name");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				int totalSeats = rs.getInt("total_seats");

				System.out.println("Bus ID: " + busId);
				System.out.println("Bus Name: " + busName);
				System.out.println("Source: " + source);
				System.out.println("Destination: " + destination);
				System.out.println("Total Seats: " + totalSeats);
				System.out.println("-----------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewTickets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bus id: ");
		int busId = sc.nextInt();
		switch (busId) {
		case 1:
			String query = "SELECT seat_number, gender FROM tickets WHERE bus_id=1";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {
					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					// Iterate through the result set and print seat number and gender
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			String query1 = "SELECT seat_number, gender FROM tickets WHERE bus_id=2";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query1);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");

					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			String query2 = "SELECT seat_number, gender FROM tickets WHERE bus_id=3";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query2);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");

					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			String query3 = "SELECT seat_number, gender FROM tickets WHERE bus_id=4";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query3);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			String query4 = "SELECT seat_number, gender FROM tickets WHERE bus_id=5";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query4);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");

					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			String query5 = "SELECT seat_number, gender FROM tickets WHERE bus_id=6";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query5);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 7:
			String query6 = "SELECT seat_number, gender FROM tickets WHERE bus_id=7";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query6);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");

					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 8:
			String query7 = "SELECT seat_number, gender FROM tickets WHERE bus_id=8";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query7);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");

					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 9:
			String query8 = "SELECT seat_number, gender FROM tickets WHERE bus_id=9";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query8);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 10:
			String query9 = "SELECT seat_number, gender FROM tickets WHERE bus_id=10";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query9);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {
					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 11:
			String query10 = "SELECT seat_number, gender FROM tickets WHERE bus_id=10";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query10);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {
					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 12:
			String query11 = "SELECT seat_number, gender FROM tickets WHERE bus_id=12";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query11);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 13:
			String query12 = "SELECT seat_number, gender FROM tickets WHERE bus_id=13";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query12);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {
					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");
						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 14:
			String query13 = "SELECT seat_number, gender FROM tickets WHERE bus_id=14";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query13);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 15:
			String query14 = "SELECT seat_number, gender FROM tickets WHERE bus_id=14";
			try (Connection conn = DbConnection.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(query14);
					ResultSet rs = pstmt.executeQuery()) {
				if (!rs.isBeforeFirst()) {
					System.out.println("No tickets are booked.");
				} else {

					System.out.println("Ticket List:");
					System.out.println("-----------------------------");
					while (rs.next()) {
						int seatNumber = rs.getInt("seat_number");
						String gender = rs.getString("gender");

						System.out.println("Seat Number: " + seatNumber);
						System.out.println("Gender: " + gender);
						System.out.println("-----------------------------");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid Bus Id");
		}
	}

	private static void reserveTicket(Scanner scanner) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter Bus ID: ");
		int busId = scanner1.nextInt();
		switch (busId) {
		case 1:
			System.out.print("Enter Passenger Name: ");
			String passengerName = scanner.nextLine();

			System.out.print("Enter Seat Number (1-50): ");
			int seatNumber = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber < 1 || seatNumber > 50) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber)) {
				System.out.println("Seat number " + seatNumber + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName);
					pstmt.setInt(3, seatNumber);
					pstmt.setString(4, gender);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 2:
			System.out.print("Enter Passenger Name: ");
			String passengerName1 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-40): ");
			int seatNumber1 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber1 < 1 || seatNumber1 > 40) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender1 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber1)) {
				System.out.println("Seat number " + seatNumber1 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName1);
					pstmt.setInt(3, seatNumber1);
					pstmt.setString(4, gender1);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 3:
			System.out.print("Enter Passenger Name: ");
			String passengerName2 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-45): ");
			int seatNumber2 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber2 < 1 || seatNumber2 > 45) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender2 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber2)) {
				System.out.println("Seat number " + seatNumber2 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName2);
					pstmt.setInt(3, seatNumber2);
					pstmt.setString(4, gender2);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 4:
			System.out.print("Enter Passenger Name: ");
			String passengerName3 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-35): ");
			int seatNumber3 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber3 < 1 || seatNumber3 > 35) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender3 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber3)) {
				System.out.println("Seat number " + seatNumber3 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName3);
					pstmt.setInt(3, seatNumber3);
					pstmt.setString(4, gender3);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 5:
			System.out.print("Enter Passenger Name: ");
			String passengerName4 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-30): ");
			int seatNumber4 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber4 < 1 || seatNumber4 > 30) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender4 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber4)) {
				System.out.println("Seat number " + seatNumber4 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName4);
					pstmt.setInt(3, seatNumber4);
					pstmt.setString(4, gender4);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 6:
			System.out.print("Enter Passenger Name: ");
			String passengerName5 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-60): ");
			int seatNumber5 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber5 < 1 || seatNumber5 > 60) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender5 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber5)) {
				System.out.println("Seat number " + seatNumber5 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName5);
					pstmt.setInt(3, seatNumber5);
					pstmt.setString(4, gender5);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 7:
			System.out.print("Enter Passenger Name: ");
			String passengerName6 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-55): ");
			int seatNumber6 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber6 < 1 || seatNumber6 > 55) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender6 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber6)) {
				System.out.println("Seat number " + seatNumber6 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName6);
					pstmt.setInt(3, seatNumber6);
					pstmt.setString(4, gender6);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 8:
			System.out.print("Enter Passenger Name: ");
			String passengerName7 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-25): ");
			int seatNumber7 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber7 < 1 || seatNumber7 > 25) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender7 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber7)) {
				System.out.println("Seat number " + seatNumber7 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName7);
					pstmt.setInt(3, seatNumber7);
					pstmt.setString(4, gender7);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 9:
			System.out.print("Enter Passenger Name: ");
			String passengerName8 = scanner.nextLine();
			System.out.print("Enter Seat Number (1-50): ");
			int seatNumber8 = scanner.nextInt();
			scanner.nextLine();
			if (seatNumber8 < 1 || seatNumber8 > 50) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}
			System.out.print("Enter Gender (Male/Female): ");
			String gender8 = scanner.nextLine();
			if (isSeatReserved(busId, seatNumber8)) {
				System.out.println("Seat number " + seatNumber8 + " is already reserved on bus " + busId + ".");
			} else {
				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";
				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {
					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName8);
					pstmt.setInt(3, seatNumber8);
					pstmt.setString(4, gender8);
					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 10:
			System.out.print("Enter Passenger Name: ");
			String passengerName9 = scanner.nextLine();
			System.out.print("Enter Seat Number (1-40): ");
			int seatNumber9 = scanner.nextInt();
			scanner.nextLine();
			if (seatNumber9 < 1 || seatNumber9 > 40) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}
			System.out.print("Enter Gender (Male/Female): ");
			String gender9 = scanner.nextLine();
			if (isSeatReserved(busId, seatNumber9)) {
				System.out.println("Seat number " + seatNumber9 + " is already reserved on bus " + busId + ".");
			} else {
				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";
				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {
					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName9);
					pstmt.setInt(3, seatNumber9);
					pstmt.setString(4, gender9);
					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 11:
			System.out.print("Enter Passenger Name: ");
			String passengerName10 = scanner.nextLine();
			System.out.print("Enter Seat Number (1-55): ");
			int seatNumber10 = scanner.nextInt();
			scanner.nextLine();
			if (seatNumber10 < 1 || seatNumber10 > 55) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}
			System.out.print("Enter Gender (Male/Female): ");
			String gender10 = scanner.nextLine();
			if (isSeatReserved(busId, seatNumber10)) {
				System.out.println("Seat number " + seatNumber10 + " is already reserved on bus " + busId + ".");
			} else {
				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";
				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {
					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName10);
					pstmt.setInt(3, seatNumber10);
					pstmt.setString(4, gender10);
					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 12:
			System.out.print("Enter Passenger Name: ");
			String passengerName11 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-30): ");
			int seatNumber11 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber11 < 1 || seatNumber11 > 30) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender11 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber11)) {
				System.out.println("Seat number " + seatNumber11 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName11);
					pstmt.setInt(3, seatNumber11);
					pstmt.setString(4, gender11);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 13:
			System.out.print("Enter Passenger Name: ");
			String passengerName12 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-45): ");
			int seatNumber12 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber12 < 1 || seatNumber12 > 45) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 45.");
				return;

			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender12 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber12)) {
				System.out.println("Seat number " + seatNumber12 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName12);
					pstmt.setInt(3, seatNumber12);
					pstmt.setString(4, gender12);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 14:
			System.out.print("Enter Passenger Name: ");
			String passengerName13 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-35): ");
			int seatNumber13 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber13 < 1 || seatNumber13 > 35) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender13 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber13)) {
				System.out.println("Seat number " + seatNumber13 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName13);
					pstmt.setInt(3, seatNumber13);
					pstmt.setString(4, gender13);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		case 15:
			System.out.print("Enter Passenger Name: ");
			String passengerName14 = scanner.nextLine();

			System.out.print("Enter Seat Number (1-20): ");
			int seatNumber14 = scanner.nextInt();
			scanner.nextLine();

			if (seatNumber14 < 1 || seatNumber14 > 20) {
				System.out.println("Invalid seat number. Please enter a seat number between 1 and 50.");
				return;
			}

			System.out.print("Enter Gender (Male/Female): ");
			String gender14 = scanner.nextLine();

			if (isSeatReserved(busId, seatNumber14)) {
				System.out.println("Seat number " + seatNumber14 + " is already reserved on bus " + busId + ".");
			} else {

				String query = "INSERT INTO tickets (bus_id, passenger_name, seat_number, gender) VALUES (?, ?, ?, ?)";

				try (Connection conn = DbConnection.getConnection();
						PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, busId);
					pstmt.setString(2, passengerName14);
					pstmt.setInt(3, seatNumber14);
					pstmt.setString(4, gender14);

					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Ticket reserved successfully!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		default:
			System.out.println("Invalid Bus ID");
		}
	}

	private static boolean isSeatReserved(int busId, int seatNumber) {
		String query = "SELECT COUNT(*) FROM tickets WHERE bus_id = ? AND seat_number = ?";

		try (Connection conn = DbConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setInt(1, busId);
			pstmt.setInt(2, seatNumber);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int count = rs.getInt(1);
				return count > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}
}