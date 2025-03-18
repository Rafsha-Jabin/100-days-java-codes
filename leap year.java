import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the year from input
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
        
        // Close the scanner
        scanner.close();
    }
}
