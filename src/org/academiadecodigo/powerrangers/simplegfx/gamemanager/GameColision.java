package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.audio.Sound;

public class GameColision {

    private Hero hero;
    private boolean checkCollision = false;
    private Flower flower;
    private Sound sound = new Sound();
    private Background background;
    public GameColision(Hero hero, Flower flower) {
        this.hero = hero;
        this.flower = flower;


    }

    public void isFlowerCollision() {
        if ((hero.getMaxX() >=flower.getX()) && (hero.getX()<= flower.getMaxX())) {
            if ((hero.getMaxY() >=flower.getY()) && (hero.getY()<= flower.getMaxY())) {
                sound.playSE(4);
                flower.delete();
            }
        }

    }

    }


