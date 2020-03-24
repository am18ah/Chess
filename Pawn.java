package com.company;
import java.awt.*;
import java.awt.Color;

public class Pawn extends Piece {
    Pawn(String c) {
        type = "Pawn";
        color = c;
    }

    void move(){

    }

    void draw(Graphics g, int s, int x, int y){
        if (color.equals("Black"))
            g.setColor(new Color(0,0,0));
        else
            g.setColor(new Color(255, 255, 255 ));

        g.fillRect(s * x + (s/4), s * y + (s/4), 25, 25);
    }
}
