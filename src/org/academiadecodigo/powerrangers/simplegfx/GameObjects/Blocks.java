package org.academiadecodigo.powerrangers.simplegfx.GameObjects;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Cell;


public class Blocks {

    private static final int PADDING = 10;
    public static final int CELLSIZE = 110;

    private Cell[][] cells;





    public static int colToX(int col) {
        return col * CELLSIZE + PADDING;
    }

    public static int rowToY(int row) {

        return row * CELLSIZE + PADDING;
    }



}

