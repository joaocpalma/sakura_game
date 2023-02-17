package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    private static final int PADDING = 10;
    public static final int CELLSIZE = 110;
    private int cols;
    private int rows;

    private Cell[][] cells;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        cells = new Cell[cols][rows];

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                cells[col][row] = new Cell(col, row);
            }
        }
    }

    public Cell getCell(int col, int row) {
        return cells[col][row];
    }

    public String gridToString() {

        StringBuilder result = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // transform each cell into a string!
                if (getCell(col, row).isPainted()) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
        }

        return result.toString();
    }
    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public static int colToX(int col) {
        return col * CELLSIZE + PADDING;
    }

    public static int rowToY(int row) {
        return row * CELLSIZE + PADDING;
    }

    public void stringToGrid(String fileText) {

        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                Cell cell = getCell(col, row);

                if(fileText.charAt(index) == '1'){
                    cell.paint();
                } else {
                    cell.erase();
                }

                index++;

            }
        }
    }
}
