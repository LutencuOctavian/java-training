package clean.code.chess.requirements.chess;

import clean.code.chess.requirements.chess.piece.Piece;
import clean.code.chess.requirements.chess.piece.PieceColor;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 8;
    public static int MAX_BOARD_HEIGHT = 8;

    private Piece[][] pieces;

    public ChessBoard() {
        pieces = new Piece[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void Add(Piece piece, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(! IsLegalBoardPosition(xCoordinate, yCoordinate)) return;

        pieces[xCoordinate-1][yCoordinate-1]=piece;
        piece.setxCoordinate(xCoordinate);
        piece.setyCoordinate(yCoordinate);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(1>xCoordinate || xCoordinate>8){
            return false;
        }
        if(1>yCoordinate || yCoordinate>8){
            return false;
        }
        return true;
    }
}
