package com.company;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Boarder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // closes window
        frame.getContentPane().addMouseListener(new Listener());    // gets mouse information

        Board b = new Board();
        frame.add(b);

        frame.setSize(410, 435);
        frame.setVisible(true);
    }   // end main
}    // end board

class Board extends JPanel {
    private Piece[][] pieces =  {{new Rook("White"), new Pawn("White"), new Empty(), new Empty(), new Empty(),
                    new Empty(), new Pawn( "Black"), new Rook("Black")},
            {new Knight("White"),  new Pawn("White"),  new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn( "Black"), new Knight("Black")},
            {new Bishop("White"), new Pawn( "White"), new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn("Black"), new Bishop("Black")},
            {new King("White"), new Pawn( "White"),  new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn( "Black"), new Queen("Black")},
            {new Queen("White"), new Pawn( "White"),  new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn( "Black"), new King("Black")},
            {new Bishop("White"), new Pawn( "White"), new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn("Black"), new Bishop("Black")},
            {new Knight("White"), new Pawn("White"), new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn( "Black"), new Knight("Black")},
            {new Rook("White"), new Pawn("White"), new Empty(), new Empty(), new Empty(), new Empty(),
                    new Pawn( "Black"), new Rook("Black")}};

    Board() {

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        JButton button = new JButton("Push me");

        int x = 0, y = 0, SIZE = 50;
        Color dark = new Color(111, 38, 0 );
        Color light = new Color(255,205,153);
        g.setColor(dark);

        for (int i = 1; i < 65; i++) {  // printing the Board
            if (x == 0)
                switchColors(g, dark, light);

            switchColors(g, dark, light);

            g.fillRect(x, y, SIZE, SIZE);

            x += 50;
            if (i % 8 == 0){
                y += 50;
                x = 0;
            }
        }   // end for

        for (int i = 0; i < pieces.length; i++) {   // printing pieces
            for (int j = 0; j < pieces[i].length; j++) {
                pieces[i][j].draw(g, SIZE, i, j);
            }
        }
    }   // end paintComponent

    // changes the color form the current one to the other one
    private void switchColors(Graphics g, Color d, Color l){
        if (g.getColor().equals(d)){
            g.setColor(l);
        }
        else g.setColor(d);
    }
}

class Listener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked " + e.getX() + " and " + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged " + e.getX() + " and " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved " + e.getX() + " and " + e.getY());
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        System.out.println("Entered " + e.getX() + " and " + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        System.out.println("Exited " + e.getX() + " and " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        System.out.println("Pressed " + e.getX() + " and " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        System.out.println("Released " + e.getX() + " and " + e.getY());
    }


}