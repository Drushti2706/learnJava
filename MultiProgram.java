import java.util.Scanner;

public class MultiProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Reverse a Number");
            System.out.println("3. Sum of Digits");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                case 2:
                    System.out.println("Reversed number: " + reverseNumber(num));
                    break;
                case 3:
                    System.out.println("Sum of digits: " + sumOfDigits(num));
                    break;
                case 4:
                    if (isPalindrome(num)) {
                        System.out.println(num + " is a palindrome.");
                    } else {
                        System.out.println(num + " is not a palindrome.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to reverse a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // Method to find the sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }
}
