import java.util.Scanner;

public class MultiFunctionProgram
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Find Largest of Three Numbers");
            System.out.println("3. Count Digits in a Number");
            System.out.println("4. Check Armstrong Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = scanner.nextInt();
                    if (isEven(num1)) {
                        System.out.println(num1 + " is Even.");
                    } else {
                        System.out.println(num1 + " is Odd.");
                    }
                    break;
                case 2:
                    System.out.print("Enter three numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    System.out.println("Largest number: " + largestOfThree(a, b, c));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Number of digits: " + countDigits(num2));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int num3 = scanner.nextInt();
                    if (isArmstrong(num3)) {
                        System.out.println(num3 + " is an Armstrong number.");
                    } else {
                        System.out.println(num3 + " is not an Armstrong number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Method to find the largest of three numbers
    public static int largestOfThree(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    // Method to count the number of digits in a number
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = countDigits(n);
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
