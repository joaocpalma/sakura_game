package org.academiadecodigo.powerrangers.simplegfx.GameObjects;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Cell;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Flower {
    public Picture flower;

    private String nextPicture = "Sakura/media/Flower/flower.png";
    public int col;
    public int row;
    public Cell cell;


    public Flower(int col, int row, String filepath){
        this.flower = new Picture(col,row,filepath);

    }
    public void create(){
        flower.draw();
    }


    public int getX() {
        return flower.getX();
    }

    public int getY() {
        return flower.getY();
    }

    public int getMaxX() {
        return flower.getMaxX();
    }

    public int getMaxY() {
        return flower.getMaxY();
    }

    public void delete() {
        flower.delete();
    }
}
