package students.student_jurij_hlebnikov.homework_leson_6;

class TicTacToe {   //Task 22

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        boolean diagonalWinOne = checkDiagonalOneForWin(field, playerToCheck);
        boolean diagonalWinTwo = checkDiagonalTwoForWin(field, playerToCheck);

        if (diagonalWinOne || diagonalWinTwo) {
            return true;
        } else {
            return false;
        }
    }


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

    private boolean checkDiagonalOneForWin(int[][] field,
                                           int playerToCheck) {
        int diagonalOne1 = field[0][0];
        int diagonalOne2 = field[1][1];
        int diagonalOne3 = field[2][2];

        if (diagonalOne1 == playerToCheck &&
                diagonalOne2 == playerToCheck &&
                diagonalOne3 == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkDiagonalTwoForWin(int[][] field, int playerToCheck) {

        int diagonalTwo1 = field[0][2];
        int diagonalTwo2 = field[1][1];
        int diagonalTwo3 = field[2][0];

        if (diagonalTwo1 == playerToCheck &&
                diagonalTwo2 == playerToCheck &&
                diagonalTwo3 == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }
}
