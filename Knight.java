package com.company;

import java.awt.*;

public class Knight extends Piece {
    Knight(String c){
        type = "Knight";
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

        g.fillRect(s * x + (s/4), s * y + (s/4) + 5, 25, 15);
        g.fillRect(s * x + (s/4)+ 5, s * y + (s/4) , 15, 25);
    }
}
