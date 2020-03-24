package com.company;
import java.awt.Graphics;

public abstract class Piece {
    String type, color;

    Piece(){
        type = "none";
        color = "Black";
    }

    abstract void move();
    abstract void draw(Graphics g, int s, int x, int y);
}
