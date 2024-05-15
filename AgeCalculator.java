import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's date of birth
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        // Parse the input into a LocalDate object
        LocalDate dob = LocalDate.parse(dobString);

        // Calculate the age
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dob, currentDate);

        // Display the age
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");

        scanner.close();
    }
}

