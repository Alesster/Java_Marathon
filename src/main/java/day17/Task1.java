package day17;

public class Task1 {
    public static void main(String[] args) {
        String[] chessList = new String[8];
        ChessPiece pawn = ChessPiece.PAWN_WHITE;
        ChessPiece rook = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < 4; i++) {
            chessList[i] = pawn.getFigure();
            chessList[i+4] = rook.getFigure();
        }

        for (String chess : chessList) {
            System.out.print(chess + " ");
        }


    }
}