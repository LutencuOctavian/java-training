package clean.code.chess.requirements.display;

import clean.code.chess.requirements.chess.ChessBoard;
import clean.code.chess.requirements.chess.piece.Piece;

import javax.swing.*;
import java.awt.*;

public class DisplayCheesBoard extends JPanel {
    private static int SQUAR_DIMENS = 40;
    private static int START_X = 250;
    private static int START_Y = 50;
    private static int CONTOUR = 15;
    private ChessBoard chessBoard;

    public DisplayCheesBoard(ChessBoard chessBoard){
        super();
        this.chessBoard=chessBoard;
    }

    public void paint(Graphics g) {
        int numberOfRow = ChessBoard.MAX_BOARD_HEIGHT;
        int numberOfColomns = ChessBoard.MAX_BOARD_WIDTH;
        int auxY = START_Y;
        int auxX;
        colorOrizontalBar(g, numberOfColomns, auxY);

        for (int i = 0; i < numberOfRow; ++i) {
            auxX = START_X;

            colorVerticalBar(g, auxX-CONTOUR, auxY, i, numberOfColomns);

            for (int j = 0; j < numberOfColomns; ++j) {
                if((i+j)%2==0){
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(auxX, auxY, SQUAR_DIMENS, SQUAR_DIMENS);
                }
                else{
                    g.setColor(Color.GRAY);
                    g.fillRect(auxX, auxY, SQUAR_DIMENS, SQUAR_DIMENS);
                }

                Piece piece=chessBoard.getPieces()[i][j];
                if(piece!=null){
                    g.drawImage(piece.getImage(),  auxX , auxY, this);
                }
                auxX += SQUAR_DIMENS;
            }
            colorVerticalBar(g, auxX, auxY, i, numberOfColomns+1);
            auxY += SQUAR_DIMENS;
        }
        colorOrizontalBar(g, numberOfColomns,  auxY+CONTOUR);
    }

    private void colorVerticalBar(Graphics g, int auxX, int auxY, int i, int numberOfColomns) {
        g.setColor(Color.GREEN);
        g.fillRect(auxX, auxY, CONTOUR, SQUAR_DIMENS);
        g.setColor(Color.black);
        g.drawString(String.valueOf(numberOfColomns-i), auxX+CONTOUR/3, auxY+SQUAR_DIMENS/2);
    }

    private void colorOrizontalBar(Graphics g, int numberOfColomns, int auxY) {
        char[] letters=new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        g.setColor(Color.GREEN);
        g.fillRect(START_X-CONTOUR, auxY-CONTOUR, SQUAR_DIMENS, CONTOUR);


        for (int i = 0; i < numberOfColomns; ++i) {
            g.fillRect(START_X+(i*SQUAR_DIMENS), auxY-CONTOUR, SQUAR_DIMENS, CONTOUR);
            g.setColor(Color.black);
            g.drawString(String.valueOf(letters[i]), START_X+(i*SQUAR_DIMENS)+SQUAR_DIMENS/2, auxY-CONTOUR/3);
            g.setColor(Color.GREEN);
        }
        g.fillRect(START_X+((numberOfColomns)*SQUAR_DIMENS), auxY-CONTOUR, CONTOUR, CONTOUR);
    }

    public void initialize(){
        JFrame frame = new JFrame();
        frame.setSize(850, 500);
        frame.setTitle("ChessBoard");
        frame.getContentPane().add(this);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
