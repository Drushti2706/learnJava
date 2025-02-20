import java.util.Scanner;

public class TowerOfHanoiRecursion
{

    // Recursive method for Tower of Hanoi
    static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        solveHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();
        
        System.out.println("Solution for Tower of Hanoi with " + n + " disks:");
        solveHanoi(n, 'A', 'C', 'B'); // A = Source, C = Destination, B = Auxiliary
        
        scanner.close();
    }
}
