package students.student_oskars_popens.lesson_6.level_5_level_6;

class TicTacToeTest {
    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void shouldBeWinHorizontals() {
        TicTacToe ttt = new TicTacToe();
        int[][] gameField =
                {{0, -1, -1},
                        {1, 1, 1},
                        {0, -1, 0}};

        checkTestResult(ttt.isWinPositionForHorizontals(gameField, 1),"Test winner for horizontals");
        checkTestResult(!ttt.isWinPositionForHorizontals(gameField, 0),"Test not winner for horizontals");
    }

    void shouldBeWinVerticals() {
        TicTacToe ttt = new TicTacToe();
        int[][] gameField =
                {{0, -1, -1},
                 {0, 1, 1},
                 {0, -1, 0}};

        checkTestResult(ttt.isWinPositionForVerticals(gameField, 0),"Test winner for verticals");
        checkTestResult(!ttt.isWinPositionForVerticals(gameField, 1),"Test not winner for verticals");
    }

    void shouldBeWinDiagonals() {
        TicTacToe ttt = new TicTacToe();
        int[][] gameField =
                {{1, -1, -1},
                 {0, 1, 1},
                 {0, -1, 1}};

        checkTestResult(ttt.isWinPositionForDiagonals(gameField, 1),"Test winner for diagonals");
        checkTestResult(!ttt.isWinPositionForDiagonals(gameField, 0),"Test not winner for diagonals");
    }

    void shouldBeWinPositions(){
        TicTacToe ttt = new TicTacToe();
        int[][] gameField =
                {{1, -1, -1},
                 {0, 1, 1},
                 {0, -1, 1}};

        checkTestResult(ttt.isWinPosition(gameField, 1),"Test winner for any position");
        checkTestResult(!ttt.isWinPosition(gameField, 0),"Test not winner for position");
    }

    void shouldBeDrawPositions(){
        TicTacToe ttt = new TicTacToe();
        int[][] gameField =
                {{1, 0, 1},
                 {1, 0, 0},
                 {0, 1, 1}};

        checkTestResult(ttt.isDrawPosition(gameField),"Test draw position");
    }

    void shouldCreateEmptyField(){
        TicTacToe ttt = new TicTacToe();
        int[][] field = ttt.createField();
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j]!=-1){
                    result = false;
                }
            }
        }
        checkTestResult(result, "Test create field");
    }

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.shouldBeWinHorizontals();
        ticTacToeTest.shouldBeWinVerticals();
        ticTacToeTest.shouldBeWinDiagonals();
        ticTacToeTest.shouldBeWinPositions();
        ticTacToeTest.shouldBeDrawPositions();
        ticTacToeTest.shouldCreateEmptyField();
    }
}
