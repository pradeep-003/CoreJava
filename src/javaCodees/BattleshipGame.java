package javaCodees;

import java.util.Arrays;
import java.util.Scanner;

public class BattleshipGame {
    private static final int BOARD_SIZE = 5;
    private static final int NUM_SHIPS = 3;

    private char[][] board;
    private int shipsRemaining;

    public BattleshipGame() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (char[] row : board) {
            Arrays.fill(row, '-');
        }
        shipsRemaining = NUM_SHIPS;
    }

    public void play() {
        initializeShips();
        Scanner scanner = new Scanner(System.in);

        while (shipsRemaining > 0) {
            displayBoard();
            System.out.print("Enter row (0-" + (BOARD_SIZE - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-" + (BOARD_SIZE - 1) + "): ");
            int col = scanner.nextInt();

            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
                System.out.println("Invalid position. Try again.");
                continue;
            }

            if (board[row][col] == 'X') {
                System.out.println("You've already guessed that position.");
            } else if (board[row][col] == '*') {
                System.out.println("Congratulations! You sank a battleship!");
                board[row][col] = 'X';
                shipsRemaining--;
            } else {
                System.out.println("You missed!");
                board[row][col] = 'X';
            }
        }

        displayBoard();
        System.out.println("Congratulations! You sank all the battleships!");
        scanner.close();
    }

    private void initializeShips() {
        int shipsPlaced = 0;

        while (shipsPlaced < NUM_SHIPS) {
            int row = (int) (Math.random() * BOARD_SIZE);
            int col = (int) (Math.random() * BOARD_SIZE);

            if (board[row][col] != '*') {
                board[row][col] = '*';
                shipsPlaced++;
            }
        }
    }

    private void displayBoard() {
        System.out.println("Battleship Game");
        System.out.println();

        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.play();
    }
}