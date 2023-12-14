import java.util.Scanner;

public class PerfectNumber{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a perfect number: ");
        int perfectNumber = scanner.nextInt();
        
        if (perfectNumber <= 0) {
        System.out.println("Invalid input. Please enter a positive integer.");
    
        scanner.close();
        return;
        }

        if (isPerfectNumber(perfectNumber)) {
            System.out.println(perfectNumber + " is a perfect number.");
        } else {
            System.out.println(perfectNumber + " is not a perfect number.");
        }

        System.out.println("Perfect numbers in the range [1, " + perfectNumber + "] are:");

        boolean perfectNumberFound = false;
        for (int i = 1; i <= perfectNumber; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
                perfectNumberFound = true;
            }
        }

        if (perfectNumberFound) {
            int sum = sumOfPerfectNumbers(perfectNumber);
            System.out.println("Sum of all perfect numbers in the range [1, " + perfectNumber + "]: " + sum);
        } else {
            System.out.println("No perfect numbers found in the specified range.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static int sumOfPerfectNumbers(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            if (isPerfectNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
