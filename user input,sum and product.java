import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Print sum and product on the same line
        System.out.println(a + b + " " + (a * b));

        scanner.close();
    }
}
