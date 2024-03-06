package fc.java.course1.part5;

import fc.java.course1.model.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board board = new Board();

        board.setTitle("Avatar");

        System.out.println("board = " + board);
    }
}
