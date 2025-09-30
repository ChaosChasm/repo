import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            // Create a new movie object using the default constructor
            Movie movie = new Movie();

            // Prompt the user for the movie title
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title); // Set the movie title

            // Prompt the user for the movie rating
            System.out.print("Enter the rating of the movie: ");
            String rating = scanner.nextLine();
            movie.setRating(rating); // Set the movie rating

            // Prompt the user for the number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold); // Set the number of tickets sold

            // Consume the leftover newline character after reading the integer
            scanner.nextLine();  // This clears the buffer

            // Print the movie's information using the toString method
            System.out.println("\nMovie Information:");
            System.out.println(movie.toString());

            // Ask the user if they want to continue
            System.out.print("\nDo you want to enter another movie? (yes/no): ");
            String response = scanner.nextLine();

            // If the user does not want to continue, exit the loop
            if (!response.equalsIgnoreCase("yes")) {
                continueInput = false;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
