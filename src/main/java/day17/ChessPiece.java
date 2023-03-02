package day17;

import java.io.PrintWriter;

public enum ChessPiece {
    KING_WHITE(100, "Kw"), KING_BLACK(100, "Kb"), QUEEN_WHITE(9, "Qw"), QUEEN_BLACK(9, "Qb"), ROOK_WHITE(5, "Rw"), ROOK_BLACK(5,"Rb"), BISHOP_WHITE(3.5f, "Bw"), BISHOP_BLACK(3.5f, "Bb"), KNIGHT_WHITE(3, "Hw"), KNIGHT_BLACK(3, "Hb"), PAWN_WHITE(1,"Pw"), PAWN_BLACK(1, "Pb"), EMPTY(-1, "_");

    private float value;
    private String figure;

    ChessPiece(float value, String figure){
        this.value = value;
        this.figure = figure;
    }

    public float getValue() {
        return value;
    }

    public String getFigure() {
        return figure;
    }
}
