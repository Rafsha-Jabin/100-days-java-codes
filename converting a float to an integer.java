import java.util.Scanner;

public class FloatToIntConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the float number
        float number = sc.nextFloat();

        // Convert the float to an integer using type casting
        int convertedNumber = (int) number;

        // Print the converted integer value
        System.out.println(convertedNumber);

        // Close the scanner
        sc.close();
    }
}
