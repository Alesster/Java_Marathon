package day17;

public class ChessBoard {
    private String[][] board;

    public ChessBoard(String[][] board){
        this.board = board;
    }

    public void print(){
        for (int i = 0; i < board.length; i++) {
            for (String chess : board[i]) {
                System.out.print(chess + " ");
            }
            System.out.println();
        }
    }
}
