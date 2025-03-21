import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P = scanner.nextDouble(); 
        double R = scanner.nextDouble(); 
        double T = scanner.nextDouble(); 
        scanner.close();
        
        
        double A = P * Math.pow((1 + R / 100), T);
        
        
        System.out.printf("%.2f\n", A);
    }
}
