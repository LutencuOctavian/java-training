package clean.code.chess.requirements.chess.piece;

import clean.code.chess.requirements.chess.ChessBoard;

import java.awt.image.BufferedImage;

public abstract class Piece {
    protected static ChessBoard chessBoard;
    protected int xCoordinate;
    protected int yCoordinate;
    protected PieceColor pieceColor;

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.xCoordinate=-1;
        this.yCoordinate=-1;
    }

    public static ChessBoard getChessBoard() {
        return chessBoard;
    }

    public static void setChessBoard(ChessBoard chessBoard) {
        Piece.chessBoard = chessBoard;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public abstract BufferedImage getImage();

    public abstract void Move(MovementType movementType, int newX, int newY);

}
