package clean.code.chess.requirements.chess.piece;

import clean.code.chess.requirements.chess.ChessBoard;
import clean.code.chess.requirements.chess.piece.Piece;
import clean.code.chess.requirements.chess.piece.PieceColor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Rook extends Piece {
    private BufferedImage image;

    public Rook(PieceColor pieceColor) {
        super(pieceColor);
        try {
            if(pieceColor==PieceColor.WHITE){
                this.image= ImageIO.read(new File("turn_alb1.png"));
            }
            else{
                this.image= ImageIO.read(new File("turn_negru1.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ChessBoard getChessBoard() {
        return chessBoard;
    }

    public static void setChessBoard(ChessBoard chessBoard) {
        Piece.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public BufferedImage getImage() {
        return image;
    }

    @Override
    public void Move(MovementType movementType, int newX, int newY) {

    }
}
