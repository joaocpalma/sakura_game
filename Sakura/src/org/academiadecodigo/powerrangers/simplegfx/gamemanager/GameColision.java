package org.academiadecodigo.powerrangers.simplegfx.gamemanager;

import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Flower;
import org.academiadecodigo.powerrangers.simplegfx.GameObjects.Hero;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class GameColision {

    public Hero hero;
    public boolean checkCollision = false;
    Flower flower;

    Background background;
    public GameColision(Hero hero, Flower flower) {
        this.hero = hero;
        this.flower = flower;


    }

    public void isFlowerCollision() {
       // for (Flower flower: array) {
         //   background.setFlowers();

       /* if (((flower.getX() + flower.getMaxX()) / 2) >= hero.getX() && ((flower.getX() + flower.getMaxX()) / 2) <= hero.getMaxX()) {
            flower.delete();
            array.remove(flower);
        } else if (((flower.getY() + flower.getMaxY()) / 2) >= hero.getY() && ((flower.getY() + flower.getMaxY()) / 2) <= hero.getMaxY()) {
            flower.delete();
            array.remove(flower);
        } else if (((hero.getX() + hero.getMaxX()) / 2) >= flower.getX() && ((hero.getX() + hero.getMaxX()) / 2) <= flower.getMaxX()) {
            flower.delete();
            array.remove(flower);
        } else if (((hero.getY() + hero.getMaxY()) / 2) >= flower.getY() && ((hero.getY() + hero.getMaxY()) / 2) <= flower.getMaxY()) {
            flower.delete();
            array.remove(flower);
        }*/
            if((flower.getMaxX()== hero.getX())||(flower.getMaxY()==hero.getY())||(flower.getX()==hero.getMaxX())||(flower.getY()==hero.getMaxY())){
                flower.delete();
            }
            //check right side of hero
        /*if (((hero.getMaxX() - hero.getX())) == ((flower.getMaxX() - flower.getX()))) {
            flower.delete();

        } else {
            System.out.println("nao foi apagado");
        }*/


        }

    }

