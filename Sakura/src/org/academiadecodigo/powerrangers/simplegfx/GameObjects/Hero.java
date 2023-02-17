package org.academiadecodigo.powerrangers.simplegfx.GameObjects;

import org.academiadecodigo.powerrangers.simplegfx.gamemanager.Game;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Hero {
    boolean canJump;

    public void canJump(boolean x) {
        this.canJump=x;
    }

    boolean isfalling;
    int counter;

    public Picture hero;
    int count = 0;
    private String nextPicture = "Sakura/media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png";
    private boolean direction = false;

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
        for (int i = 0; i < 80; i++) {
            System.out.println("e");
        }

        /*try {
            Thread.sleep(30);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            if (canJump) {
                System.out.println("trying to jump");
                hero.translate(0, -1);
                //counter++;

            }
            if (isfalling) {
                hero.translate(0, 1);

            }

            if (i == 40) {
                canJump = false;
                isfalling = true;

            }
            if (i == 80) {
                isfalling = false;
                break;
            }
        }*/
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








