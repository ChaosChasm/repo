/*
 * Class: CMSC203
 * Instructor: Huseyin Aygun
 * Description: ESPGame lets the user try to guess randomly selected colors
 *              from a file. Tracks correct guesses, user info, and outputs results.
 * Due: 09/08/2025
 * Platform/compiler: Eclipse, Windows 11
 * 
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * 
 * Print your Name here: Kaden Shrestha
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) throws IOException {
        
    	Scanner inputFileName = new Scanner(System.in);
    	System.out.println("Enter the ABSOLUTE filepath for colors: ");
    	String INPUT_FILE = inputFileName.nextLine();
        
        final String OUTPUT_FILE = "EspGameResults.txt";
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        String choice;
        int option;
        boolean keepPlaying = true;

        do {
            System.out.println("1. Display first 16 colors");
            System.out.println("2. Display first 10 colors");
            System.out.println("3. Display first 5 colors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = keyboard.nextInt();
            keyboard.nextLine();

            if (option == 4) {
                System.out.print("Enter your name: ");
                String username = keyboard.nextLine();
                System.out.print("Describe yourself: ");
                String description = keyboard.nextLine();
                System.out.print("Due Date (MM/DD/YY): ");
                String dueDate = keyboard.nextLine();

                PrintWriter output = new PrintWriter(new FileWriter(OUTPUT_FILE, true));
                output.println("Due Date: " + dueDate);
                output.println("Username: " + username);
                output.println("User Description: " + description);
                output.println("Date: " + dueDate);
                output.close();

                System.out.println("\nDue Date: " + dueDate);
                System.out.println("Username: " + username);
                System.out.println("User Description: " + description);
                System.out.println("Date: " + dueDate);

                keepPlaying = false;
            } else if (option >= 1 && option <= 3) {
                int maxColors = (option == 1 ? 16 : option == 2 ? 10 : 5);
                Scanner fileScan = new Scanner(new File(INPUT_FILE));

                // Display colors
                System.out.println("Colors available:");
                int lineCount = 0;
                while (fileScan.hasNextLine() && lineCount < maxColors) {
                    String color = fileScan.nextLine();
                    lineCount++;
                    System.out.println(lineCount + ". " + color);
                }
                fileScan.close();

                int correctGuesses = 0;

                for (int round = 1; round <= 3; round++) {
                    System.out.println("\nRound " + round);
                    System.out.println("I am thinking of a color...");
                    int randNum = rand.nextInt(maxColors) + 1;

                    // reread file to pick that color
                    Scanner fileRead = new Scanner(new File(INPUT_FILE));
                    int counter = 0;
                    String selectedColor = "";
                    while (fileRead.hasNextLine() && counter < randNum) {
                        selectedColor = fileRead.nextLine();
                        counter++;
                    }
                    fileRead.close();

                    System.out.print("Enter your guess: ");
                    String guess = keyboard.nextLine();

                    if (guess.equalsIgnoreCase(selectedColor)) {
                        correctGuesses++;
                    }
                    System.out.println("I was thinking of " + selectedColor + ".");
                }

                System.out.println("Game Over");
                System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

                PrintWriter output = new PrintWriter(new FileWriter(OUTPUT_FILE, true));
                output.println("Game Over");
                output.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
                output.close();

                System.out.print("\nWould you like to continue the game? Type Y/N: ");
                choice = keyboard.nextLine();
                if (!choice.equalsIgnoreCase("Y")) {
                	System.out.print("Enter your name: ");
                    String username = keyboard.nextLine();
                    System.out.print("Describe yourself: ");
                    String description = keyboard.nextLine();
                    System.out.print("Due Date (MM/DD/YY): ");
                    String dueDate = keyboard.nextLine();

                    PrintWriter output1 = new PrintWriter(new FileWriter(OUTPUT_FILE, true));
                    output1.println("Due Date: " + dueDate);
                    output1.println("Username: " + username);
                    output1.println("User Description: " + description);
                    output1.println("Date: " + dueDate);
                    output1.close();

                    System.out.println("\nDue Date: " + dueDate);
                    System.out.println("Username: " + username);
                    System.out.println("User Description: " + description);
                    System.out.println("Date: " + dueDate);
                    
                	keepPlaying = false;
                }
            } else {
                System.out.println("Invalid option. Try again.");
            }
        } while (keepPlaying);

        keyboard.close();
    }
}
