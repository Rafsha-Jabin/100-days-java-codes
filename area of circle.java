import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the radius as a double
        double radius = sc.nextDouble();

        // Define pi as 3.14
        double pi = 3.14;

        // Calculate the area using the formula A = pi * r * r
        double area = pi * radius * radius;

        // Print the calculated area
        System.out.println(area);

        // Close the scanner
        sc.close();
    }
}
