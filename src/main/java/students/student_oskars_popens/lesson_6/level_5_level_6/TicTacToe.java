package students.student_oskars_popens.lesson_6.level_5_level_6;

import java.util.Scanner;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWin = false;
        for (int row = 0; row <= 2; row++) {
            if (field[row][0] == playerToCheck &&
                    field[row][1] == playerToCheck &&
                    field[row][2] == playerToCheck) {
                isWin = true;
                break;
            }
        }
        return isWin;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWin = false;
        for (int col = 0; col <= 2; col++) {
            if (field[0][col] == playerToCheck &&
                    field[1][col] == playerToCheck &&
                    field[2][col] == playerToCheck) {
                isWin = true;
                break;
            }
        }
        return isWin;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if ((   field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) ||
               (field[0][2] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][0] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean hasEmptyField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        if (!hasEmptyField(field) &&
                !isWinPosition(field, 0) &&
                !isWinPosition(field, 1)) {
            return true;
        }
        return false;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter coordinates for your move: ");
        System.out.print("Enter coordinate \"X\": ");
        int x = userInput.nextInt();
        System.out.print("Enter coordinate \"Y\": ");
        int y = userInput.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        System.out.printf("  | 0 | 1 | 2 \n");
        System.out.printf("--|---+---+---\n");
        for (int y = 0; y < field.length; y++) {
            System.out.printf(" %1d|", y);
            for (int x = 0; x < field[y].length; x++) {
                char positionChar;
                if (field[x][y]==0){
                    positionChar = '*';
                } else if (field[x][y]==1) {
                    positionChar = 'X';
                }
                else {
                    positionChar = ' ';
                }

                System.out.printf(" %c ", positionChar);
                if (x!=2){
                    System.out.print("|");
                }
            }
            if (y<2){
                System.out.printf("\n--|---+---+---\n");
            } else {
                System.out.printf("\n\n");
            }
        }
        System.out.println("Player 0 - 0; Player 1 - X\n");

    }

    public boolean isWin(int[][] field, int playerToCheck){
        return isWinPosition(field, playerToCheck);
    }

    public boolean isDraw(int[][] field){
        return isDrawPosition(createField());
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            System.out.println("Player 0");
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("Player 1");
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
