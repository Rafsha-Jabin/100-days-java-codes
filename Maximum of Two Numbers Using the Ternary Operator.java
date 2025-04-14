import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        scanner.close();
        
        int max = (a > b) ? a : b;
        
        System.out.println(max);
    }
}
