package org.academiadecodigo.powerrangers.simplegfx.GameObjects;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Game;
import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Hero {
    private boolean isJumping = false;

    Flower flower;

    public Picture hero;
    int count = 0;
    private String nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png";
    private boolean direction = false;
    Grid grid;

    Game game;

    public Hero(int col, int row, String filepath) { // 778
        hero = new Picture(col, row, nextPicture);
        hero.draw();
    }

    public int getX() {
        return hero.getX();
    }

    public int getY() {
        return hero.getY();
    }

    public int getMaxX() {
        return hero.getMaxX();
    }

    public int getMaxY() {
        return hero.getMaxY();
    }

    public int  getIntermediateY() {
        return hero.getY() + grid.CELLSIZE;
    }

    //public int getLowerY() { return hero.getY() + (Scenary.PIXELS * 2); }
    public void moveRight() {
        if(direction){
            nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png";
            hero.load(nextPicture);
        }
        direction = false;
        if (hero.getMaxX() <= 1890) { //change 1920 to grid max width
            hero.translate(10, 0);
            if (hero.getX()>= 1870){
                hero.translate(-10,0);
            }

            count++;
            if (count == 5) {
                checkNextPicture(KeyboardEvent.KEY_D);
                hero.load(nextPicture);
                count = 0;
            }
        }
    }

    public void jump(){

        if (isJumping) {
            return;
        }
        isJumping = true;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int jumpDuration = 30; // adjust as needed
                int maxJumpHeight = 20; // adjust as needed
                int time = 3;
                while (time < jumpDuration) {
                    try {
                        Thread.sleep(16);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int jumpHeight = maxJumpHeight * time / jumpDuration;
                    hero.translate(0, -jumpHeight);
                    time += 1;
                }
                time =2;
                while (time < jumpDuration) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int jumpHeight = maxJumpHeight - maxJumpHeight * time / jumpDuration;
                    hero.translate(0, jumpHeight);
                    time += 1;
                }
                isJumping = false;
            }
        });
        thread.start();
    }

    public void moveLeft() {
        if(!direction){
            nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Back_Normal.png";
            hero.load(nextPicture);
        }
        direction = true;
        hero.translate(-10, 0);
        if (hero.getX() <= 0){
            hero.translate(10,0);
        }

        if (hero.getX() >= 0) {
            count++;
            if (count == 5) {
                checkNextPicture(KeyboardEvent.KEY_A);
                hero.load(nextPicture);
                count = 0;
            }
        }
    }

    public void moveUp()  {

        hero.translate(0, -10);
        if (hero.getY() <= 0){
            hero.translate(0,10);
            flower.delete();
        }
    }

    public void moveDown() {
        hero.translate(0, 10);
        if (hero.getY() >= 950){
            hero.translate(0,-10);
       }
    }

    public void checkNextPicture(int key) {
        if (key == KeyboardEvent.KEY_D) {
            if (nextPicture.equals("Sakura/media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png")) {
                nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos _Front_Normal.png";
            } else {
                nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png";
            }
        }
        if (key == KeyboardEvent.KEY_A) {
            if (nextPicture.equals("Sakura/media/Chars/Carlos/Char_Carlos_Back_Feet_Together.png")) {
                nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Back_Normal.png";
            } else {
                nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Back_Feet_Together.png";
            }
        }
    }


    public Picture getHero() {
        return hero;
    }
}








