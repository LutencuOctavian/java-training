package clean.code.chess.requirements;

import clean.code.chess.requirements.chess.*;
import clean.code.chess.requirements.display.DisplayCheesBoard;
import clean.code.chess.requirements.chess.piece.*;

public class LunchApp{

    public static void main(String[] args) {

        ChessBoard chessBoard =new ChessBoard();
        Piece.setChessBoard(chessBoard);

        Piece pawnWhite1= new Pawn(PieceColor.WHITE);
        Piece pawnWhite2= new Pawn(PieceColor.WHITE);
        Piece pawnWhite3= new Pawn(PieceColor.WHITE);
        Piece pawnWhite4= new Pawn(PieceColor.WHITE);
        Piece pawnWhite5= new Pawn(PieceColor.WHITE);
        Piece pawnWhite6= new Pawn(PieceColor.WHITE);
        Piece pawnWhite7= new Pawn(PieceColor.WHITE);
        Piece pawnWhite8= new Pawn(PieceColor.WHITE);
        Piece pawnBlack1= new Pawn(PieceColor.BLACK);
        Piece pawnBlack2= new Pawn(PieceColor.BLACK);
        Piece pawnBlack3= new Pawn(PieceColor.BLACK);
        Piece pawnBlack4= new Pawn(PieceColor.BLACK);
        Piece pawnBlack5= new Pawn(PieceColor.BLACK);
        Piece pawnBlack6= new Pawn(PieceColor.BLACK);
        Piece pawnBlack7= new Pawn(PieceColor.BLACK);
        Piece pawnBlack8= new Pawn(PieceColor.BLACK);

        Piece knightWite1=new Knight(PieceColor.WHITE);
        Piece knightWite2=new Knight(PieceColor.WHITE);
        Piece knightBlack1=new Knight(PieceColor.BLACK);
        Piece knightBlack2=new Knight(PieceColor.BLACK);

        Piece rookWhite1=new Rook(PieceColor.WHITE);
        Piece rookWhite2=new Rook(PieceColor.WHITE);
        Piece rookBlack1=new Rook(PieceColor.BLACK);
        Piece rookBlack2=new Rook(PieceColor.BLACK);

        chessBoard.Add(pawnWhite1, 7, 1, PieceColor.WHITE);
        chessBoard.Add(pawnWhite2, 7, 2, PieceColor.WHITE);
        chessBoard.Add(pawnWhite3, 7, 3, PieceColor.WHITE);
        chessBoard.Add(pawnWhite4, 7, 4, PieceColor.WHITE);
        chessBoard.Add(pawnWhite5, 7, 5, PieceColor.WHITE);
        chessBoard.Add(pawnWhite6, 7, 6, PieceColor.WHITE);
        chessBoard.Add(pawnWhite7, 7, 7, PieceColor.WHITE);
        chessBoard.Add(pawnWhite8, 7, 8, PieceColor.WHITE);
        chessBoard.Add(pawnBlack1, 2, 1, PieceColor.BLACK);
        chessBoard.Add(pawnBlack2, 2, 2, PieceColor.BLACK);
        chessBoard.Add(pawnBlack3, 2, 3, PieceColor.BLACK);
        chessBoard.Add(pawnBlack4, 2, 4, PieceColor.BLACK);
        chessBoard.Add(pawnBlack5, 2, 5, PieceColor.BLACK);
        chessBoard.Add(pawnBlack6, 2, 6, PieceColor.BLACK);
        chessBoard.Add(pawnBlack7, 2, 7, PieceColor.BLACK);
        chessBoard.Add(pawnBlack8, 2, 8, PieceColor.BLACK);

        chessBoard.Add(knightWite1, 8, 2, PieceColor.BLACK);
        chessBoard.Add(knightWite2, 8, 7, PieceColor.BLACK);
        chessBoard.Add(knightBlack1, 1, 2, PieceColor.BLACK);
        chessBoard.Add(knightBlack2, 1, 7, PieceColor.BLACK);

        chessBoard.Add(rookWhite1, 8, 1, PieceColor.BLACK);
        chessBoard.Add(rookWhite2, 8, 8, PieceColor.BLACK);
        chessBoard.Add(rookBlack1, 1, 1, PieceColor.BLACK);
        chessBoard.Add(rookBlack2, 1, 8, PieceColor.BLACK);

        DisplayCheesBoard displayCheesBoard= new DisplayCheesBoard(chessBoard);
        displayCheesBoard.initialize();
    }
}
