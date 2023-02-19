package org.academiadecodigo.powerrangers.simplegfx.GameObjects;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Cell;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Random;

public class Flower {
    private Picture flower;
    public int flowersEaten;
    private String nextPicture = "Sakura/media/Flower/flower.png";
    public int col;
    public int row;
    public Cell cell;


    public Flower(int col, int row, String filepath){
        flowersEaten=0;
        this.flower = new Picture(col,row,filepath);
        flower.draw();
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

    public int getFlowersEaten() {
        return flowersEaten;
    }

    public void delete() {

        flower.delete();
        flowersEaten+=1;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1640);
        int rand_int2 = rand.nextInt(800);
        this.flower = new Picture(rand_int1,rand_int2,"Sakura/media/Flower/flower.png");
        flower.draw();

    }
}
