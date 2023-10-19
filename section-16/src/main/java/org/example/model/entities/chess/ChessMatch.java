package org.example.model.entities.chess;

import org.example.model.entities.boardgame.Board;

public class ChessMatch {
    Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                chessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return chessPieces;
    }

}
