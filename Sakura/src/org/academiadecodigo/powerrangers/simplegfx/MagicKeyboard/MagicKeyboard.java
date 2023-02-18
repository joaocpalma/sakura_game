package org.academiadecodigo.powerrangers.simplegfx.MagicKeyboard;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.gamemanager.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MagicKeyboard implements KeyboardHandler {

    private Hero hero;
    private Keyboard keyboard;
    private Picture lvl;
    private StartScreen startScreen;
    private GameOver gameOver;

    private Grid grid;
    public Background background;
    public Picture flower;


    public void init() {
        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent startGame = new KeyboardEvent();
        startGame.setKey(KeyboardEvent.KEY_ENTER);
        startGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent gameOver = new KeyboardEvent();
        gameOver.setKey(KeyboardEvent.KEY_SPACE);
        gameOver.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent delete = new KeyboardEvent();
        delete.setKey(KeyboardEvent.KEY_L);
        delete.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(startGame);
        keyboard.addEventListener(gameOver);
        keyboard.addEventListener(delete);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        // Se o teclado não estiver bloqueado pode movimentar o hero

            switch (keyboardEvent.getKey()) {

                case KeyboardEvent.KEY_D:
                    hero.moveRight();
                    break;

                case KeyboardEvent.KEY_A:
                    hero.moveLeft();
                    break;

                case KeyboardEvent.KEY_W:
                    hero.moveUp();
                    break;

                case KeyboardEvent.KEY_S:
                    hero.moveDown();
                    break;

                case KeyboardEvent.KEY_ENTER:
                    startScreen.deleteStartScreen();
                    gameOver.deleteGameOver();
                    startScreen.setGameStarted2(true);
                    gameOver.setGameOver2(true);
                    break;

                case KeyboardEvent.KEY_SPACE:
                    hero.jump();
                    break;

                case KeyboardEvent.KEY_L:
                    flower.delete();
                    break;
            }
        }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setStartScreen(StartScreen startScreen) {
        this.startScreen = startScreen;
    }
    public void setGameOver(GameOver gameOver) {
        this.gameOver= gameOver;
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setLvl(Picture lvl) {
        this.lvl = lvl;
    }
}

