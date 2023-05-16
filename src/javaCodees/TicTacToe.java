package javaCodees;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private boolean gameEnded;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameEnded = false;

        // Initialize the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Tic-Tac-Toe!");

        while (!gameEnded) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]):");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;

                if (checkWin(row, col)) {
                    gameEnded = true;
                    System.out.println("Congratulations! Player " + currentPlayer + " wins!");
                } else if (isBoardFull()) {
                    gameEnded = true;
                    System.out.println("It's a draw!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        printBoard();
        scanner.close();
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private boolean checkWin(int row, int col) {
        // Check row
        if (board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
            return true;
        }

        // Check column
        if (board[0][col] == board[1][col] && board[0][col] == board[2][col]) {
            return true;
        }

        // Check diagonal
        if (row == col && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }

        // Check anti-diagonal
        if (row + col == 2 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
