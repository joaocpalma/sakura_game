package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    private Rectangle rectangle;
    private boolean isPainted;

    public Cell(int col, int row) {
        this.rectangle = new Rectangle(Grid.colToX(col), Grid.rowToY(row), Grid.CELLSIZE, Grid.CELLSIZE);
        rectangle.draw();
    }

    public void paint() {
        rectangle.fill();
        isPainted = true;

    }

    public void erase() {
        rectangle.draw();
        isPainted = false;
    }

    public boolean isPainted() {
        return isPainted;
    }
}
