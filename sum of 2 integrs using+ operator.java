import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum
        int sum = a + b;

        // Print the result
        System.out.println(sum);

        // Close the scanner
        sc.close();
    }
}
