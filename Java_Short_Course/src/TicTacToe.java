import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();

        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();

            int row = -1;
            int col = -1;

            // Input validation
            while (true) {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0, 1, or 2):");
                System.out.print("Row: ");
                row = sc.nextInt();
                System.out.print("Column: ");
                col = sc.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("This position is out of bounds. Try again.");
                } else if (board[row][col] != ' ') {
                    System.out.println("This cell is already occupied. Try again.");
                } else {
                    break;
                }
            }

            board[row][col] = currentPlayer;

            // Check for win
            if (checkWin(row, col)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    static boolean checkWin(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer &&
            board[row][1] == currentPlayer &&
            board[row][2] == currentPlayer) return true;

        // Check column
        if (board[0][col] == currentPlayer &&
            board[1][col] == currentPlayer &&
            board[2][col] == currentPlayer) return true;

        // Check diagonal
        if (row == col && board[0][0] == currentPlayer &&
                         board[1][1] == currentPlayer &&
                         board[2][2] == currentPlayer) return true;

        // Check anti-diagonal
        if (row + col == 2 && board[0][2] == currentPlayer &&
                             board[1][1] == currentPlayer &&
                             board[2][0] == currentPlayer) return true;

        return false;
        
        
        
        
    }
}
