package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.MagicKeyboard.MagicKeyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;


public class Game {
    MagicKeyboard magicKeyboard = new MagicKeyboard();
    Hero hero;
    Picture lvl;
    Grid grid;
    StartScreen startScreen;
    GameOver gameOver;
    Background background;
    Picture flower;
    GameColision gameColision;
    private boolean start = false;


    /**
     * Start Game
     */
    public void init() {
        startScreen = new StartScreen();
        magicKeyboard.init();
        magicKeyboard.setStartScreen(startScreen);
        while (!startScreen.isGameStarted()){
            System.out.println("check is player press enter ");
            if(startScreen.isGameStarted2()){
                break;
            }
        }

        start();
    }

    /**
     * Game Over
     * */
    public void gameOver() {
        gameOver= new GameOver();
        magicKeyboard.init();
        magicKeyboard.setGameOver(gameOver);
        while (!gameOver.isGameOver()){
           System.out.println("PLAYER IS DEAD");
            if(gameOver.isGameOver2()){
                break;
            }
        }
        start();
    }

    public void start() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 1.jpg");
        lvl.draw();
        grid = new Grid(17,9);
        hero = new Hero(20,640,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");
        flower = new Picture(100,640,"Sakura/media/Flower/flower.png");
        flower.draw();

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);


        //gameColision.isFlowerCollision();


        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                gameOver();
                break;
            }
        }
        start2();
    }

    public void start2() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 2.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,200,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start3();
    }
    public void start3() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 3.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,310,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start4();
    }

    public void start4() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 4.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,310,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start5();

    }
    public void start5() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 5.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,310,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start6();
    }

    public void start6() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 6.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,310,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start7();
    }

    public void start7() {

        lvl = new Picture(0, 0, "Sakura/media/Level/Game Background level 6.jpg");
        lvl.draw();
        grid = new Grid(17,9);

        hero = new Hero(20,310,"media/Chars/Carlos/Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);
        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                break;
            }
        }
        start7();
    }

}
