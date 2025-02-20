//import java.util.*;


//public class Loops {
  //  public static void main(String[] args) {
        // 1. For Loop: Prints numbers from 1 to 5
    //    System.out.println("For Loop:");
      //  for (int i = 1; i <= 5; i++) {
        //    System.out.println(i);
        //}

        // 2. While Loop: Prints numbers from 1 to 5
        //System.out.println("\nWhile Loop:");
        //int j = 1;
        //while (j <= 5) {
          //  System.out.println(j);
            //j++;
        //}

        // 3. Do-While Loop: Prints numbers from 1 to 5
        //System.out.println("\nDo-While Loop:");
        //int k = 1;
        //do {
          //  System.out.println(k);
            //k++;
        //} while (k <= 5);

        // 4. For-Each Loop: Iterates through an array
        //System.out.println("\nFor-Each Loop:");
        //int[] numbers = {1, 2, 3, 4, 5};
        //for (int num : numbers) {
          //  System.out.println(num);
        //}
    //}
//}


//import java.util.Scanner;

//public class Loops {
  //  public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
        
        // Taking input for the loop count
      //  System.out.print("Enter the number of iterations: ");
        //int n = scanner.nextInt();

        //System.out.println("\nUsing for loop:");
        //for (int i = 1; i <= n; i++) {
          //  System.out.println("Iteration " + i);
        //}

        //System.out.println("\nUsing while loop:");
        //int j = 1;
        //while (j <= n) {
          //  System.out.println("Iteration " + j);
            //j++;
        //}
        
       // System.out.println("\nUsing do-while loop:");
        //int k = 1;
        //do {
          //  System.out.println("Iteration " + k);
            //k++;
        //} while (k <= n);
        
        //scanner.close();
    //}
//}


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Loop: Print first N natural numbers
        
        System.out.print("Enter a number for for-loop: ");
        int n = scanner.nextInt();
        System.out.println("First " + n + " natural numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // While Loop: Sum of digits of a number
        System.out.print("Enter a number for while-loop: ");
        int num = scanner.nextInt();
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " is: " + sum);
        System.out.println();

        // Do-While Loop: Reverse a number
        System.out.print("Enter a number for do-while-loop: ");
        int number = scanner.nextInt();
        int reversed = 0, original = number;
        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number > 0);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}



