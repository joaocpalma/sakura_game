package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Mcs;
import org.academiadecodigo.powerrangers.simplegfx.audio.Sound;

import java.sql.SQLOutput;
import java.util.LinkedList;

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

    /*public boolean isMcCollision(Mcs mc) {
        if ((hero.getMaxX() >=mc.getX()) && (hero.getX()<= mc.getMaxX())) {
            if ((hero.getMaxY() >=mc.getY()) && (hero.getY()<= mc.getMaxY())) {
                return true;
            }
        }
        return false;

    }*/

    }


