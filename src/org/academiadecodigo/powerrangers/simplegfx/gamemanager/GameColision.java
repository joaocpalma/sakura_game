package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.audio.Sound;

public class GameColision {

    public Hero hero;
    public boolean checkCollision = false;
    Flower flower;
    Sound sound = new Sound();
    Background background;
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


