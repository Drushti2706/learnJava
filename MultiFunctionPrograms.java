import java.util.Scanner;
import java.util.Random;

public class MultiFunctionPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Find Area of a Circle");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Check Leap Year");
            System.out.println("4. Find ASCII Value of a Character");
            System.out.println("5. Swap Two Numbers Without Temp Variable");
            System.out.println("6. Calculate Simple Interest");
            System.out.println("7. Find GCD of Two Numbers");
            System.out.println("8. Generate a Random Number");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            if (choice == 9) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + areaOfCircle(radius));
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.out.print("Enter a year: ");
                    int year = scanner.nextInt();
                    System.out.println(year + (isLeapYear(year) ? " is a Leap Year." : " is not a Leap Year."));
                    break;
                case 4:
                    System.out.print("Enter a character: ");
                    char ch = scanner.next().charAt(0);
                    System.out.println("ASCII value of " + ch + " is " + (int) ch);
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    swapNumbers(x, y);
                    break;
                case 6:
                    System.out.print("Enter Principal, Rate of Interest, and Time (years): ");
                    double p = scanner.nextDouble(), r = scanner.nextDouble(), t = scanner.nextDouble();
                    System.out.println("Simple Interest: " + simpleInterest(p, r, t));
                    break;
                case 7:
                    System.out.print("Enter two numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
                    break;
                case 8:
                    System.out.println("Random Number: " + (random.nextInt(100) + 1));
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    // 1. Calculate Area of a Circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 3. Check if a year is Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 5. Swap two numbers without a temporary variable
    public static void swapNumbers(int a, int b) {
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }

    // 6. Calculate Simple Interest
    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // 7. Find GCD (Greatest Common Divisor)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
