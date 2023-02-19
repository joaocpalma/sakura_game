package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.MagicKeyboard.MagicKeyboard;
import org.academiadecodigo.powerrangers.simplegfx.audio.Sound;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Game {
    private MagicKeyboard magicKeyboard = new MagicKeyboard();
    private Hero hero;
    private Picture lvl;
    private StartScreen startScreen;
    private GameOver gameOver;
    private Flower flower;
    private Sound sound = new Sound();
    private GameColision gameColision;
    public final static String prefix = "";
    private boolean start = false;

    //private Mcs Mc;
    //private Mcs Mc1;

    /**
     * Game Over
     */
    public void gameOver() {

        sound.playMusic(2);
        gameOver = new GameOver();

        magicKeyboard.init();
        magicKeyboard.setGameOver(gameOver);
        while (!gameOver.isGameOver()) {
            System.out.println("PLAYER IS DEAD");
            if (gameOver.isGameOver2()) {
                break;
            }
        }
        sound.stopMusic();
        start();
    }

    /**
     * Start Game
     */
    public void init() {

        startScreen = new StartScreen();
        sound.playMusic(0);

        magicKeyboard.init();
        magicKeyboard.setStartScreen(startScreen);

        while (!startScreen.isGameStarted()) {
            System.out.println("check is player press enter ");
            if (startScreen.isGameStarted2()) {
                break;
            }
        }
        sound.stopMusic();
        start();
    }

    public void start() {
        lvl = new Picture(0, 0, prefix+"Game Background level 1.jpg");
        lvl.draw();
        sound.playMusic(1);

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");
        //Mc= new Mcs("Sakura/media/Moobs/Tsuru_-_Up_Wing_Left.png");
        //Mc1= new Mcs("Sakura/media/Moobs/Tsuru_-_Up_Wing_Left.png");

        flower = new Flower(400,640,prefix + "flower.png");


        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        /*TimerTask taskNew = new TimerTask() {
            public void run() {
                int xv=0;
                if (hero.getX()>=Mc.getX()){
                    Mc.changePicture("Sakura/media/Moobs/Tsuru_-_Up_Wing_Right.png");
                    xv=2;
                }else{
                    Mc.changePicture("Sakura/media/Moobs/Tsuru_-_Down_Wing_Left.png");
                    xv=-2;
                }

                int yv=0;
                if (hero.getY()>=Mc.getY()){
                    yv=2;
                }else{
                    yv=-2;
                }
                Mc.moveMc(xv,yv);

                if (hero.getX()>=Mc1.getX()){
                    Mc1.changePicture("Sakura/media/Moobs/Tsuru_-_Down_Wing_Right.png");
                    xv=2;
                }else{
                    Mc1.changePicture("Sakura/media/Moobs/Tsuru_-_Down_Wing_Left.png");
                    xv=-2;
                }


                if (hero.getY()>=Mc1.getY()){
                    yv=2;
                }else{
                    yv=-2;
                }
                Mc1.moveMc(xv,yv);
                gameColision = new GameColision(hero,flower);;
                if (gameColision.isMcCollision(Mc)) {
                    Mc.deleteMc();
                    Mc1.deleteMc();
                    hero.deleteHero();
                    lvl.delete();
                    gameOver();
                }
                gameColision = new GameColision(hero,flower);;
                if (gameColision.isMcCollision(Mc1)) {
                    Mc.deleteMc();
                    Mc1.deleteMc();
                    hero.deleteHero();
                    lvl.delete();
                    gameOver();
                }
            }
        };

        Timer timer = new Timer();
        timer.schedule(taskNew,35, 35);*/


        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                sound.stopMusic();
                sound.playSE(3);
                gameOver();
                break;
            }
        }
        start2();
    }

    public void start2() {

        lvl = new Picture(0, 0, prefix + "Game Background level 2.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");


        flower = new Flower(400,640, prefix + "flower.png");


        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start3();
    }

    public void start3() {

        lvl = new Picture(0, 0, prefix + "Game Background level 3.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");

        flower = new Flower(400,640,prefix + "flower.png");

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start4();
    }

    public void start4() {

        lvl = new Picture(0, 0, prefix + "Game Background level 4.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");

        flower = new Flower(400,640,prefix + "flower.png");

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start5();

    }

    public void start5() {

        lvl = new Picture(0, 0, prefix + "Game Background level 5.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");

        flower = new Flower(400,640,prefix + "flower.png");

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start6();
    }

    public void start6() {

        lvl = new Picture(0, 0, prefix + "Game Background level 6.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");

        flower = new Flower(400,640,prefix + "flower.png");

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start7();
    }

    public void start7() {

        lvl = new Picture(0, 0, prefix + "Game Background level 7.jpg");
        lvl.draw();

        hero = new Hero(200,340,prefix + "Char_Carlos_Front_Feet_Together.png");

        flower = new Flower(400,640,prefix + "flower.png");

        magicKeyboard.setHero(hero);
        magicKeyboard.setLvl(lvl);
        magicKeyboard.setFlower(flower);
        magicKeyboard.setGameOver2(this);

        while (hero.getX() != 1750){
            System.out.println("waiting for player");
            if(hero.getX() == 1850){
                System.out.println("GG");
                break;
            } else if (hero.getY() >= 950) {
                System.out.println("DEAD");
                hero.deleteHero();
                lvl.delete();
                gameOver();
                break;
            }
        }
        start8();
    }

    public void start8() {

        lvl = new Picture(0, 0, prefix + "Game Background level 8.jpg");
        lvl.draw();
        //grid = new Grid(17,9);

        hero = new Hero(20, 640, prefix + "Char_Carlos_Front_Feet_Together.png");

        magicKeyboard.setHero(hero);

        magicKeyboard.setLvl(lvl);

    }
}



