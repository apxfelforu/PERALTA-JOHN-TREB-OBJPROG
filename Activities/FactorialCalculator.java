import java.util.Scanner;
 
public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
 }
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) { 
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0) { 
                    break; 
                } else { 
                System.out.println("Error. Try again.");}}
           else {     
                System.out.println("Ente a non-negative integer: ");
                scanner.next();}}
        return num;
    }
    public static long calculateFactorial(int n) {
        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    }