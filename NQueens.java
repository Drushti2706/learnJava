//import java.util.Scanner;
//
//public class NQueens {
  //  static int N;

    // Function to print the solution
 //static void printSolution(int board[][]) {
   //     for (int i = 0; i < N; i++) {
     //       for (int j = 0; j < N; j++) {
       //         System.out.print((board[i][j] == 1 ? "Q " : ". "));
         //   }
           // System.out.println();
        //}
        //System.out.println();
    //}

    // Function to check if it's safe to place a queen
  //  static boolean isSafe(int board[][], int row, int col) {
        // Check this column for any queen
     //   for (int i = 0; i < row; i++)
       //     if (board[i][col] == 1)
          //      return false;

        // Check upper-left diagonal
        //for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
          //  if (board[i][j] == 1)
            //    return false;

        // Check upper-right diagonal
        //for (int i = row, j = col; i >= 0 && j < N; i--, j++)
          //  if (board[i][j] == 1)
            //    return false;

        //return true;
    //}

    // Function to solve N-Queens using backtracking
//  static boolean solveNQueens(int board[][], int row) {
      //  if (row >= N) { // Base case: All queens placed
        //    printSolution(board);
          //  return true;
        //}

        //boolean success = false;
        //for (int col = 0; col < N; col++) {
        //    if (isSafe(board, row, col)) {
          //      board[row][col] = 1; // Place queen
            //    success = solveNQueens(board, row + 1) || success;
              //  board[row][col] = 0; // Backtrack
            //}
        //}
        //return success;
    //}

  //  public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
       //   System.out.print("Enter the number of queens (N): ");
      //  N = scanner.nextInt();

       // int board[][] = new int[N][N];
       // if (!solveNQueens(board, 0)) {
        //    System.out.println("No solution exists.");
       // }
       // scanner.close();
   // }
//}
import java.util.Scanner;
public class NQueens {
    static final int N = 8; // Size of the chessboard

    // Function to print the solution
    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((board[i][j] == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to check if a queen can be placed at board[row][col]
    static boolean isSafe(int board[][], int row, int col) {
        // Check this column for any queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    // Recursive function to solve N-Queens problem
    static boolean solveNQueens(int board[][], int row) {
        if (row >= N) { // All queens placed successfully
            printSolution(board);
            return true;
        }

        boolean success = false;

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                success = solveNQueens(board, row + 1) || success;
                board[row][col] = 0; // Backtrack
            }
        }

        return success;
    }

    public static void main(String[] args) {
        int board[][] = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists");
        }
    }
}

