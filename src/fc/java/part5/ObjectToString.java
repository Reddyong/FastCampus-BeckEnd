package fc.java.part5;

import fc.java.model.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board board = new Board();

        board.setTitle("Avatar");

        System.out.println("board = " + board);
    }
}
