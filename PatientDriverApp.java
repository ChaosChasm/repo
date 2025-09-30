/*
 * Class: CMSC203
 * Instructor: Huseyin Aygun
 * Description: Obtain information about user and three procedures, compute total cost
 * Due: 09/28/2025
 * Platform/compiler: Java SE, Windows 11
 * 
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * 
 * Print your Name here: Kaden Shrestha
 */

import java.util.Scanner;

public class PatientDriverApp {
    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
    }

    // Method to calculate total charges from three procedures
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create Patient instance with user input
        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's street address:");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter patient's city:");
        String city = scanner.nextLine();
        System.out.println("Enter patient's state:");
        String state = scanner.nextLine();
        System.out.println("Enter patient's ZIP code:");
        String zipCode = scanner.nextLine();
        System.out.println("Enter patient's phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact's name:");
        String emergencyContactName = scanner.nextLine();
        System.out.println("Enter emergency contact's phone number:");
        String emergencyContactPhone = scanner.nextLine();

        // Create the Patient object with the provided data
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
                                      phoneNumber, emergencyContactName, emergencyContactPhone);

        // Display the patient information
        displayPatient(patient);

        // Create three Procedure objects with user input
        Procedure procedure1 = new Procedure();
        System.out.println("Enter first procedure name:");
        procedure1.setProcedureName(scanner.nextLine());
        System.out.println("Enter first procedure date (e.g. 06/12/2023):");
        procedure1.setProcedureDate(scanner.nextLine());
        System.out.println("Enter practitioner name for first procedure:");
        procedure1.setPractitionerName(scanner.nextLine());
        System.out.println("Enter charges for first procedure:");
        procedure1.setCharges(scanner.nextDouble());

        scanner.nextLine(); // Clear the buffer

        Procedure procedure2 = new Procedure();
        System.out.println("Enter second procedure name:");
        procedure2.setProcedureName(scanner.nextLine());
        System.out.println("Enter second procedure date:");
        procedure2.setProcedureDate(scanner.nextLine());
        System.out.println("Enter practitioner name for second procedure:");
        procedure2.setPractitionerName(scanner.nextLine());
        System.out.println("Enter charges for second procedure:");
        procedure2.setCharges(scanner.nextDouble());

        scanner.nextLine(); // Clear the buffer

        Procedure procedure3 = new Procedure();
        System.out.println("Enter third procedure name:");
        procedure3.setProcedureName(scanner.nextLine());
        System.out.println("Enter third procedure date:");
        procedure3.setProcedureDate(scanner.nextLine());
        System.out.println("Enter practitioner name for third procedure:");
        procedure3.setPractitionerName(scanner.nextLine());
        System.out.println("Enter charges for third procedure:");
        procedure3.setCharges(scanner.nextDouble());

        // Display all three procedures
        System.out.println("\nProcedure 1:");
        displayProcedure(procedure1);
        System.out.println("\nProcedure 2:");
        displayProcedure(procedure2);
        System.out.println("\nProcedure 3:");
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("\nTotal charges for all procedures: $" + String.format("%.2f", totalCharges));

        // Close the scanner
        scanner.close();
    }
}
