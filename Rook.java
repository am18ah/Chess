package com.company;

import java.awt.*;

public class Rook extends Piece {
    Rook(String c){
        type = "Rook";
        color = c;
    }

    @Override
    void move() {

    }

    @Override
    void draw(Graphics g, int s, int x, int y) {
        if (color.equals("Black"))
            g.setColor(new Color(0,0,0));
        else
            g.setColor(new Color(255, 255, 255 ));

        g.fillRect(s * x + (s/4), s * y + (s/4) - 10, 10, 10);
        g.fillRect(s * x + (s/4) + 15, s * y + (s/4) - 10, 10, 10);
        g.fillRect(s * x + (s/4), s * y + (s/4), 25, 25);
    }
}
