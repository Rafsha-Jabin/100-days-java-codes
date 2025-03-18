import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read an integer input
        int n = sc.nextInt();

        // Check if the number is positive, negative, or zero
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close the scanner
        sc.close();
    }
}
