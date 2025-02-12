import java.util.Scanner;
 
public class TicTacToe {
    public char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    boolean checkWin(char symbol) {
        // Horizontal and Vertical Check
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        // Diagonal Check
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlayer1Turn = true;
        int moves = 0;

        System.out.println("Game Tic Tac Toe Dimulai!");
        printBoard();

        while (true) {
            char currentSymbol = isPlayer1Turn ? 'O' : 'X';
            System.out.println("Player " + (isPlayer1Turn ? "1" : "2") + " (" + currentSymbol + "), masukkan posisi (x y):");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 0 || x > 2 || y < 0 || y > 2 || board[x][y] != '-') {
                System.out.println("Posisi tidak valid! Coba lagi.");
                continue;
            }

            board[x][y] = currentSymbol;
            moves++;
            printBoard();

            if (checkWin(currentSymbol)) {
                System.out.println("Player " + (isPlayer1Turn ? "1" : "2") + " menang!");
                break;
            }

            if (moves == 9) {
                System.out.println("Permainan seri!");
                break;
            }

            isPlayer1Turn = !isPlayer1Turn;
        }

        scanner.close();
    }
}
