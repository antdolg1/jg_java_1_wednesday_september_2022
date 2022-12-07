package students.student_jurij_hlebnikov.homework_leson_6;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        test.shouldWinHorizontalLineOne();
    }

    public void shouldWinHorizontalLineOne() {

        TicTacToe testWin = new TicTacToe();
        int[][] square = {{-1, -1, -1}, {-1, -1, -1,}, {-1, -1, -1}};

        square[0][0] = 1;
        square[1][0] = 1;
        square[2][0] = 1;

        boolean playerWin = testWin.isWinPositionForVerticals(square, 1);

        if (playerWin == true) {
            System.out.println("TicTacToeTest: OK");
        } else {
            System.out.println("TicTacToeTest: FAIL");
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
