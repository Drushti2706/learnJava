import java.util.Scanner;

public class UserDetailsForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.println("*** User Details Form ***");

        System.out.print("Enter your Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your Address: ");
        String address = scanner.nextLine();

        // Display collected details
        System.out.println("\n### User Information Summary ###");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Gender   : " + gender);
        System.out.println("Email    : " + email);
        System.out.println("Phone    : " + phone);
        System.out.println("Address  : " + address);

        System.out.println("\nThank you! ");

        scanner.close();
    }
}
