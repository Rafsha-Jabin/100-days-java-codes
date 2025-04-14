import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble(); // Annual income
        scanner.close();
        
        double tax = 0.0;
        
        // Calculate tax based on income slabs
        if (income > 1000000) {
            tax = (income - 1000000) * 0.30 + 112500;
        } else if (income > 500000) {
            tax = (income - 500000) * 0.20 + 12500;
        } else if (income > 250000) {
            tax = (income - 250000) * 0.05;
        }
        
        // Print the tax amount rounded to one decimal place
        System.out.printf("%.1f\n", tax);
    }
}
