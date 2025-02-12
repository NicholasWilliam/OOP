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
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe(); // Membuat instance dari kelas TicTacToe
        boolean isPlayer1Turn = true;
        int moves = 0;

        System.out.println("Start!");
        game.printBoard(); // Memanggil method printBoard melalui instance

        while (true) {
            char currentSymbol = isPlayer1Turn ? 'O' : 'X';
            System.out.println("Player " + (isPlayer1Turn ? "1" : "2") + " (" + currentSymbol + "), masukkan posisi (x y):");

            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (x < 0 || x > 2 || y < 0 || y > 2 || game.board[x][y] != '-') {
                System.out.println("Posisi tidak valid! Coba lagi.");
                continue;
            }

            game.board[x][y] = currentSymbol;
            moves++;
            game.printBoard();

            if (game.checkWin(currentSymbol)) { // Memanggil checkWin melalui instance
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