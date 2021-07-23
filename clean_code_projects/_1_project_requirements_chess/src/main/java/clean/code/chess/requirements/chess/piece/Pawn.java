package clean.code.chess.requirements.chess.piece;

import clean.code.chess.requirements.chess.ChessBoard;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pawn extends Piece {
    private BufferedImage image;
    private boolean firstMove;

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
        this.firstMove=true;
            try {
                if(pieceColor==PieceColor.WHITE){
                    this.image= ImageIO.read(new File("pion_alb.png"));
                }
                else{
                    this.image= ImageIO.read(new File("pion_negru.png"));
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

        if(movementType.equals(MovementType.MOVE)){
            simpleMove(newX, newY);
        }else{
          //  attack(newX, newY);
        }



    }

    private void simpleMove(int newX, int newY) {
        Piece[][] chessBoard=Piece.getChessBoard().getPieces();
        int oldX=this.xCoordinate;
        int oldY=this.yCoordinate;
        Piece pawn=chessBoard[oldX][oldY];
        if(permisionForMove(newX)){
            chessBoard[oldX][oldY]=null;
            chessBoard[newX][newY]=pawn;
            pawn.setxCoordinate(newX);
            pawn.setyCoordinate(newY);
            return;
        }
        System.out.println("Illigal Move");

    }

    private boolean permisionForMove(int newX){
        int oldX=this.xCoordinate;

        if(newX==oldX-2 && firstMove){
            firstMove=false;
            return true;

        }else return newX == oldX - 1;
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
       // String eol = System.lineSeparator();
        return String.format("Current X: %d\nCurrent Y: %d\nPiece Color: %s", this.xCoordinate, this.yCoordinate, this.pieceColor);
    }
}
