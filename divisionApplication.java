import java.util.Scanner;

public class DivisionApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("The result of division is: " + result);
        } catch (Exception e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }
    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
