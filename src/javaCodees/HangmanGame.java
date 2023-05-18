package javaCodees;

import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"apple", "banana", "orange", "grape", "melon"};
    private static final int MAX_MISSES = 6;

    public static void main(String[] args) {
        String wordToGuess = getRandomWord();
        char[] guessedLetters = new char[wordToGuess.length()];
        int misses = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayHangman(misses);
            displayWord(guessedLetters);

            System.out.print("Enter a letter: ");
            char letter = scanner.nextLine().toLowerCase().charAt(0);

            if (isLetterGuessed(letter, guessedLetters)) {
                System.out.println("You've already guessed that letter!");
                continue;
            }

            if (isLetterInWord(letter, wordToGuess)) {
                updateGuessedLetters(letter, wordToGuess, guessedLetters);
                if (isWordGuessed(guessedLetters)) {
                    System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                    break;
                }
            } else {
                misses++;
                if (misses == MAX_MISSES) {
                    displayHangman(misses);
                    System.out.println("You lost! The word was: " + wordToGuess);
                    break;
                }
            }
        }

        scanner.close();
    }

    private static String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    private static void displayHangman(int misses) {
        System.out.println("+---+");
        System.out.println("|   |");
        System.out.println("|   " + (misses >= 1 ? "O" : ""));
        System.out.println("|  " + (misses >= 3 ? "/" : "") + (misses >= 2 ? "|" : "") + (misses >= 4 ? "\\" : ""));
        System.out.println("|  " + (misses >= 5 ? "/" : "") + " " + (misses >= 6 ? "\\" : ""));
        System.out.println("|");
        System.out.println("|");
        System.out.println("=======");
    }

    private static void displayWord(char[] guessedLetters) {
        System.out.print("Word: ");
        for (char letter : guessedLetters) {
            System.out.print(letter != 0 ? letter : "_");
            System.out.print(" ");
        }
        System.out.println();
    }

    private static boolean isLetterGuessed(char letter, char[] guessedLetters) {
        for (char guessedLetter : guessedLetters) {
            if (guessedLetter == letter) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLetterInWord(char letter, String word) {
        return word.indexOf(letter) >= 0;
    }

    private static void updateGuessedLetters(char letter, String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = letter;
            }
        }
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char letter : guessedLetters) {
            if (letter == 0) {
                return false;
            }
        }
        return true;
    }
}
