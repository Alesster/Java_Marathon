package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        ChessPiece empty = ChessPiece.EMPTY;
        ChessPiece pawn_white = ChessPiece.PAWN_WHITE;
        ChessPiece pawn_black = ChessPiece.PAWN_BLACK;
        ChessPiece knight_black = ChessPiece.KNIGHT_BLACK;
        ChessPiece bishop_white = ChessPiece.BISHOP_WHITE;
        ChessPiece bishop_black = ChessPiece.BISHOP_BLACK;
        ChessPiece rook_black = ChessPiece.ROOK_BLACK;
        ChessPiece rook_white = ChessPiece.ROOK_WHITE;
        ChessPiece king_black = ChessPiece.KING_BLACK;
        ChessPiece king_white = ChessPiece.KING_WHITE;
        ChessPiece queen_white = ChessPiece.QUEEN_WHITE;
        ChessPiece queen_black = ChessPiece.QUEEN_BLACK;

        for (String[] row : board) {
            Arrays.fill(row, empty.getFigure());
        }
        board[0][0]= rook_black.getFigure();
        board[0][5]= rook_black.getFigure();
        board[0][6] = king_black.getFigure();

        board[1][1] = rook_white.getFigure();
        board[1][4] = pawn_black.getFigure();
        board[1][5] = pawn_black.getFigure();
        board[1][7] = pawn_black.getFigure();

        board[2][0] = pawn_black.getFigure();
        board[2][2] = knight_black.getFigure();
        board[2][6] = pawn_black.getFigure();

        board[3][0] = queen_black.getFigure();
        board[3][3] = bishop_white.getFigure();

        board[4][3] = bishop_black.getFigure();
        board[4][4] = pawn_white.getFigure();

        board[5][4] = bishop_white.getFigure();
        board[5][5] = pawn_white.getFigure();

        board[6][0] = pawn_white.getFigure();
        board[6][3] = queen_white.getFigure();
        board[6][5] = pawn_white.getFigure();
        board[6][7] = pawn_white.getFigure();

        board[7][5] = rook_white.getFigure();
        board[7][6] = king_white.getFigure();

        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
