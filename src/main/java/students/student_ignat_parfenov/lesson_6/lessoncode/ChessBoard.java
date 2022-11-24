package students.student_ignat_parfenov.lesson_6.lessoncode;

public class ChessBoard {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "\u25A0"; //"White"
                } else {
                    chessBoard[i][j] = "\u25A1"; //"Black"
                }
            }
        }
        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard[row].length; col++) {
                System.out.print(chessBoard[row][col] + "\t");
            }
        }
    }
}

