import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read base and height as floating-point numbers
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Calculate the area using the formula (1/2) * base * height
        double area = 0.5 * base * height;

        // Print the result
        System.out.println(area);

        // Close the scanner
        sc.close();
    }
}
