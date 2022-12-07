package students.student_jurij_hlebnikov.homework_leson_6;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        test.shouldWinVerticalLineOneTest();
        test.shouldWinVerticalLineTwoTest();
        test.shouldWinVerticalLineThreeTest();
        test.shouldNotWinVerticalLineTest();
        test.shouldWinHorizontalPilarOneTest();
        test.shouldWinHorizontalPilarTwoTest();
        test.shouldWinHorizontalPilarThreeTest();
        test.shouldNotWinHorizontalPilarOneTest();
    }

    public void shouldWinVerticalLineOneTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][0] = 0;
        square[1][0] = 0;
        square[2][0] = 0;

        boolean playerWin = testWin.isWinPositionForVerticals(square, 0);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Line One: OK");
        } else {
            System.out.println("TicTacToeTest Win Line One: FAIL");
        }

    }

    public void shouldWinVerticalLineTwoTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][1] = 1;
        square[1][1] = 1;
        square[2][1] = 1;

        boolean playerWin = testWin.isWinPositionForVerticals(square, 1);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Line Two: OK");
        } else {
            System.out.println("TicTacToeTest Win Line Two: FAIL");
        }
    }

    public void shouldWinVerticalLineThreeTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][2] = 0;
        square[1][2] = 0;
        square[2][2] = 0;

        boolean playerWin = testWin.isWinPositionForVerticals(square, 0);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Line Three: OK");
        } else {
            System.out.println("TicTacToeTest Win Line Three: FAIL");
        }
    }

    public void shouldNotWinVerticalLineTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][0] = 1;
        square[1][0] = 0;
        square[2][0] = 1;

        boolean playerWin = testWin.isWinPositionForVerticals(square, 2);

        if (playerWin == false) {
            System.out.println("TicTacToeTest Not Win Line Three: OK");
        } else {
            System.out.println("TicTacToeTest Not Win Line Three: FAIL");
        }
    }

    public void shouldWinHorizontalPilarOneTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][0] = 0;
        square[0][1] = 0;
        square[0][2] = 0;

        boolean playerWin = testWin.isWinPositionForHorizontals(square, 0);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Pilar One: OK");
        } else {
            System.out.println("TicTacToeTest Win Pilar One: FAIL");
        }
    }

    public void shouldWinHorizontalPilarTwoTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[1][0] = 0;
        square[1][1] = 0;
        square[1][2] = 0;

        boolean playerWin = testWin.isWinPositionForHorizontals(square, 0);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Pilar Two: OK");
        } else {
            System.out.println("TicTacToeTest Win Pilar Two: FAIL");
        }
    }

    public void shouldWinHorizontalPilarThreeTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[2][0] = 1;
        square[2][1] = 1;
        square[2][2] = 1;

        boolean playerWin = testWin.isWinPositionForHorizontals(square, 1);

        if (playerWin == true) {
            System.out.println("TicTacToeTest Win Pilar Three: OK");
        } else {
            System.out.println("TicTacToeTest Win Pilar Three: FAIL");
        }
    }

    public void shouldNotWinHorizontalPilarOneTest() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][0] = 0;
        square[0][1] = 1;
        square[0][2] = 0;

        boolean playerWin = testWin.isWinPositionForHorizontals(square, 0);

        if (playerWin == false) {
            System.out.println("TicTacToeTest Not Win Pilar One: OK");
        } else {
            System.out.println("TicTacToeTest Not Win Pilar One: FAIL");
        }
    }

}


/**
 * x  00     01     02
 * y
 * 00    -1  |  -1   |  -1
 * <p>
 * 10    -1  |  -1   |  -1
 * <p>
 * 20    -1  |  -1   |  -1
 */
