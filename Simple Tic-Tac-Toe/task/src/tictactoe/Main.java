package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialise the board with spaces
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        printBoard(board);
        boolean gameOver = false;
        // Starting move is 'X'
        char move = 'X';
        while (!gameOver) {
            // Player input
            int playerMove1;
            int playerMove2;
            Scanner scanner = new Scanner(System.in);
            // Check for input to be numbers
            if (scanner.hasNextInt()) {
                playerMove1 = scanner.nextInt();
            } else {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (scanner.hasNextInt()) {
                playerMove2 = scanner.nextInt();
            } else {
                System.out.println("You should enter numbers!");
                continue;
            }
            // Check if the input is in the correct range
            if ((playerMove1 < 4 && playerMove2 < 4) && (playerMove1 > 0 && playerMove2 > 0)) {
                --playerMove1;
                --playerMove2;
                boolean isCellFree = isCellFree(playerMove1, playerMove2, board);
                // Check if the cell is free to receive a new move
                if (!isCellFree) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    addMoveToBoard(playerMove1, playerMove2, board, move);
                    if (move == 'X') {
                        move = 'O';
                    } else {
                        move = 'X';
                    }
                }
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
            printBoard(board);
            String results = analyseResults(board);
            // Win or draw closes the game
            if (results.contains("win") || results.contains("Draw")) {
                gameOver = true;
            }
        }
    }

    /**
     * prints the game board
     *
     * @param board provide a multidimensional array to print
     */
    private static void printBoard(char[][] board) {
        System.out.println("---------");
        for (char[] chars : board) {
            System.out.println("|" + " " + chars[0] + " " + chars[1] + " " + chars[2] + " " + "|");
        }
        System.out.println("---------");
    }

    /**
     * adds current player move to the game board
     *
     * @param playerMove1 provide first coordinates for registering the player move on the board
     * @param playerMove2 provide second coordinates for registering the player move on the board
     * @param board       the game board 2d array
     * @param player      who is the current player 'X' or 'O'
     */
    private static void addMoveToBoard(int playerMove1, int playerMove2, char[][] board, char player) {
        board[playerMove1][playerMove2] = player;
    }

    /**
     * check if the cell is free
     *
     * @param playerMove1 provide first coordinates for checking the player move on the board
     * @param playerMove2 provide second coordinates for checking the player move on the board
     * @param board       the game board
     * @return true if the cell is free false if the cell is occupied
     */
    private static boolean isCellFree(int playerMove1, int playerMove2, char[][] board) {
        boolean isSpace = String.valueOf(board[playerMove1][playerMove2]).equals(" ");
        boolean isUnderscore = String.valueOf(board[playerMove1][playerMove2]).equals("_");
        return isSpace || isUnderscore;
    }

    /**
     * check for difference between players moves
     *
     * @param board the game board
     * @return true if the moves ar legal (less than one). return false if illegal(2 or more).
     */
    private static boolean isTheDifference2orMore(char[][] board) {
        int x = countGameBoard(board, 'X');
        int o = countGameBoard(board, 'O');
        return (x - o > 1 || o - x > 1);
    }

    /**
     * Count a character on the game-board
     *
     * @param board the game board
     * @param sym   character we are counting
     * @return the count
     */
    private static int countGameBoard(char[][] board, char sym) {
        int count = 0;
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                if (chars[j] == sym) count++;
            }
        }
        return count;
    }

    /**
     * Analyse the games states and returns the result
     *
     * @param board the game board
     * @return the game state as a String
     */
    private static String analyseResults(char[][] board) {
        if (isWin(board, 'X') && isWin(board, 'O') || isTheDifference2orMore(board)) {
            return "Impossible";
        } else if (countGameBoard(board, ' ') + countGameBoard(board, '_') > 0 &&
                !isWin(board, 'X') &&
                !isWin(board, 'O')) {
            return "Game not finished";
        } else if (isWin(board, 'X')) {
            System.out.println("X wins");
            return "X wins";
        } else if (isWin(board, 'O')) {
            System.out.println("O wins");
            return "O wins";
        } else {
            System.out.println("Draw");
            return "Draw";
        }
    }

    /**
     * Checks the board for win condition of the symbol passed
     * check for 3 horizontal, for 3 vertical and for 3 diagonal
     *
     * @param board the game board
     * @param sym   the symbol to analyse : 'X' or 'O'
     * @return true if win conditions are achieved
     */

    private static boolean isWin(char[][] board, char sym) {
        // Horizontal
        return board[0][0] == sym && board[0][1] == sym && board[0][2] == sym ||
                board[1][0] == sym && board[1][1] == sym && board[1][2] == sym ||
                board[2][0] == sym && board[2][1] == sym && board[2][2] == sym ||
                // Vertical
                board[0][0] == sym && board[1][0] == sym && board[2][0] == sym ||
                board[0][1] == sym && board[1][1] == sym && board[2][1] == sym ||
                board[0][2] == sym && board[1][2] == sym && board[2][2] == sym ||
                // Diagonal
                board[0][0] == sym && board[1][1] == sym && board[2][2] == sym ||
                board[0][2] == sym && board[1][1] == sym && board[2][0] == sym;
    }
}


