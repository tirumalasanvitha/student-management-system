package studentManagementSystem;

import java.util.Scanner;

public class student {
		public static void main(String[] args) {

			student s = new student();
			s.studentMenu();

		}

		// fields
		String name;
		int studentID;
		String courses = "";
		int tuitionBalance;
		int remainingBalance;
		static int costOfCourse = 1000;
		static int id = 10000;

		// constructor
		public void studentname() {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter student name: ");
			name = in.nextLine();

		}

		// Generate ID
		private void setstudentID() {
			id++;
			studentID = id;
			System.out.println("studentID:" + studentID);
		}

		// course enroll

		public void enroll() {
			do {
				System.out.print("Enter course to enroll(Q to Quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if (!course.equals("Q")) {
					courses = courses + "\n " + course;
					tuitionBalance = tuitionBalance + costOfCourse;
				} else {
					break;
				}
			} while (1 != 0);
		}

		// view balance
		public void viewBalance() {
			System.out.println("Your Tuition Fee :$" + tuitionBalance);
		}

		// pay tuitionfee
		public void payTuitionFee() {
			viewBalance();
			System.out.print("Enter your payment:$");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			remainingBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of: $" + payment);
			System.out.println("Your Remaining Balance: " + remainingBalance);
		}

		// show status
		public String status() {
			return "Name: " + name + 
					"\nStudentID: " + studentID + 
					"\nCourses Enrolled: " + courses + 
					"\nBalance: $"+ remainingBalance;
		}

		void studentMenu() {
			do {
				char option = '\0';
				Scanner sc = new Scanner(System.in);
				// options
				System.out.println("WELCOME ");
				System.out.println("1.student name and ID:");
				System.out.println("2.Courses Enroll:");
				System.out.println("3.Pay TuitionFee:");
				System.out.println("4.Student Status");
				System.out.println("5.Exit");

				do {
					System.out.println("***************************");
					System.out.println("Enter an option");
					System.out.println("***************************");
					option = sc.next().charAt(0);

					switch (option) {
					case 'A':
						System.out.println("--------------------------");
						studentname();
						setstudentID();
						break;

					case 'B':
						System.out.println("---------------------------");
						enroll();
						break;

					case 'C':
						System.out.println("---------------------------");
						payTuitionFee();
						break;

					case 'D':
						System.out.println("---------------------------");
						System.out.println(status());
						break;

					case 'E':
						System.out.println("---------------------------");
						break;

					default:
						System.out.println("Invalid option || Please enter again");
						break;
					}
				} while (option != 'E');
				System.out.println("ThankYou for Joining");
				System.out.println("**********************************");
			} while (1 != 0);

		}
	}