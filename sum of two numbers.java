import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read two integers from the input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum
        int sum = a + b;

        // Output the result
        System.out.println(sum);

        // Close the scanner
        sc.close();
    }
}
