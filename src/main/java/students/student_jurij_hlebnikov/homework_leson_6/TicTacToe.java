package students.student_jurij_hlebnikov.homework_leson_6;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        boolean lineOneWin = checkLineForWin(field, playerToCheck, 0);
        boolean lineTwoWin = checkLineForWin(field, playerToCheck, 1);
        boolean lineThreeWin = checkLineForWin(field, playerToCheck, 2);

        if (lineOneWin || lineTwoWin || lineThreeWin) {
            return true;
        } else {

            return false;
        }
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        boolean pilarOneWin = checkPilarForWin(field, playerToCheck, 0);
        boolean pilarTwoWin = checkPilarForWin(field, playerToCheck, 1);
        boolean pilarThreeWin = checkPilarForWin(field, playerToCheck, 2);

        if (pilarOneWin || pilarTwoWin || pilarThreeWin) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkLineForWin(int[][] field,
                                    int playerToCheck,
                                    int lineNumber) {

        if (field[lineNumber][0] == playerToCheck &&
                field[lineNumber][1] == playerToCheck &&
                field[lineNumber][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkPilarForWin(int[][] field,
                                     int playerToCheck,
                                     int pilarNumber) {

        if (field[0][pilarNumber] == playerToCheck &&
                field[1][pilarNumber] == playerToCheck &&
                field[2][pilarNumber] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }
}
